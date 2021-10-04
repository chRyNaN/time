@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.Month
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * Known issues:
 * https://github.com/Kotlin/kotlinx-datetime/issues/67
 * https://github.com/Kotlin/kotlinx-datetime/issues/56
 *
 * Made this an expect/actual to attempt to overcome the limitations of those issues but ran into
 * limitations of the Java Time API not being available on older Android versions.
 */
@ExperimentalTime
internal expect fun convertDateTimeStringToInstant(value: String): Instant

@ExperimentalTime
val Instant.durationSinceEpoch: Duration
    get() = toEpochMilliseconds().milliseconds

@ExperimentalTime
fun Duration.toInstantSinceEpoch(): Instant =
    Instant.fromEpochMilliseconds(this.inWholeMilliseconds)

@ExperimentalTime
fun Long.toInstantFromMillisecondsSinceEpoch(): Instant = milliseconds.toInstantSinceEpoch()

@ExperimentalTime
infix fun Instant.durationTo(other: Instant): Duration =
    (other.toEpochMilliseconds() - toEpochMilliseconds()).milliseconds

/**
 * Retrieves the number of days in this month. The provided [isLeapYear] parameter is used to determine the amount of
 * days in the month of February.
 *
 * February has 28 days in a standard year and 29 days in a leap year.
 * April, June, September and November have 30 days.
 * All other months have 31 days.
 */
fun Month.days(isLeapYear: Boolean): Int =
    when (this) {
        Month.FEBRUARY -> if (isLeapYear) 29 else 28
        Month.APRIL,
        Month.JUNE,
        Month.SEPTEMBER,
        Month.NOVEMBER -> 30
        else -> 31
    }

/**
 * Retrieves the number of days in this month. The provided [year] parameter is used to determine the amount of days in
 * the month of February by determining whether the provided [year] is a leap year or not.
 *
 * February has 28 days in a standard year and 29 days in a leap year.
 * April, June, September and November have 30 days.
 * All other months have 31 days.
 */
fun Month.daysIn(year: Int): Int =
    days(isLeapYear = isLeapYear(year = year))

/**
 * Checks if the year is a leap year, according to the ISO proleptic
 * calendar system rules.
 * <p>
 * This method applies the current rules for leap years across the whole time-line.
 * In general, a year is a leap year if it is divisible by four without
 * remainder. However, years divisible by 100, are not leap years, with
 * the exception of years divisible by 400 which are.
 * <p>
 * For example, 1904 is a leap year it is divisible by 4.
 * 1900 was not a leap year as it is divisible by 100, however 2000 was a
 * leap year as it is divisible by 400.
 * <p>
 * The calculation is proleptic - applying the same rules into the far future and far past.
 * This is historically inaccurate, but is correct for the ISO-8601 standard.
 *
 * @return true if the year is leap, false otherwise
 */
fun isLeapYear(year: Int): Boolean =
    year and 3 == 0 && (year % 100 != 0 || year % 400 == 0)

/**
 * Retrieves the amount of days in the provided [year].
 *
 * @return the length of this year in days, 365 or 366 if it is a leap year.
 */
fun daysInYear(year: Int): Int =
    if (isLeapYear(year)) 366 else 365

@UnstableTimeApi
expect fun LocalDate.weekOfYear(locale: Locale): Int

@UnstableTimeApi
expect fun LocalDate.weekOfMonth(locale: Locale): Int

@UnstableTimeApi
fun LocalDateTime.weekOfYear(locale: Locale): Int =
    this.date.weekOfYear(locale = locale)

@UnstableTimeApi
fun LocalDateTime.weekOfMonth(locale: Locale): Int =
    this.date.weekOfMonth(locale = locale)
