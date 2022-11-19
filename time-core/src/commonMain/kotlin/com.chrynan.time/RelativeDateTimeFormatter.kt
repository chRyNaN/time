@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
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
 * A default [RelativeDateTimeFormatter] that uses the provided [todayDateTimeFormatter] to format times happening
 * today, the provided [futureDateTimeFormatter] to format times happening in the future after today, and the provided
 * [pastDurationFormatter] to display times that happened in the past. This implementation provides sensible defaults
 * for the English language.
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
    private val pastDurationFormatter: DurationFormatter = DurationFormatter { difference ->
        when {
            difference < 1.minutes -> {
                val value = difference.inWholeSeconds

                if (value == 1L) "$value second ago" else "$value seconds ago"
            }
            difference < 1.hours -> {
                val value = difference.inWholeMinutes

                if (value == 1L) "$value minute ago" else "$value minutes ago"
            }
            difference < 1.days -> {
                val value = difference.inWholeHours

                if (value == 1L) "$value hour ago" else "$value hours ago"
            }
            difference < 7.days -> {
                val value = difference.inWholeDays

                if (value == 1L) "$value day ago" else "$value days ago"
            }
            difference < 30.days -> {
                val value = difference.inWholeDays / 7

                if (value == 1L) "$value week ago" else "$value weeks ago"
            }
            difference < 365.days -> {
                val value = difference.inWholeDays / 30

                if (value == 1L) "$value month ago" else "$value months ago"
            }
            else -> {
                val value = difference.inWholeDays / 365

                if (value == 1L) "$value year ago" else "$value year ago"
            }
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
            pastDurationFormatter.invoke(fromInstant - toInstant)
        } else if (
            timeProvider.isTodayIn(timeZone = fromTimeZone, instant = fromInstant) &&
            timeProvider.isTodayIn(timeZone = toTimeZone, instant = toInstant)
        ) {
            todayDateTimeFormatter.invoke(value = toInstant, timeZone = toTimeZone)
        } else {
            futureDateTimeFormatter.invoke(value = toInstant, timeZone = toTimeZone)
        }

    private fun TimeProvider.isTodayIn(timeZone: TimeZone, instant: Instant): Boolean =
        isTodayIn(timeZone = timeZone, localDate = instant.toLocalDateTime(timeZone = timeZone).date)
}
