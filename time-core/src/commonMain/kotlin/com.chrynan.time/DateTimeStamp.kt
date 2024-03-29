@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlin.time.ExperimentalTime

/**
 * An instant in time. This can be either a UTC time [Instant] or a [LocalDateTime] for a
 * particular [TimeZone]. This sealed class encapsulates both possibilities.
 *
 * To create an instance of this [DateTimeStamp] class, use either one of the [DateTimeStamp] or [DateTimeStamp] functions.
 *
 * Events in the past are typically stored as [Instant]s which would correspond to the [Utc]
 * [DateTimeStamp], while events in the future (especially the far future) are typically stored as
 * [LocalDateTime] values along with their respective [TimeZone]s. This allows for properly
 * handling any volatile time changes (ex: daylight savings time). So this [DateTimeStamp] class is useful when you need to
 * represent both past and future events.
 *
 * To perform any operations on the [DateTimeStamp] class, first convert it to an [Instant] using the [toInstant] function.
 * Then it is trivial to convert it back into a [DateTimeStamp]. This avoids the needs of having duplicate functionality
 * for both types and reduces the possibility of errors.
 */
@Serializable
sealed class DateTimeStamp {

    abstract val value: Any
    abstract val timeZone: TimeZone

    /**
     * A [DateTimeStamp] whose [value] is represented as an [Instant]. This is particularly useful for representing past or
     * near-future time values.
     *
     * Note that the [timeZone] for this class will always be [TimeZone.UTC].
     *
     * Use the [DateTimeStamp] function to create an instance or this class.
     */
    @Serializable
    data class Utc internal constructor(@SerialName(value = "value") override val value: Instant) : DateTimeStamp() {

        @SerialName(value = "timezone")
        override val timeZone: TimeZone = TimeZone.UTC
    }

    /**
     * A [DateTimeStamp] whose [value] is represented as a [LocalDateTime] along with its associated [timeZone]. This is
     * particularly useful for representing future time values. Since there can be changes in time zones, such as
     * daylight savings time and when it is observed, it's best to store future time values as a [LocalDateTime] along
     * with its associated [TimeZone] value. This way it can easily be converted to an [Instant] when it needs to be
     * displayed in a UI and at that moment it will be correct. And if the observed daylight savings time changed, for
     * instance, the [Instant] can still be properly obtained via the [LocalDateTime] and [TimeZone] when it is next
     * loaded to be displayed in the UI.
     *
     * Note that there must be a [timeZone] value stored for this class, so the [timeZone] value will never be null.
     *
     * Use the [DateTimeStamp] to create an instance of this class.
     */
    @Serializable
    data class Local internal constructor(
        @SerialName(value = "value") override val value: LocalDateTime,
        @SerialName(value = "timezone") override val timeZone: TimeZone
    ) : DateTimeStamp()

    companion object
}

/**
 * Creates an instance of a [DateTimeStamp] with the provided [instant].
 *
 * @return The [DateTimeStamp.Utc] value created using the provided [instant].
 */
@Suppress("FunctionName")
fun DateTimeStamp(instant: Instant): DateTimeStamp.Utc = DateTimeStamp.Utc(value = instant)

/**
 * Creates an instance of a [DateTimeStamp] with the provided [localDateTime] and [timeZone] values.
 *
 * @return The [DateTimeStamp.Local] value created using the provided [localDateTime] and [timeZone] values.
 */
@Suppress("FunctionName")
fun DateTimeStamp(localDateTime: LocalDateTime, timeZone: TimeZone): DateTimeStamp.Local =
    DateTimeStamp.Local(value = localDateTime, timeZone = timeZone)

/**
 * Converts this [DateTimeStamp] into an [Instant]. This is useful for manipulation of the time value or displaying within
 * a UI.
 */
fun DateTimeStamp.toInstant(): Instant =
    when (this) {
        is DateTimeStamp.Utc -> value
        is DateTimeStamp.Local -> value.toInstant(timeZone = timeZone)
    }

/**
 * Converts this [Instant] to a [DateTimeStamp.Utc] instance.
 */
fun Instant.toDateTimeStamp(): DateTimeStamp.Utc = DateTimeStamp.Utc(value = this)

/**
 * Converts this [LocalDateTime] to a [DateTimeStamp.Local] instance.
 */
fun LocalDateTime.toDateTimeStamp(timeZone: TimeZone): DateTimeStamp.Local =
    DateTimeStamp.Local(value = this, timeZone = timeZone)

/**
 * Converts this [LocalDate] to a [DateTimeStamp.Local] instance for the start of the day time.
 *
 * @see [LocalDate.atStartOfDayIn]
 * @see [Instant.toLocalDateTime]
 */
fun LocalDate.toStartOfDayDateTimeStamp(timeZone: TimeZone): DateTimeStamp.Local =
    DateTimeStamp.Local(
        value = this.atStartOfDayIn(timeZone = timeZone).toLocalDateTime(timeZone = timeZone),
        timeZone = timeZone
    )

/**
 * Parses the ISO [String] [isoString] into a [DateTimeStamp] or throws an [IllegalArgumentException] if the value was not
 * in a supported ISO format. This function first attempts to parse the [isoString] as an [Instant] via the [Instant.parse]
 * function, if that fails, it will attempt to parse the [isoString] as a [LocalDateTime] via the [LocalDateTime.parse]
 * function. The result is then converted to a [DateTimeStamp]. In the case of an [Instant], this is converted to a
 * [DateTimeStamp] via the [Instant.toDateTimeStamp] function. In the case of a [LocalDateTime], this is converted to a
 * [DateTimeStamp] via the [LocalDateTime.toDateTimeStamp] using the provided [timeZone] value which defaults to
 * [TimeZone.UTC]. If the provided [String] [isoString] cannot be converted to a [DateTimeStamp], then an
 * [IllegalArgumentException] is thrown.
 *
 * @see [Instant.parse]
 * @see [LocalDateTime.parse]
 */
fun DateTimeStamp.Companion.parse(isoString: String, timeZone: TimeZone = TimeZone.UTC): DateTimeStamp =
    try {
        Instant.parse(isoString = isoString).toDateTimeStamp()
    } catch (_: Exception) {
        LocalDateTime.parse(isoString = isoString).toDateTimeStamp(timeZone = timeZone)
    }

/**
 * A convenience function for invoking the [DateTimeStamp.Companion.parse] function but returning `null` instead of
 * throwing an exception in the case of a parsing error.
 *
 * @see [DateTimeStamp.Companion.parse]
 */
fun DateTimeStamp.Companion.parseOrNull(isoString: String, timeZone: TimeZone = TimeZone.UTC): DateTimeStamp? =
    try {
        parse(isoString = isoString, timeZone = timeZone)
    } catch (_: Exception) {
        null
    }

/**
 * Similar to the [DateTimeStamp.Companion.parse] function but uses the [Instant.Companion.parseLenient] function
 * instead of [Instant.parse].
 *
 * @see [DateTimeStamp.Companion.parse]
 */
@ExperimentalTime
fun DateTimeStamp.Companion.parseLenient(isoString: String, timeZone: TimeZone = TimeZone.UTC): DateTimeStamp =
    try {
        Instant.parseLenient(isoString = isoString).toDateTimeStamp()
    } catch (_: Exception) {
        LocalDateTime.parse(isoString = isoString).toDateTimeStamp(timeZone = timeZone)
    }

/**
 * A convenience function for invoking the [DateTimeStamp.Companion.parseLenient] function but returning `null` instead
 * of throwing an exception in the case of a parsing error.
 *
 * @see [DateTimeStamp.Companion.parseLenient]
 */
@ExperimentalTime
fun DateTimeStamp.Companion.parseLenientOrNull(isoString: String, timeZone: TimeZone = TimeZone.UTC): DateTimeStamp? =
    try {
        parseLenient(isoString = isoString, timeZone = timeZone)
    } catch (_: Exception) {
        null
    }
