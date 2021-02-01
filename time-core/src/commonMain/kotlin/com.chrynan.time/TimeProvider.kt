package com.chrynan.time

import kotlinx.datetime.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

@ExperimentalTime
interface TimeProvider : TimeSource,
    Clock {

    companion object
}

@ExperimentalTime
internal class TimeProviderSource(
    timeSource: TimeSource = TimeSource.Monotonic,
    clock: Clock = Clock.System
) : TimeProvider,
    TimeSource by timeSource,
    Clock by clock

@ExperimentalTime
fun TimeProvider(
    timeSource: TimeSource = TimeSource.Monotonic,
    clock: Clock = Clock.System
): TimeProvider = TimeProviderSource(timeSource = timeSource, clock = clock)
