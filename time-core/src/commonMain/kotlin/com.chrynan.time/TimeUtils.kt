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
@ExperimentalTime
internal expect fun convertDateTimeStringToInstant(value: DateTimeString): Instant

@ExperimentalTime
val Instant.durationSinceEpoch: Duration
    get() = toEpochMilliseconds().milliseconds

@ExperimentalTime
fun Instant.toDateTimeStringFromDurationSinceEpoch(): DateTimeString = DateTimeString(toString())

@ExperimentalTime
fun Instant.toDateTimeLongFromDurationSinceEpoch(): DateTimeLong = toDateTimeLong()

@ExperimentalTime
fun Instant.toDateTimeLong(): DateTimeLong = DateTimeLong(toEpochMilliseconds())

@ExperimentalTime
fun Instant.toInstantPointInTime(): InstantPointInTime = InstantPointInTime(this)

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

@ExperimentalTime
fun Long.toDateTimeLongFromMillisecondsSinceEpoch(): DateTimeLong =
    Instant.fromEpochMilliseconds(this).toDateTimeLong()

@ExperimentalTime
fun LocalDateTime.toDateTimeStringFromDurationSinceEpoch(timeZone: TimeZone = TimeZone.currentSystemDefault()): DateTimeString =
    toInstant(timeZone).toDateTimeStringFromDurationSinceEpoch()

@ExperimentalTime
fun LocalDateTime.toDateTimeLongFromDurationSinceEpoch(timeZone: TimeZone = TimeZone.currentSystemDefault()): DateTimeLong =
    toInstant(timeZone).toDateTimeLongFromDurationSinceEpoch()

@ExperimentalTime
fun DateTimeString.toLocalDate(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDate =
    toInstant().toLocalDateTime(timeZone).date

@ExperimentalTime
fun DateTimeLong.toLocalDate(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDate =
    toInstant().toLocalDateTime(timeZone).date

@ExperimentalTime
fun LocalDate.toStartOfDayDateTimeString(timeZone: TimeZone = TimeZone.currentSystemDefault()): DateTimeString =
    this.atStartOfDayIn(timeZone).toDateTimeStringFromDurationSinceEpoch()

@ExperimentalTime
fun LocalDate.toStartOfDayDateTimeLong(timeZone: TimeZone = TimeZone.currentSystemDefault()): DateTimeLong =
    this.atStartOfDayIn(timeZone).toDateTimeLongFromDurationSinceEpoch()

@ExperimentalTime
fun Clock.nowDateTimeString(): DateTimeString = now().toDateTimeStringFromDurationSinceEpoch()

@ExperimentalTime
fun Clock.nowDateTimeLong(): DateTimeLong = now().toDateTimeLongFromDurationSinceEpoch()

@ExperimentalTime
fun Clock.nowInstantPointInTime(): InstantPointInTime = now().toInstantPointInTime()

@ExperimentalTime
infix fun Instant.durationTo(other: Instant): Duration =
    (other.toEpochMilliseconds() - toEpochMilliseconds()).milliseconds
