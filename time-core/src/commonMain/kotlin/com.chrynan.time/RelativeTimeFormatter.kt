@file:Suppress("unused")

package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * A Utility interface to format time values to UI text relative to the current time.
 */
@ExperimentalTime
interface RelativeTimeFormatter {

    fun formatPastRelativeToNow(pastTime: DateTimeString): CharSequence

    fun formatPastDurationRelativeToNow(pastDuration: Duration): CharSequence

    fun formatFutureRelativeToNow(futureTime: DateTimeString): CharSequence

    fun formatFutureDurationRelativeToNow(futureDuration: Duration): CharSequence

    fun formatElapsedTime(duration: Duration): CharSequence

    companion object
}
