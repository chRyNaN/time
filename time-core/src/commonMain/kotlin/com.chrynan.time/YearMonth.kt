@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month
import kotlin.time.ExperimentalTime

/**
 * A class representing an association between a [year] and a [month].
 */
@ExperimentalTime
data class YearMonth(
    val year: Year,
    val month: Month
)

/**
 * Adds the provided [amount] of months to this [YearMonth], incrementing (or decrementing if the [amount] is negative)
 * the year and month value as necessary.
 */
@ExperimentalTime
infix fun YearMonth.plusMonths(amount: Int): YearMonth {
    val months = Month.values()
    val monthIndex = months.indexOf(this.month) + amount

    val newYear = when {
        monthIndex > months.size && monthIndex < months.size -> this.year + (monthIndex / months.size)
        else -> this.year
    }

    val newMonth = months[monthIndex % months.size]

    return YearMonth(year = newYear, month = newMonth)
}

/**
 * Subtracts the provided [amount] of months to this [YearMonth], incrementing (or decrementing if the [amount] is
 * negative) the year and month value as necessary.
 */
@ExperimentalTime
infix fun YearMonth.minusMonths(amount: Int): YearMonth {
    val months = Month.values()
    val monthIndex = months.indexOf(this.month) - amount

    val newYear = when {
        monthIndex > months.size && monthIndex < months.size -> this.year + (monthIndex / months.size)
        else -> this.year
    }

    val newMonth = months[monthIndex % months.size]

    return YearMonth(year = newYear, month = newMonth)
}

/**
 * Adds the provided [amount] of year to this [YearMonth], incrementing (or decrementing if the [amount] is negative)
 * the year and month value as necessary.
 */
@ExperimentalTime
infix fun YearMonth.plusYears(amount: Int): YearMonth =
    YearMonth(year = year + amount, month = month)

/**
 * Subtracts the provided [amount] of years to this [YearMonth], incrementing (or decrementing if the [amount] is
 * negative) the year and month value as necessary.
 */
@ExperimentalTime
infix fun YearMonth.minusYears(amount: Int): YearMonth =
    YearMonth(year = year - amount, month = month)

/**
 * Retrieves the [LocalDate] within this [YearMonth.year] and [YearMonth.month] and the provided [dayOfMonth].
 *
 * @throws [IllegalArgumentException] if the provided [dayOfMonth] value is invalid for this [YearMonth].
 */
@ExperimentalTime
fun YearMonth.atDay(dayOfMonth: Int): LocalDate =
    LocalDate(year = year, month = month, dayOfMonth = dayOfMonth)

/**
 * Retrieves the first [LocalDate] within this [Year] and [Month].
 *
 * @see [Year.firstDateInMonth]
 */
@ExperimentalTime
val YearMonth.firstDate: LocalDate
    get() = year.firstDateInMonth(month)

/**
 * Retrieves the last [LocalDate] within this [Year] and [Month].
 *
 * @see [Year.lastDateInMonth]
 */
@ExperimentalTime
val YearMonth.lastDate: LocalDate
    get() = year.lastDateInMonth(month)
