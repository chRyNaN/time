package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
data class TimeOffset(
    val hours: Hours,
    val minutes: Minutes = Minutes(0)
) {

    val duration: Duration = hours.duration + minutes.duration
}