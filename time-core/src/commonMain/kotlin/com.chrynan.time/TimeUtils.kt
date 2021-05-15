@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import com.chrynan.time.milliseconds

/**
 * Known issues:
 * https://github.com/Kotlin/kotlinx-datetime/issues/67
 * https://github.com/Kotlin/kotlinx-datetime/issues/56
 *
 * Made this an expect/actual to attempt to overcome the limitations of those issues but ran into
 * limitations of the Java Time API not being available on older Android versions.
 */
expect fun DateTimeString.toInstant(): Instant

fun DateTimeLong.toInstant(): Instant = Instant.fromEpochMilliseconds(value)

@ExperimentalTime
val Instant.durationSinceEpoch: Duration
    get() = toEpochMilliseconds().milliseconds

fun Instant.toDateTimeStringFromDurationSinceEpoch(): DateTimeString = DateTimeString(toString())

fun Instant.toDateTimeLongFromDurationSinceEpoch(): DateTimeLong = toDateTimeLong()

fun Instant.toDateTimeLong(): DateTimeLong = DateTimeLong(toEpochMilliseconds())

@ExperimentalTime
val DateTimeString.durationSinceEpoch: Duration
    get() = toInstant().durationSinceEpoch

@ExperimentalTime
val DateTimeLong.durationSinceEpoch: Duration
    get() = toInstant().durationSinceEpoch

@ExperimentalTime
val DateTimeString.millisecondsSinceEpoch: Long
    get() = durationSinceEpoch.inWholeMilliseconds

@ExperimentalTime
val DateTimeLong.millisecondsSinceEpoch: Long
    get() = durationSinceEpoch.inWholeMilliseconds

@ExperimentalTime
fun Duration.toInstantSinceEpoch(): Instant = Instant.fromEpochMilliseconds(this.inWholeMilliseconds)

@ExperimentalTime
fun Long.toInstantFromMillisecondsSinceEpoch(): Instant = milliseconds.toInstantSinceEpoch()

@ExperimentalTime
fun Duration.toDateTimeStringFromDurationSinceEpoch(): DateTimeString = DateTimeString(toInstantSinceEpoch().toString())

@ExperimentalTime
fun Duration.toDateTimeLongFromDurationSinceEpoch(): DateTimeLong =
    DateTimeLong(toInstantSinceEpoch().toEpochMilliseconds())

@ExperimentalTime
fun Long.toDateTimeStringFromMillisecondsSinceEpoch(): DateTimeString =
    milliseconds.toDateTimeStringFromDurationSinceEpoch()

fun Long.toDateTimeLongFromMillisecondsSinceEpoch(): DateTimeLong =
    Instant.fromEpochMilliseconds(this).toDateTimeLong()

fun DateTimeString.toLocalDateTime(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDateTime =
    toInstant().toLocalDateTime(timeZone)

fun DateTimeLong.toLocalDateTime(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDateTime =
    toInstant().toLocalDateTime(timeZone)

fun LocalDateTime.toDateTimeStringFromDurationSinceEpoch(timeZone: TimeZone = TimeZone.currentSystemDefault()): DateTimeString =
    toInstant(timeZone).toDateTimeStringFromDurationSinceEpoch()

fun LocalDateTime.toDateTimeLongFromDurationSinceEpoch(timeZone: TimeZone = TimeZone.currentSystemDefault()): DateTimeLong =
    toInstant(timeZone).toDateTimeLongFromDurationSinceEpoch()

fun DateTimeString.toLocalDate(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDate =
    toInstant().toLocalDateTime(timeZone).date

fun DateTimeLong.toLocalDate(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDate =
    toInstant().toLocalDateTime(timeZone).date

fun LocalDate.toStartOfDayDateTimeString(timeZone: TimeZone = TimeZone.currentSystemDefault()): DateTimeString =
    this.atStartOfDayIn(timeZone).toDateTimeStringFromDurationSinceEpoch()

fun LocalDate.toStartOfDayDateTimeLong(timeZone: TimeZone = TimeZone.currentSystemDefault()): DateTimeLong =
    this.atStartOfDayIn(timeZone).toDateTimeLongFromDurationSinceEpoch()

fun Clock.nowDateTimeString(): DateTimeString = now().toDateTimeStringFromDurationSinceEpoch()

fun Clock.nowDateTimeLong(): DateTimeLong = now().toDateTimeLongFromDurationSinceEpoch()

fun DateTimeString.toDateTimeLong(): DateTimeLong = toInstant().toDateTimeLong()

fun DateTimeLong.toDateTimeString(): DateTimeString = toInstant().toDateTimeStringFromDurationSinceEpoch()

@ExperimentalTime
infix fun Instant.durationTo(other: Instant): Duration =
    (other.toEpochMilliseconds() - toEpochMilliseconds()).milliseconds

@ExperimentalTime
infix fun DateTimeString.durationTo(other: DateTimeString): Duration =
    (other.millisecondsSinceEpoch - millisecondsSinceEpoch).milliseconds

@ExperimentalTime
infix fun DateTimeLong.durationTo(other: DateTimeLong): Duration =
    (other.millisecondsSinceEpoch - millisecondsSinceEpoch).milliseconds

@ExperimentalTime
operator fun DateTimeString.compareTo(other: DateTimeString): Int =
    when {
        this.durationSinceEpoch < other.durationSinceEpoch -> -1
        this.durationSinceEpoch > other.durationSinceEpoch -> 1
        this.durationSinceEpoch == other.durationSinceEpoch -> 0
        else -> 0
    }

@ExperimentalTime
operator fun DateTimeLong.compareTo(other: DateTimeLong): Int =
    when {
        this.durationSinceEpoch < other.durationSinceEpoch -> -1
        this.durationSinceEpoch > other.durationSinceEpoch -> 1
        else -> 0
    }
