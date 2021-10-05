@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.Month
import kotlin.jvm.JvmInline
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * Represents a year in a light-weight and type safe value class.
 *
 * Note: This class contains no information about what type of calendar it belongs to. For example, this class provides
 * no notion of whether the year value represents a year in the Gregorian Calendar or another calendar system, such as
 * the Thai Calendar. However, most functions and properties operate on this class as if it were part of the Gregorian
 * Calendar. For instance, the [isBCE] property uses years before the [value] of zero as BCE.
 *
 * Note that this is not a duration, this does not represent an amount of years, but rather, represents an exact year
 * within a calendar.
 *
 * The reason for creating this wrapper value class was to provided type safety for operations that required a year,
 * such as the [isLeapYear] and [daysInYear] properties. Since the kotlinx datetime library doesn't provide a "Year"
 * concept, this was created in this library. Note however that this is an [ExperimentalTime] component and may be
 * removed or updated in the future.
 *
 * Note that for functions that take a [Year] as a parameter, there may be duplicates of those functions that take an
 * [Int] that represents a [Year]. This is done for convenience.
 *
 * Note: to perform arithmetic on the year, simply use the [Int] [value].
 *
 * @property [value] The [Int] value representing the year.
 */
@JvmInline
@ExperimentalTime
value class Year(val value: Int) : Comparable<Year> {

    override fun compareTo(other: Year): Int = value.compareTo(other.value)

    companion object
}

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
@ExperimentalTime
val Year.isLeapYear: Boolean
    get() = value and 3 == 0 && (value % 100 != 0 || value % 400 == 0)

/**
 * Retrieves the amount of days in this [Year].
 *
 * @return the length of this year in days, 365 or 366 if it is a leap year.
 */
@ExperimentalTime
val Year.daysInYear: Int
    get() = if (isLeapYear) 366 else 365

/**
 * Retrieves the [Duration] of this [Year] with day precision.
 *
 * This is equivalent to calling [Duration.days] with the [daysInYear] value.
 */
@ExperimentalTime
val Year.duration: Duration
    get() = Duration.Companion.days(daysInYear)

/**
 * Determines whether this [Year] is within the Before Christ Era, or any year less than zero. This is equivalent
 * to [isBCE]. Both properties are provided for convenience for usage depending on locality and personal preference.
 */
@ExperimentalTime
val Year.isBC: Boolean
    get() = value < 0

/**
 * Determines whether this [Year] is within the Before Common Era, or any year less than zero. This is equivalent
 * to [isBC]. Both properties are provided for convenience for usage depending on locality and personal preference.
 */
@ExperimentalTime
val Year.isBCE: Boolean
    get() = isBC

/**
 * Determines whether this [Year] is within the Anno Domini Era, or any year equal to one or greater. This is
 * equivalent to [isCE]. Both properties are provided for convenience for usage depending on locality and personal
 * preference.
 */
@ExperimentalTime
val Year.isAD: Boolean
    get() = value > 0

/**
 * Determines whether this [Year] is within the Common Era, or any year equal to one or greater. This is equivalent
 * to [isAD]. Both properties are provided for convenience for usage depending on locality and personal preference.
 */
@ExperimentalTime
val Year.isCE: Boolean
    get() = isAD

/**
 * Convenience function for creating a [LocalDate] using a [Year].
 *
 * @see [LocalDate]
 */
@ExperimentalTime
fun LocalDate(year: Year, month: Month, dayOfMonth: Int): LocalDate =
    LocalDate(year = year.value, month = month, dayOfMonth = dayOfMonth)

/**
 * Convenience function for creating a [LocalDate] using a [Year].
 *
 * @see [LocalDate]
 */
@ExperimentalTime
fun LocalDate(year: Year, monthNumber: Int, dayOfMonth: Int): LocalDate =
    LocalDate(year = year.value, monthNumber = monthNumber, dayOfMonth = dayOfMonth)

/**
 * Convenience function for creating a [LocalDateTime] using a [Year].
 *
 * @see [LocalDateTime]
 */
@ExperimentalTime
fun LocalDateTime(
    year: Year,
    monthNumber: Int,
    dayOfMonth: Int,
    hour: Int,
    minute: Int,
    second: Int,
    nanosecond: Int
): LocalDateTime =
    LocalDateTime(
        year = year.value,
        monthNumber = monthNumber,
        dayOfMonth = dayOfMonth,
        hour = hour,
        minute = minute,
        second = second,
        nanosecond = nanosecond
    )

/**
 * Convenience function for creating a [LocalDateTime] using a [Year].
 *
 * @see [LocalDateTime]
 */
@ExperimentalTime
fun LocalDateTime(
    year: Year,
    month: Month,
    dayOfMonth: Int,
    hour: Int,
    minute: Int,
    second: Int,
    nanosecond: Int
): LocalDateTime =
    LocalDateTime(
        year = year.value,
        month = month,
        dayOfMonth = dayOfMonth,
        hour = hour,
        minute = minute,
        second = second,
        nanosecond = nanosecond
    )
