@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * A component that formats a [Duration] into a [String] value that can be presented in a UI. This is similar to a
 * [DateTimeFormatter] but works with [Duration] values instead of [Instant]s.
 */
@ExperimentalTime
fun interface DurationFormatter {

    operator fun invoke(duration: Duration): String
}

/**
 * A default [DurationFormatter] implementation that converts a provided [Duration] value to a colon separated time
 * stamp [String]. For example, a duration of 1 hour, 30 minutes, and 10 seconds would be converted to the following
 * [String] value: "01:30:10". The resulting [String] value will:
 *     - Always have two digits for each part (ex: seconds), if a part value is less than ten, then a leading zero will
 *     be added so that it contains two digits.
 *     - Display at least two parts (minutes and seconds). If the provided [Duration] represents less than a minute, a
 *     part of "00" will be added for the minutes.
 *     - Display at most three parts (hours, minutes, and seconds) in this described format.
 *     - If the provided [Duration] exceeds 24 hours, then the resulting [String] value will be the result of
 *     [Duration.toString].
 */
@ExperimentalTime
class DefaultDurationTimeStampFormatter : DurationFormatter {

    override fun invoke(duration: Duration): String {
        val totalSeconds = duration.inWholeSeconds
        val totalMinutes = duration.inWholeMinutes
        val totalHours = duration.inWholeHours

        val secondsInMinute = totalSeconds % 60L
        val minutesInHour = totalMinutes % 60L

        return when {
            totalSeconds < 10L -> "00:0$totalSeconds"
            totalSeconds < 60L -> "00:$totalSeconds"
            totalMinutes < 10L && secondsInMinute < 10L -> "0$totalMinutes:0$secondsInMinute"
            totalMinutes < 10L -> "0$totalMinutes:$secondsInMinute"
            totalMinutes < 60L && secondsInMinute < 10L -> "$totalMinutes:0$secondsInMinute"
            totalMinutes < 60L -> "$totalMinutes:$secondsInMinute"
            totalHours < 10L && minutesInHour < 10L && secondsInMinute < 10L -> "0$totalHours:0$minutesInHour:0$secondsInMinute"
            totalHours < 10L && minutesInHour < 10L -> "0$totalHours:0$minutesInHour:$secondsInMinute"
            totalHours < 10L && secondsInMinute < 10L -> "0$totalHours:$minutesInHour:0$secondsInMinute"
            totalHours < 10L -> "0$totalHours:$minutesInHour:$secondsInMinute"
            totalHours < 24L && minutesInHour < 10L && secondsInMinute < 10L -> "$totalHours:0$minutesInHour:0$secondsInMinute"
            totalHours < 24L && minutesInHour < 10L -> "$totalHours:0$minutesInHour:$secondsInMinute"
            totalHours < 24L && secondsInMinute < 10L -> "$totalHours:$minutesInHour:0$secondsInMinute"
            totalHours < 24L -> "$totalHours:$minutesInHour:$secondsInMinute"
            else -> duration.toIsoString()
        }
    }
}
