@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import java.text.SimpleDateFormat
import java.time.temporal.WeekFields
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
actual fun convertDateTimeStringToInstant(value: String): Instant = try {
    Instant.parse(value)
} catch (exception: Exception) {
    try {
        val date = iso8601DateFormat.parse(value)

        Instant.fromEpochMilliseconds(date!!.time)
    } catch (exception: Exception) {
        val date = dateFormat.parse(value)

        Instant.fromEpochMilliseconds(date!!.time)
    }
}

fun Date.toKotlinInstant(): Instant = Instant.fromEpochMilliseconds(time)

@ExperimentalTime
fun Date.toUtcMillisSinceEpoch(): UtcMillisSinceEpoch =
    toKotlinInstant().toUtcMillisSinceEpoch()

fun Instant.toDate(): Date = Date(toEpochMilliseconds())

@ExperimentalTime
fun UtcMillisSinceEpoch.toDate(): Date = toInstant().toDate()

fun Date.toCalendar(): Calendar = Calendar.getInstance().apply { time = this@toCalendar }

fun Calendar.toDate(): Date = time

fun Instant.toCalendar(): Calendar = toDate().toCalendar()

fun Calendar.toKotlinInstant(): Instant = toDate().toKotlinInstant()

@ExperimentalTime
fun UtcMillisSinceEpoch.toCalendar(): Calendar = toDate().toCalendar()

@ExperimentalTime
fun Calendar.toUtcMillisSinceEpoch(): UtcMillisSinceEpoch = toDate().toUtcMillisSinceEpoch()

fun LocalDate.weekOfYear(locale: Locale = Locale.getDefault()): Int {
    val weekFields = WeekFields.of(locale)

    val javaLocalDate = java.time.LocalDate.of(year, month, dayOfMonth)

    return javaLocalDate.get(weekFields.weekOfYear())
}

fun LocalDateTime.weekOfYear(locale: Locale = Locale.getDefault()): Int =
    this.date.weekOfYear(locale = locale)

fun LocalDate.weekOfMonth(locale: Locale = Locale.getDefault()): Int {
    val weekFields = WeekFields.of(locale)

    val javaLocalDate = java.time.LocalDate.of(year, month, dayOfMonth)

    return javaLocalDate.get(weekFields.weekOfMonth())
}

fun LocalDateTime.weekOfMonth(locale: Locale = Locale.getDefault()): Int =
    this.date.weekOfMonth(locale = locale)
