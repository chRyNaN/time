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
) : Comparable<YearMonth> {

    override fun compareTo(other: YearMonth): Int =
        when {
            year == other.year && month == other.month -> 0
            year > other.year -> 1
            year == other.year && month > other.month -> 1
            else -> -1
        }

    companion object
}

@ExperimentalTime
class YearMonthRange internal constructor(
    override val start: YearMonth,
    override val endInclusive: YearMonth,
    private val stepMonths: Int = 1
) : ClosedRange<YearMonth>,
    Iterable<YearMonth> {

    override fun iterator(): Iterator<YearMonth> =
        YearMonthIterator(start = start, endInclusive = endInclusive, stepMonths = stepMonths)
}

@ExperimentalTime
class YearMonthIterator internal constructor(
    start: YearMonth,
    private val endInclusive: YearMonth,
    private val stepMonths: Int = 1
) : Iterator<YearMonth> {

    private var value: YearMonth = start

    override fun hasNext(): Boolean = value < endInclusive

    override fun next(): YearMonth {
        value = value plusMonths stepMonths

        return value
    }
}

@ExperimentalTime
operator fun YearMonth.rangeTo(other: YearMonth): YearMonthRange =
    YearMonthRange(start = this, endInclusive = other)

/**
 * Returns a range from this [YearMonth] up to but excluding the provided [to] [YearMonth] value. Each item in the
 * resulting [YearMonthRange] is incremented by one month.
 */
@ExperimentalTime
infix fun YearMonth.until(to: YearMonth): YearMonthRange =
    this..(to minusMonths 1)

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
