package com.chrynan.time

import kotlinx.datetime.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

/**
 * An extension interface of the [TimeSource] and [Clock] interfaces. This merges those interfaces into one
 * and provides the ability for additional functions to be added.
 */
@ExperimentalTime
interface TimeProvider : TimeSource,
    Clock {

    companion object
}

/**
 * An internal implementation of a [TimeProvider].
 *
 * Use the [TimeProvider] function to obtain an instance of this class.
 */
@ExperimentalTime
internal class TimeProviderSource(
    private val timeSource: TimeSource = TimeSource.Monotonic,
    private val clock: Clock = Clock.System
) : TimeProvider,
    TimeSource by timeSource,
    Clock by clock {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TimeProviderSource) return false

        if (timeSource != other.timeSource) return false
        if (clock != other.clock) return false

        return true
    }

    override fun hashCode(): Int {
        var result = timeSource.hashCode()
        result = 31 * result + clock.hashCode()
        return result
    }

    override fun toString(): String =
        "TimeProviderSource(timeSource=$timeSource, clock=$clock)"
}

/**
 * Creates a [TimeProvider] by delegating the [TimeSource] and [Clock] super interfaces to the provided
 * [timeSource] and [clock].
 */
@ExperimentalTime
fun TimeProvider(
    timeSource: TimeSource = TimeSource.Monotonic,
    clock: Clock = Clock.System
): TimeProvider = TimeProviderSource(timeSource = timeSource, clock = clock)
