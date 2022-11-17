@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * A Utility interface to format time values relative to each other, into a formatted [String].
 *
 * This component differs from the [DateTimeFormatter] in that it compares two sets of time values and outputs a
 * formatted [String] describing the relationship between those values (ex: "15 mins ago").
 */
@ExperimentalTime
fun interface RelativeDateTimeFormatter {

    operator fun invoke(
        fromInstant: Instant,
        fromTimeZone: TimeZone,
        toInstant: Instant,
        toTimeZone: TimeZone
    ): String

    companion object
}

/**
 * A default [RelativeDateTimeFormatter] that displays past times in a rough rounded text relative format
 * (ex: "2 weeks ago"), times today in a relative format (ex: "Today at 2pm"), and future times as specific date
 * times (ex: "Saturday, November 5th 12:30pm"). Note that this component won't format times to be perfectly exact and
 * that's okay.
 *
 * TODO: Update this to better support different languages.
 * TODO: Update to better handle singular and plurality.
 * TODO: Update to be more generic in wording (ex: "2 minutes ago" vs "2 min ago").
 */
@ExperimentalTime
class DefaultRelativeDateTimeFormatter(
    private val timeProvider: TimeProvider = TimeProvider(),
    private val todayDateTimeFormatter: DateTimeFormatter = DateTimeFormatter(format = "'Today at' hh:mma"),
    private val futureDateTimeFormatter: DateTimeFormatter = DateTimeFormatter(format = "EEE, MM dd yyyy hh:mma"),
    private val timeSpanFormatter: TimeSpanFormatter = TimeSpanFormatter { timeSpan, value ->
        when (timeSpan) {
            TimeSpan.SECOND -> if (value == 1L) "$value second ago" else "$value seconds ago"
            TimeSpan.MIN -> if (value == 1L) "$value minute ago" else "$value minutes ago"
            TimeSpan.HOUR -> if (value == 1L) "$value hour ago" else "$value hours ago"
            TimeSpan.DAY -> if (value == 1L) "$value day ago" else "$value days ago"
            TimeSpan.WEEK -> if (value == 1L) "$value week ago" else "$value weeks ago"
            TimeSpan.MONTH -> if (value == 1L) "$value month ago" else "$value months ago"
            TimeSpan.YEAR -> if (value == 1L) "$value year ago" else "$value year ago"
        }
    }
) : RelativeDateTimeFormatter {

    override fun invoke(
        fromInstant: Instant,
        fromTimeZone: TimeZone,
        toInstant: Instant,
        toTimeZone: TimeZone
    ): String =
        if (fromInstant > toInstant) {
            formatPastTime(fromInstant - toInstant)
        } else if (
            timeProvider.isTodayIn(timeZone = fromTimeZone, instant = fromInstant) &&
            timeProvider.isTodayIn(timeZone = toTimeZone, instant = toInstant)
        ) {
            todayDateTimeFormatter.invoke(value = toInstant, timeZone = toTimeZone)
        } else {
            futureDateTimeFormatter.invoke(value = toInstant, timeZone = toTimeZone)
        }

    private fun formatPastTime(
        difference: Duration
    ): String = when {
        difference < 1.hours -> timeSpanFormatter.format(timeSpan = TimeSpan.MIN, value = difference.inWholeMinutes)
        difference < 1.days -> timeSpanFormatter.format(timeSpan = TimeSpan.HOUR, value = difference.inWholeHours)
        difference < 7.days -> timeSpanFormatter.format(timeSpan = TimeSpan.DAY, value = difference.inWholeDays)
        difference < 30.days -> timeSpanFormatter.format(timeSpan = TimeSpan.WEEK, value = difference.inWholeDays / 7)
        difference < 365.days -> timeSpanFormatter.format(
            timeSpan = TimeSpan.MONTH,
            value = difference.inWholeDays / 30
        )
        else -> timeSpanFormatter.format(timeSpan = TimeSpan.YEAR, value = difference.inWholeDays / 365)
    }

    private fun TimeProvider.isTodayIn(timeZone: TimeZone, instant: Instant): Boolean =
        isTodayIn(timeZone = timeZone, localDate = instant.toLocalDateTime(timeZone = timeZone).date)

    enum class TimeSpan {

        SECOND,
        MIN,
        HOUR,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    fun interface TimeSpanFormatter {

        fun format(timeSpan: TimeSpan, value: Long): String
    }
}
