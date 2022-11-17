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

@ExperimentalTime
class DefaultDurationFormatter : DurationFormatter {

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
