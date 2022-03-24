package com.chrynan.time

import kotlin.js.Date
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@Suppress("unused")
@ExperimentalTime
// JavaScript doesn't seem to have a way to obtain the elapsed system time. So instead we just get the current Date
// instance to get the elapsed time since the epoch. This should be fine in most cases.
actual val TimeProvider.elapsedSystemTime: Duration
    get() = Date().getTime().milliseconds
