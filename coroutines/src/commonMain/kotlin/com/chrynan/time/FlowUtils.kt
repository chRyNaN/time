package com.chrynan.time

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.produceIn
import kotlinx.coroutines.isActive
import kotlinx.coroutines.withTimeout
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
@UseExperimental(ExperimentalTime::class)
fun intervalFlow(initialDelay: Duration = 0.milliseconds, period: Duration): Flow<Long> = channelFlow {
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
@UseExperimental(ExperimentalTime::class)
fun timerFlow(delay: Duration): Flow<Unit> = channelFlow {
    delay(delay)

    if (isActive) send(Unit)
}

/**
 * Retrieves a [Flow] of [Unit] that emits at the provided [moment] and then finishes.
 *
 * @param [moment] The [Moment] when the returned [Flow] should emit a [Unit] value then finish.
 * @param [timeProvider] The [TimeProvider] used to obtain the current [Moment].
 *
 * @author chRyNaN
 */
@UseExperimental(ExperimentalTime::class)
fun scheduleFlow(moment: Moment, timeProvider: TimeProvider): Flow<Unit> {
    val nowUtc = timeProvider.utc()

    val duration = nowUtc to moment

    return if (duration < 0.nanoseconds) {
        throw IllegalArgumentException("Moment provided to the scheduleFlow function must not be in the past.")
    } else {
        timerFlow(delay = duration)
    }
}

/**
 * Retrieves a [Flow] that emits the items of the source [Flow] but applies a timeout policy for each emitted item. If
 * the next item isn't emitted within the provided timeout [duration] starting from its predecessor, then the resulting
 * [Flow] terminates with a [TimeoutCancellationException] by throwing it as an error.
 *
 * @param [duration] The timeout [Duration].
 *
 * @author chRyNaN
 */
@UseExperimental(ExperimentalTime::class)
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
@UseExperimental(ExperimentalTime::class)
fun <T> Flow<T>.timedValue(): Flow<TimedValue<T>> = channelFlow {
    val channel = produceIn(this)

    while (isActive) {
        val timedValue = measureTimedValue { channel.receive() }

        send(timedValue)
    }
}