package com.chrynan.time

import kotlinx.datetime.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

@ExperimentalTime
interface TimeProvider : TimeSource,
    Clock
