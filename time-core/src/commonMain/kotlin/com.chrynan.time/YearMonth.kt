@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.Month
import kotlinx.datetime.number
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
 * Constructs a [YearMonth] with the provided [year] and [month] values.
 */
@ExperimentalTime
fun YearMonth(
    year: Int,
    month: Month
): YearMonth =
    YearMonth(year = Year(year), month = month)

/**
 * Adds the provided [amount] of months to this [YearMonth], incrementing (or decrementing if the [amount] is negative)
 * the year and month value as necessary.
 */
@ExperimentalTime
infix fun YearMonth.plusMonths(amount: Int): YearMonth {
    val totalCurrentMonths = (year.value * 12) + (month.number - 1)
    val totalMonths = totalCurrentMonths + amount
    val newYear = totalMonths.floorDiv(12)
    val newMonth = totalMonths.mod(12) + 1

    return YearMonth(year = newYear, month = Month(newMonth))
}

/**
 * Subtracts the provided [amount] of months to this [YearMonth], incrementing (or decrementing if the [amount] is
 * negative) the year and month value as necessary.
 */
@ExperimentalTime
infix fun YearMonth.minusMonths(amount: Int): YearMonth =
    plusMonths(amount = -amount)

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

/**
 * Retrieves the [YearMonth] instance for this [LocalDate].
 */
@ExperimentalTime
val LocalDate.yearMonth: YearMonth
    get() = YearMonth(year = year, month = month)

/**
 * Retrieves the [YearMonth] instance for this [LocalDateTime].
 */
@ExperimentalTime
val LocalDateTime.yearMonth: YearMonth
    get() = date.yearMonth
