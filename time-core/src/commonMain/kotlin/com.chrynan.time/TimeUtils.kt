@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds

/**
 * Known issues:
 * https://github.com/Kotlin/kotlinx-datetime/issues/67
 * https://github.com/Kotlin/kotlinx-datetime/issues/56
 *
 * Made this an expect/actual to attempt to overcome the limitations of those issues but ran into
 * limitations of the Java Time API not being available on older Android versions.
 */
expect fun DateTimeString.toInstant(): Instant

@ExperimentalTime
val Instant.durationSinceEpoch: Duration
    get() = toEpochMilliseconds().milliseconds

fun Instant.toDateTimeString(): DateTimeString = DateTimeString(toString())

@ExperimentalTime
val DateTimeString.durationSinceEpoch: Duration
    get() = toInstant().durationSinceEpoch

@ExperimentalTime
val DateTimeString.millisecondsSinceEpoch: Long
    get() = durationSinceEpoch.toLongMilliseconds()

@ExperimentalTime
fun Duration.toInstantSinceEpoch(): Instant = Instant.fromEpochMilliseconds(this.toLongMilliseconds())

@ExperimentalTime
fun Long.toInstantFromMillisecondsSinceEpoch(): Instant = milliseconds.toInstantSinceEpoch()

@ExperimentalTime
fun Duration.toDateTimeString(): DateTimeString = DateTimeString(toInstantSinceEpoch().toString())

@ExperimentalTime
fun Long.toDateTimeStringFromMillisecondsSinceEpoch(): DateTimeString = milliseconds.toDateTimeString()

fun DateTimeString.toLocalDateTime(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDateTime =
    toInstant().toLocalDateTime(timeZone)

fun LocalDateTime.toDateTimeString(timeZone: TimeZone = TimeZone.currentSystemDefault()): DateTimeString =
    toInstant(timeZone).toDateTimeString()

fun DateTimeString.toLocalDate(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDate =
    toInstant().toLocalDateTime(timeZone).date

fun LocalDate.toStartOfDayDateTimeString(timeZone: TimeZone = TimeZone.currentSystemDefault()): DateTimeString =
    this.atStartOfDayIn(timeZone).toDateTimeString()

fun Clock.nowDateTimeString(): DateTimeString = now().toDateTimeString()

@ExperimentalTime
operator fun DateTimeString.compareTo(other: DateTimeString): Int =
    when {
        this.durationSinceEpoch < other.durationSinceEpoch -> -1
        this.durationSinceEpoch > other.durationSinceEpoch -> 1
        this.durationSinceEpoch == other.durationSinceEpoch -> 0
        else -> 0
    }
