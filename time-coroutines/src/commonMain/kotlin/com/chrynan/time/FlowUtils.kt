@file:Suppress("unused")

package com.chrynan.time

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.datetime.Clock
import kotlin.time.*

/**
 * Retrieves a [Flow] of [Long] values starting with 0L after [initialDelay] followed by ever-increasing values,
 * incrementing by 1L, after each [period].
 *
 * @param [initialDelay] The initial delay [Duration] before emitting the first value of 0L.
 * @param [period] The [Duration] period to wait before emitting values after the first value is emitted.
 *
 * @author chRyNaN
 */
@ExperimentalCoroutinesApi
@ExperimentalTime
fun intervalFlow(initialDelay: Duration = 0.milliseconds, period: Duration): Flow<Long> =
    channelFlow {
        var count = 0L

        delay(initialDelay)

        while (isActive) {
            send(count)
            count += 1
            delay(period)
        }
    }

/**
 * Retrieves a [Flow] of [Unit] that emits after the provided [delay] and then finishes.
 *
 * @param [delay] The [Duration] to wait before emitting a [Unit] and then completing.
 *
 * @author chRyNaN
 */
@ExperimentalTime
@ExperimentalCoroutinesApi
fun timerFlow(delay: Duration): Flow<Unit> = channelFlow {
    delay(delay)

    if (isActive) send(Unit)
}

/**
 * Retrieves a [Flow] of [Unit] that emits at the provided [dateTime] and then finishes.
 *
 * @param [dateTime] The [UtcMillisSinceEpoch] when the returned [Flow] should emit a [Unit] value then finish.
 * @param [clock] The [Clock] used to obtain the current [UtcMillisSinceEpoch].
 *
 * @author chRyNaN
 */
@ExperimentalCoroutinesApi
@ExperimentalTime
fun scheduleFlow(dateTime: UtcMillisSinceEpoch, clock: Clock = Clock.System): Flow<Unit> {
    val nowUtc = clock.now().toUtcMillisSinceEpoch()

    val duration = nowUtc durationTo dateTime

    return if (duration < 0.nanoseconds) {
        throw IllegalArgumentException("DateTimeString provided to the scheduleFlow function must not be in the past. DateTimeString = $dateTime")
    } else {
        timerFlow(delay = duration)
    }
}

/**
 * A convenience function for calling [scheduleFlow] with a [TimeProvider].
 *
 * @see [scheduleFlow]
 */
@ExperimentalCoroutinesApi
@ExperimentalTime
fun scheduleFlow(dateTime: UtcMillisSinceEpoch, timeProvider: TimeProvider): Flow<Unit> =
    scheduleFlow(dateTime = dateTime, clock = timeProvider)

/**
 * Retrieves a [Flow] that emits the items of the source [Flow] but applies a timeout policy for each emitted item. If
 * the next item isn't emitted within the provided timeout [duration] starting from its predecessor, then the resulting
 * [Flow] terminates with a [TimeoutCancellationException] by throwing it as an error.
 *
 * @param [duration] The timeout [Duration].
 *
 * @author chRyNaN
 */
@ExperimentalCoroutinesApi
@FlowPreview
@ExperimentalTime
fun <T> Flow<T>.timeout(duration: Duration): Flow<T> = channelFlow {
    val channel = produceIn(this)

    while (isActive) {
        val item = withTimeout(duration) { channel.receive() }

        send(item)
    }
}

/**
 * Retrieves a [Flow] that emits the items of the source [Flow] wrapped in a [TimedValue] containing the elapsed time
 * interval duration between items being emitted.
 *
 * @author chRyNaN
 */
@ExperimentalCoroutinesApi
@FlowPreview
@ExperimentalTime
fun <T> Flow<T>.timedValue(): Flow<TimedValue<T>> = channelFlow {
    val channel = produceIn(this)

    while (isActive) {
        val timedValue = measureTimedValue { channel.receive() }

        send(timedValue)
    }
}

/**
 * A sealed class that indicates an approach to polling. Each approach determines how the upstream
 * and downstream behaves. The available strategies are [Latest], [Merge], and [Concat].
 */
@FlowPreview
sealed class PollingStrategy {

    /**
     * Equivalent to the [Flow.flatMapLatest] function.
     *
     * @see [flatMapLatest]
     */
    object Latest : PollingStrategy()

    /**
     * Equivalent to the [Flow.flatMapMerge] function.
     *
     * @property [limit] The amount of concurrently running flat-mapped [Flow]s. The default value
     * is set to [DEFAULT_CONCURRENCY].
     *
     * @see [flatMapMerge]
     */
    data class Merge(val limit: Int = DEFAULT_CONCURRENCY) : PollingStrategy()

    /**
     * Equivalent to the [Flow.flatMapConcat] function.
     *
     * @see [flatMapConcat]
     */
    object Concat : PollingStrategy()
}

/**
 * Polls the [Flow] retrieved via the provided [flowGetter] function, by invoking the [flowGetter]
 * function after the provided [initialDelay] and then consistently after the provided [period],
 * and using the provided polling [strategy].
 */
@FlowPreview
@ExperimentalCoroutinesApi
@ExperimentalTime
fun <T> poll(
    initialDelay: Duration = 0.seconds,
    period: Duration,
    strategy: PollingStrategy = PollingStrategy.Latest,
    flowGetter: suspend (Long) -> Flow<T>
): Flow<T> {
    val intervalFlow = intervalFlow(initialDelay = initialDelay, period = period)

    return when (strategy) {
        is PollingStrategy.Latest -> intervalFlow.flatMapLatest { flowGetter(it) }
        is PollingStrategy.Merge -> intervalFlow.flatMapMerge(concurrency = strategy.limit) {
            flowGetter(
                it
            )
        }
        is PollingStrategy.Concat -> intervalFlow.flatMapConcat { flowGetter(it) }
    }
}
