@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month
import kotlin.time.ExperimentalTime

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
@ExperimentalTime
fun Month.daysIn(year: Year): Int =
    days(isLeapYear = year.isLeapYear)

/**
 * Retrieves the number of days in this month. The provided [year] parameter is used to determine the amount of days in
 * the month of February by determining whether the provided [year] is a leap year or not.
 *
 * February has 28 days in a standard year and 29 days in a leap year.
 * April, June, September and November have 30 days.
 * All other months have 31 days.
 */
@ExperimentalTime
fun Month.daysIn(year: Int): Int =
    daysIn(year = Year(year))

/**
 * Retrieves a [List] of [LocalDate]s representing the days within this month in the provided [year].
 *
 * The resulting [List] should be ordered from first day of the month to the last day of the month. That is the
 * [LocalDate]s in the resulting [List] should be in ascending order based on their [LocalDate.dayOfMonth] value.
 */
@ExperimentalTime
fun Month.datesIn(year: Year): List<LocalDate> {
    val dayCount = daysIn(year)

    return (0 until dayCount).map {
        LocalDate(year = year.value, month = this, dayOfMonth = it + 1)
    }
}

/**
 * Retrieves a [List] of [LocalDate]s representing the days within this month in the provided [year].
 *
 * The resulting [List] should be ordered from first day of the month to the last day of the month. That is the
 * [LocalDate]s in the resulting [List] should be in ascending order based on their [LocalDate.dayOfMonth] value.
 */
@ExperimentalTime
fun Month.datesIn(year: Int): List<LocalDate> =
    datesIn(year = Year(year))
