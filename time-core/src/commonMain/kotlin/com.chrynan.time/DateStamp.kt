@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

/**
 * Represents a [LocalDate] and its associated [TimeZone]. This class represents a single day
 * without time information. This is similar to the [DateTimeStamp] class but without any associated
 * time data, since it represents the entire day.
 */
@Serializable
data class DateStamp(
    @SerialName(value = "date") val date: LocalDate,
    @SerialName(value = "timezone") val timeZone: TimeZone
)

/**
 * Converts this [LocalDate] to a [DateStamp]. This stores the associated [timeZone] with this [LocalDate] in a
 * [DateStamp] object.
 */
fun LocalDate.toDateStamp(timeZone: TimeZone): DateStamp =
    DateStamp(date = this, timeZone = timeZone)

/**
 * Converts this [LocalDateTime] to a [DateStamp] removing the time value associated with this [LocalDateTime].
 *
 * @see [LocalDate.toDateStamp]
 */
fun LocalDateTime.toDateStamp(timeZone: TimeZone): DateStamp =
    date.toDateStamp(timeZone = timeZone)

/**
 * Converts this [DateStamp] to an [Instant] at the start of this day.
 *
 * @see [LocalDate.atStartOfDayIn]
 */
fun DateStamp.toInstantAtStartOfDay(): Instant =
    date.atStartOfDayIn(timeZone = timeZone)

/**
 * Parses the ISO [String] [isoString] into a [DateStamp] or throws an [IllegalArgumentException] if the value was not in a
 * supported ISO format. This function first attempts to parse the [isoString] as a [LocalDate] via the [LocalDate.parse]
 * function, if that fails, it will attempt to parse the [isoString] as a [LocalDateTime] via the [LocalDateTime.parse]
 * function, and finally, if that fails, parse the [isoString] as an [Instant] via the [Instant.parse] function. The result
 * is then converted to a [DateStamp]. In the case of an [Instant], this is converted to a [DateStamp] via the
 * [Instant.toLocalDateTime] function followed by the [LocalDateTime.toDateStamp] function. In the case of a
 * [LocalDateTime], this is converted to a [DateStamp] via the [LocalDateTime.toDateStamp] function using the provided
 * [timeZone] value which defaults to [TimeZone.UTC]. In the case of a [LocalDate], this is converted to a [DateStamp]
 * via the [LocalDate.toDateStamp] function using the provided [timeZone] value which defaults to [TimeZone.UTC]. If
 * the provided [String] [isoString] cannot be converted to a [DateStamp], then an [IllegalArgumentException] is thrown.
 *
 * @see [LocalDate.parse]
 * @see [LocalDateTime.parse]
 * @see [Instant.parse]
 */
fun DateStamp.Companion.parse(isoString: String, timeZone: TimeZone = TimeZone.UTC): DateStamp =
    try {
        LocalDate.parse(isoString)
            .toDateStamp(timeZone = timeZone)
    } catch (_: Exception) {
        try {
            LocalDateTime.parse(isoString = isoString)
                .toDateStamp(timeZone = timeZone)
        } catch (_: Exception) {
            Instant.parse(isoString = isoString)
                .toLocalDateTime(timeZone = timeZone)
                .toDateStamp(timeZone = timeZone)
        }
    }

/**
 * A convenience function for invoking the [DateStamp.Companion.parse] function but returning `null` instead of
 * throwing an exception in the case of a parsing error.
 *
 * @see [DateStamp.Companion.parse]
 */
fun DateStamp.Companion.parseOrNull(isoString: String, timeZone: TimeZone = TimeZone.UTC): DateStamp? =
    try {
        parse(isoString = isoString, timeZone = timeZone)
    } catch (_: Exception) {
        null
    }

/**
 * Similar to the [DateStamp.Companion.parse] function but uses the [Instant.Companion.parseLenient] function instead
 * of [Instant.parse].
 *
 * @see [DateStamp.Companion.parse]
 */
@ExperimentalTime
fun DateStamp.Companion.parseLenient(isoString: String, timeZone: TimeZone = TimeZone.UTC): DateStamp =
    try {
        LocalDate.parse(isoString)
            .toDateStamp(timeZone = timeZone)
    } catch (_: Exception) {
        try {
            LocalDateTime.parse(isoString = isoString)
                .toDateStamp(timeZone = timeZone)
        } catch (_: Exception) {
            Instant.parseLenient(isoString = isoString)
                .toLocalDateTime(timeZone = timeZone)
                .toDateStamp(timeZone = timeZone)
        }
    }

/**
 * A convenience function for invoking the [DateStamp.Companion.parseLenient] function but returning `null` instead of
 * throwing an exception in the case of a parsing error.
 *
 * @see [DateStamp.Companion.parseLenient]
 */
@ExperimentalTime
fun DateStamp.Companion.parseLenientOrNull(isoString: String, timeZone: TimeZone = TimeZone.UTC): DateStamp? =
    try {
        parseLenient(isoString = isoString, timeZone = timeZone)
    } catch (_: Exception) {
        null
    }
