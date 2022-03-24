package com.chrynan.time

import kotlin.system.getTimeMillis
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@Suppress("unused")
@ExperimentalTime
actual val TimeProvider.elapsedSystemTime: Duration
    get() = getTimeMillis().milliseconds
