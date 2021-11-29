@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.Month
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

/**
 * A class representing an association between a [month] and a [dayOfMonth].
 */
@ExperimentalTime
@Serializable
data class MonthDay(
    @SerialName(value = "month") val month: Month,
    @SerialName(value = "day_of_month") val dayOfMonth: Int
) : Comparable<MonthDay> {

    init {
        require(dayOfMonth < 32) { "dayOfMonth for MonthDay must not exceed 31." }
        require(dayOfMonth > 0) { "dayOfMonth for MonthDay must be greater than 0." }
    }

    override fun compareTo(other: MonthDay): Int =
        when {
            month == other.month && dayOfMonth == other.dayOfMonth -> 0
            month > other.month -> 1
            month == other.month && dayOfMonth > other.dayOfMonth -> 1
            else -> -1
        }

    companion object
}

/**
 * Constructs a [YearMonth] with the provided [month] and [dayOfMonth] values.
 *
 * The provided [month] [Int] must be between 1 and 12, otherwise an exception is thrown.
 */
@ExperimentalTime
fun MonthDay(
    month: Int,
    dayOfMonth: Int
): MonthDay =
    MonthDay(month = Month(month), dayOfMonth = dayOfMonth)

/**
 * Retrieves the [LocalDate] within the provided [year] and this [MonthDay.month] and [MonthDay.dayOfMonth].
 *
 * @throws [IllegalArgumentException] if the [MonthDay.dayOfMonth] value is invalid for the provided [year].
 */
@ExperimentalTime
fun MonthDay.atYear(year: Year): LocalDate =
    LocalDate(year = year, month = month, dayOfMonth = dayOfMonth)

/**
 * Retrieves the [LocalDate] within the provided [year] and this [MonthDay.month] and [MonthDay.dayOfMonth].
 *
 * @throws [IllegalArgumentException] if the [MonthDay.dayOfMonth] value is invalid for the provided [year].
 */
@ExperimentalTime
fun MonthDay.atYear(year: Int): LocalDate =
    LocalDate(year = year, month = month, dayOfMonth = dayOfMonth)

/**
 * Checks if the year is valid for this month-day.
 */
@ExperimentalTime
fun MonthDay.isValidYear(year: Year): Boolean =
    try {
        atYear(year = year)
        true
    } catch (exception: IllegalArgumentException) {
        false
    }

/**
 * Checks if the year is valid for this month-day.
 */
@ExperimentalTime
fun MonthDay.isValidYear(year: Int): Boolean =
    try {
        atYear(year = year)
        true
    } catch (exception: IllegalArgumentException) {
        false
    }

/**
 * Retrieves the [MonthDay] instance for this [LocalDate].
 */
@ExperimentalTime
val LocalDate.monthDay: MonthDay
    get() = MonthDay(month = month, dayOfMonth = dayOfMonth)

/**
 * Retrieves the [MonthDay] instance for this [LocalDateTime].
 */
@ExperimentalTime
val LocalDateTime.monthDay: MonthDay
    get() = date.monthDay
