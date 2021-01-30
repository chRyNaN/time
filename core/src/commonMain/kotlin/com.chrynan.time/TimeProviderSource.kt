@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

@ExperimentalTime
class TimeProviderSource(
    private val timeSource: TimeSource,
    private val clock: Clock
) : TimeProvider,
    TimeSource by timeSource,
    Clock by clock
