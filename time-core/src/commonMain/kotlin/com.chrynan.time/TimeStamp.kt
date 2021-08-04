@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * An instant in time. This can be either a UTC time [Instant] or a [LocalDateTime] for a
 * particular [TimeZone]. This sealed class encapsulates both possibilities.
 *
 * Events in the past are typically stored as [Instant]s which would correspond to the [Utc]
 * [TimeStamp], while events in the future (especially the far future) are typically stored as
 * [LocalDateTime] values along with their respective [TimeZone]s. This allows for properly
 * handling any volatile time changes (ex: daylight savings time).
 */
@Serializable
sealed class TimeStamp {

    abstract val value: Any

    @Serializable
    data class Utc(@SerialName(value = "value") override val value: Instant) : TimeStamp()

    @Serializable
    data class Local(
        @SerialName(value = "value") override val value: LocalDateTime,
        @SerialName(value = "timezone") val timeZone: TimeZone
    ) : TimeStamp()
}

@ExperimentalTime
val TimeStamp.durationSinceEpoch: Duration
    get() = toInstant().toEpochMilliseconds().milliseconds

fun TimeStamp.toEpochMilliseconds(): Long = toInstant().toEpochMilliseconds()

fun TimeStamp.toInstant(): Instant =
    when (this) {
        is TimeStamp.Utc -> value
        is TimeStamp.Local -> value.toInstant(timeZone = timeZone)
    }

fun Instant.toTimeStamp(): TimeStamp.Utc = TimeStamp.Utc(value = this)

fun LocalDateTime.toTimeStamp(timeZone: TimeZone): TimeStamp.Local =
    TimeStamp.Local(value = this, timeZone = timeZone)

@ExperimentalTime
fun TimeStamp.toUtcMillisSinceEpoch(): UtcMillisSinceEpoch =
    when (this) {
        is TimeStamp.Utc -> value.toUtcMillisSinceEpoch()
        is TimeStamp.Local -> value.toUtcMillisSinceEpoch(timeZone = timeZone)
    }

@ExperimentalTime
fun UtcMillisSinceEpoch.toTimeStamp(): TimeStamp.Utc =
    TimeStamp.Utc(value = toInstant())

operator fun TimeStamp.compareTo(other: TimeStamp): Int =
    toInstant().compareTo(other = other.toInstant())

operator fun TimeStamp.compareTo(other: Instant): Int = toInstant().compareTo(other = other)

operator fun Instant.compareTo(other: TimeStamp): Int = compareTo(other = other.toInstant())

@ExperimentalTime
operator fun TimeStamp.compareTo(other: UtcMillisSinceEpoch): Int =
    toInstant().compareTo(other = other.toInstant())

@ExperimentalTime
operator fun UtcMillisSinceEpoch.compareTo(other: TimeStamp): Int =
    toInstant().compareTo(other = other.toInstant())

@ExperimentalTime
operator fun TimeStamp.plus(other: Duration): TimeStamp =
    (toUtcMillisSinceEpoch() + other.toUtcMillisSinceEpoch()).toTimeStamp()

@ExperimentalTime
operator fun TimeStamp.minus(other: Duration): TimeStamp =
    (toUtcMillisSinceEpoch() - other.toUtcMillisSinceEpoch()).toTimeStamp()

@ExperimentalTime
operator fun Duration.plus(other: TimeStamp): TimeStamp =
    (inWholeMilliseconds + other.toUtcMillisSinceEpoch()).toTimeStamp()

@ExperimentalTime
operator fun Duration.minus(other: TimeStamp): TimeStamp =
    (inWholeMilliseconds - other.toUtcMillisSinceEpoch()).toTimeStamp()

@ExperimentalTime
fun Clock.nowTimeStamp(): TimeStamp = now().toTimeStamp()

@ExperimentalTime
infix fun TimeStamp.durationTo(other: TimeStamp): Duration =
    other.durationSinceEpoch - durationSinceEpoch
