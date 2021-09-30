@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

/**
 * An instant in time. This can be either a UTC time [Instant] or a [LocalDateTime] for a
 * particular [TimeZone]. This sealed class encapsulates both possibilities.
 *
 * To create an instance of this [TimeStamp] class, use either one of the [TimeStamp] or [TimeStamp] functions.
 *
 * Events in the past are typically stored as [Instant]s which would correspond to the [Utc]
 * [TimeStamp], while events in the future (especially the far future) are typically stored as
 * [LocalDateTime] values along with their respective [TimeZone]s. This allows for properly
 * handling any volatile time changes (ex: daylight savings time). So this [TimeStamp] class is useful when you need to
 * represent both past and future events.
 *
 * To perform any operations on the [TimeStamp] class, first convert it to an [Instant] using the [toInstant] function.
 * Then it is trivial to convert it back into a [TimeStamp]. This avoids the needs of having duplicate functionality
 * for both types and reduces the possibility of errors.
 */
@Serializable
sealed class TimeStamp {

    abstract val value: Any
    abstract val timeZone: TimeZone?

    /**
     * A [TimeStamp] whose [value] is represented as an [Instant]. This is particularly useful for representing past or
     * near-future time values.
     *
     * Note that there is no [timeZone] stored for this class, so the [timeZone] value will always be null.
     */
    @Serializable
    data class Utc internal constructor(@SerialName(value = "value") override val value: Instant) : TimeStamp() {

        override val timeZone: TimeZone? = null
    }

    /**
     * A [TimeStamp] whose [value] is represented as a [LocalDateTime] along with its associated [timeZone]. This is
     * particularly useful for representing future time values. Since there can be changes in time zones, such as
     * daylight savings time and when it is observed, it's best to store future time values as a [LocalDateTime] along
     * with its associated [TimeZone] value. This way it can easily be converted to an [Instant] when it needs to be
     * displayed in a UI and at that moment it will be correct. And if the observed daylight savings time changed, for
     * instance, the [Instant] can still be properly obtained via the [LocalDateTime] and [TimeZone] when it is next
     * loaded to be displayed in the UI.
     *
     * Note that there must be a [timeZone] value stored for this class, so the [timeZone] value will never be null.
     */
    @Serializable
    data class Local internal constructor(
        @SerialName(value = "value") override val value: LocalDateTime,
        @SerialName(value = "timezone") override val timeZone: TimeZone
    ) : TimeStamp()

    companion object
}

/**
 * Creates an instance of a [TimeStamp] with the provided [instant].
 *
 * @return The [TimeStamp.Utc] value created using the provided [instant].
 */
@Suppress("FunctionName")
fun TimeStamp(instant: Instant): TimeStamp.Utc = TimeStamp.Utc(value = instant)

/**
 * Creates an instance of a [TimeStamp] with the provided [localDateTime] and [timeZone] values.
 *
 * @return The [TimeStamp.Local] value created using the provided [localDateTime] and [timeZone] values.
 */
@Suppress("FunctionName")
fun TimeStamp(localDateTime: LocalDateTime, timeZone: TimeZone): TimeStamp.Local =
    TimeStamp.Local(value = localDateTime, timeZone = timeZone)

/**
 * Converts this [TimeStamp] into an [Instant]. This is useful for manipulation of the time value or displaying within
 * a UI.
 */
fun TimeStamp.toInstant(): Instant =
    when (this) {
        is TimeStamp.Utc -> value
        is TimeStamp.Local -> value.toInstant(timeZone = timeZone)
    }

/**
 * Converts this [Instant] to a [TimeStamp.Utc] instance.
 */
fun Instant.toTimeStamp(): TimeStamp.Utc = TimeStamp.Utc(value = this)

/**
 * Converts this [LocalDateTime] to a [TimeStamp.Local] instance.
 */
fun LocalDateTime.toTimeStamp(timeZone: TimeZone): TimeStamp.Local =
    TimeStamp.Local(value = this, timeZone = timeZone)
