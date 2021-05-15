@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import java.text.SimpleDateFormat
import java.util.*
import kotlin.time.ExperimentalTime

private val utcTimezone = TimeZone.getTimeZone("UTC")

private val iso8601DateFormat: SimpleDateFormat
    get() = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.getDefault()).apply {
        timeZone = utcTimezone
    }

private val dateFormat: SimpleDateFormat
    get() = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).apply {
        timeZone = utcTimezone
    }

/**
 * Known issues:
 * https://github.com/Kotlin/kotlinx-datetime/issues/67
 * https://github.com/Kotlin/kotlinx-datetime/issues/56
 */
@ExperimentalTime
actual fun convertDateTimeStringToInstant(value: DateTimeString): Instant = try {
    Instant.parse(value.value)
} catch (exception: Exception) {
    try {
        val date = iso8601DateFormat.parse(value.value)

        Instant.fromEpochMilliseconds(date.time)
    } catch (exception: Exception) {
        val date = dateFormat.parse(value.value)

        Instant.fromEpochMilliseconds(date.time)
    }
}

fun Date.toKotlinInstant(): Instant = Instant.fromEpochMilliseconds(time)

@ExperimentalTime
fun Date.toDateTimeString(): DateTimeString = toKotlinInstant().toDateTimeStringFromDurationSinceEpoch()

@ExperimentalTime
fun Date.toDateTimeLong(): DateTimeLong = toKotlinInstant().toDateTimeLongFromDurationSinceEpoch()

fun Instant.toDate(): Date = Date(toEpochMilliseconds())

@ExperimentalTime
fun DateTimeString.toDate(): Date = toInstant().toDate()

@ExperimentalTime
fun DateTimeLong.toDate(): Date = toInstant().toDate()

fun Date.toCalendar(): Calendar = Calendar.getInstance().apply { time = this@toCalendar }

fun Calendar.toDate(): Date = time

fun Instant.toCalendar(): Calendar = toDate().toCalendar()

fun Calendar.toKotlinInstant(): Instant = toDate().toKotlinInstant()

@ExperimentalTime
fun DateTimeString.toCalendar(): Calendar = toDate().toCalendar()

@ExperimentalTime
fun DateTimeLong.toCalendar(): Calendar = toDate().toCalendar()

@ExperimentalTime
fun Calendar.toDateTimeString(): DateTimeString = toDate().toDateTimeString()

@ExperimentalTime
fun Calendar.toDateTimeLong(): DateTimeLong = toDate().toDateTimeLong()
