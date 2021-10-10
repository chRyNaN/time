@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a [LocalDate] and its associated [TimeZone]. This class represents a single day
 * without time information. This is similar to the [TimeStamp] class but without any associated
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
