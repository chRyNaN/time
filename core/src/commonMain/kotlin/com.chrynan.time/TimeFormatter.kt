@file:Suppress("unused")

package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

interface TimeFormatter {

    fun formatPastRelativeToNow(pastTime: DateTimeString): CharSequence

    @ExperimentalTime
    fun formatPastDurationRelativeToNow(pastDuration: Duration): CharSequence

    fun formatFutureRelativeToNow(futureTime: DateTimeString): CharSequence

    @ExperimentalTime
    fun formatFutureDurationRelativeToNow(futureDuration: Duration): CharSequence

    @ExperimentalTime
    fun formatElapsedTime(duration: Duration): CharSequence
}
