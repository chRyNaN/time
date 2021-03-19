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
    timeSource: TimeSource = TimeSource.Monotonic,
    clock: Clock = Clock.System
) : TimeProvider,
    TimeSource by timeSource,
    Clock by clock

/**
 * Creates a [TimeProvider] by delegating the [TimeSource] and [Clock] super interfaces to the provided
 * [timeSource] and [clock].
 */
@ExperimentalTime
fun TimeProvider(
    timeSource: TimeSource = TimeSource.Monotonic,
    clock: Clock = Clock.System
): TimeProvider = TimeProviderSource(timeSource = timeSource, clock = clock)
