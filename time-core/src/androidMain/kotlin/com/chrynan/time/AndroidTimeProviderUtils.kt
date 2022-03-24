package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@Suppress("unused")
@ExperimentalTime
actual val TimeProvider.elapsedSystemTime: Duration
    get() = System.currentTimeMillis().milliseconds
