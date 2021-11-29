@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * Retrieves the number of days in this month. The provided [isLeapYear] parameter is used to determine the amount of
 * days in the month of February.
 *
 * February has 28 days in a standard year and 29 days in a leap year.
 * April, June, September and November have 30 days.
 * All other months have 31 days.
 */
@ExperimentalTime
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
 *
 * @see [days]
 */
@ExperimentalTime
fun Month.daysIn(year: Year): Int =
    days(isLeapYear = year.isLeap)

/**
 * Retrieves the number of days in this month. The provided [year] parameter is used to determine the amount of days in
 * the month of February by determining whether the provided [year] is a leap year or not.
 *
 * February has 28 days in a standard year and 29 days in a leap year.
 * April, June, September and November have 30 days.
 * All other months have 31 days.
 *
 * @see [daysIn]
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
 *
 * @see [datesIn]
 */
@ExperimentalTime
fun Month.datesIn(year: Int): List<LocalDate> =
    datesIn(year = Year(year))

/**
 * Retrieves the [LocalDate] within this [Month] at the provided [year] and [dayOfMonth].
 *
 * @throws [IllegalArgumentException] if the provided [dayOfMonth] value is invalid for this [Month] and [year].
 */
@ExperimentalTime
fun Month.dateAt(year: Year, dayOfMonth: Int): LocalDate =
    LocalDate(year = year.value, month = this, dayOfMonth = dayOfMonth)

/**
 * Retrieves the [LocalDate] within this [Month] at the provided [year] and [dayOfMonth].
 *
 * @throws [IllegalArgumentException] if the provided [dayOfMonth] value is invalid for this [Month] and [year].
 *
 * @see [dateAt]
 */
@ExperimentalTime
fun Month.dateAt(year: Int, dayOfMonth: Int): LocalDate =
    dateAt(year = Year(year), dayOfMonth = dayOfMonth)

/**
 * Retrieves a [YearMonth] using the provided [year] and this [Month].
 */
@ExperimentalTime
fun Month.yearMonthAt(year: Year): YearMonth =
    YearMonth(year = year, month = this)

/**
 * Retrieves a [YearMonth] using the provided [year] and this [Month].
 */
@ExperimentalTime
fun Month.yearMonthAt(year: Int): YearMonth =
    YearMonth(year = year, month = this)

/**
 * Retrieves a [MonthDay] using the provided [dayOfMonth] and this [Month].
 */
@ExperimentalTime
fun Month.monthDayAt(dayOfMonth: Int): MonthDay =
    MonthDay(month = this, dayOfMonth = dayOfMonth)

/**
 * Retrieves the first [LocalDate] within this [Month] and the provided [year].
 *
 * @see [dateAt]
 */
@ExperimentalTime
fun Month.firstDateIn(year: Year): LocalDate =
    dateAt(year = year, dayOfMonth = 1)

/**
 * Retrieves the first [LocalDate] within this [Month] and the provided [year].
 *
 * @see [firstDateIn]
 */
@ExperimentalTime
fun Month.firstDateIn(year: Int): LocalDate =
    firstDateIn(Year(year))

/**
 * Retrieves the last [LocalDate] within this [Month] and the provided [year].
 *
 * @see [dateAt]
 * @see [daysIn]
 */
@ExperimentalTime
fun Month.lastDateIn(year: Year): LocalDate =
    dateAt(year = year, dayOfMonth = daysIn(year))

/**
 * Retrieves the last [LocalDate] within this [Month] and the provided [year].
 *
 * @see [lastDateIn]
 */
@ExperimentalTime
fun Month.lastDateIn(year: Int): LocalDate =
    lastDateIn(Year(year))

/**
 * Retrieves the [Duration] of this [Month] within the provided [year] with day precision.
 *
 * This is equivalent to calling [Duration.days] with the [daysIn] value.
 *
 * @see [daysIn]
 */
@ExperimentalTime
fun Month.duration(year: Year): Duration = Duration.Companion.days(this.daysIn(year))

/**
 * Retrieves the [Duration] of this [Month] within the provided [year] with day precision.
 *
 * This is equivalent to calling [Duration.days] with the [daysIn] value.
 *
 * @see [daysIn]
 */
@ExperimentalTime
fun Month.duration(year: Int): Duration = Duration.Companion.days(this.daysIn(year))

/**
 * Retrieves the [Duration] of this [Month] considering if this [isLeapYear] with day precision.
 *
 * This is equivalent to calling [Duration.days] with the [daysIn] value.
 *
 * @see [days]
 */
@ExperimentalTime
fun Month.duration(isLeapYear: Boolean): Duration = Duration.Companion.days(this.days(isLeapYear))

/**
 * Retrieves the number of weeks within this [Month] in the provided [year] using the provided [weekFormat].
 */
@ExperimentalTime
fun Month.weeksIn(year: Year, weekFormat: WeekFormat = WeekFormat()): Int {
    val firstDate = firstDateIn(year = year)
    val lastDate = lastDateIn(year = year)
    val firstWeekNumber = firstDate.weekOfMonth(weekFormat = weekFormat)
    val lastWeekNumber = lastDate.weekOfMonth(weekFormat = weekFormat)

    return lastWeekNumber - firstWeekNumber + 1
}

/**
 * Retrieves the number of weeks within this [Month] in the provided [year] using the provided [weekFormat].
 *
 * @see [weeksIn]
 */
@ExperimentalTime
fun Month.weeksIn(year: Int, weekFormat: WeekFormat = WeekFormat()): Int =
    weeksIn(year = Year(year), weekFormat = weekFormat)

/**
 * Retrieves the year week number of the first week of this [Month] in the provided [year] using the provided
 * [weekFormat].
 *
 * Note that the returned value is the week number of the year.
 */
@ExperimentalTime
fun Month.firstYearWeekIn(year: Year, weekFormat: WeekFormat = WeekFormat()): Int {
    val firstDateOfMonth = firstDateIn(year = year)

    return firstDateOfMonth.weekOfYear(weekFormat = weekFormat)
}

/**
 * Retrieves the year week number of the first week of this [Month] in the provided [year] using the provided
 * [weekFormat].
 *
 * @see [firstYearWeekIn]
 */
@ExperimentalTime
fun Month.firstYearWeekIn(year: Int, weekFormat: WeekFormat = WeekFormat()): Int =
    firstYearWeekIn(year = Year(year), weekFormat = weekFormat)

/**
 * Retrieves the year week number of the last week of this [Month] in the provided [year] using the provided
 * [weekFormat].
 *
 * Note that the returned value is the week number of the year.
 */
@ExperimentalTime
fun Month.lastYearWeekIn(year: Year, weekFormat: WeekFormat = WeekFormat()): Int {
    val lastDateOfMonth = lastDateIn(year = year)

    return lastDateOfMonth.weekOfYear(weekFormat = weekFormat)
}

/**
 * Retrieves the year week number of the last week of this [Month] in the provided [year] using the provided
 * [weekFormat].
 *
 * @see [lastYearWeekIn]
 */
@ExperimentalTime
fun Month.lastYearWeekIn(year: Int, weekFormat: WeekFormat = WeekFormat()): Int =
    lastYearWeekIn(year = Year(year), weekFormat = weekFormat)

/**
 * Retrieves the month week number of the first week of this [Month] in the provided [year] using the provided
 * [weekFormat].
 *
 * Note that the returned value is the week number of the month.
 */
@ExperimentalTime
fun Month.firstMonthWeekIn(year: Year, weekFormat: WeekFormat = WeekFormat()): Int {
    val firstDateOfMonth = firstDateIn(year = year)

    return firstDateOfMonth.weekOfYear(weekFormat = weekFormat)
}

/**
 * Retrieves the month week number of the first week of this [Month] in the provided [year] using the provided
 * [weekFormat].
 *
 * @see [firstMonthWeekIn]
 */
@ExperimentalTime
fun Month.firstMonthWeekIn(year: Int, weekFormat: WeekFormat = WeekFormat()): Int =
    firstMonthWeekIn(year = Year(year), weekFormat = weekFormat)

/**
 * Retrieves the month week number of the last week of this [Month] in the provided [year] using the provided
 * [weekFormat].
 *
 * Note that the returned value is the week number of the month.
 */
@ExperimentalTime
fun Month.lastMonthWeekIn(year: Year, weekFormat: WeekFormat = WeekFormat()): Int {
    val lastDateOfMonth = lastDateIn(year = year)

    return lastDateOfMonth.weekOfMonth(weekFormat = weekFormat)
}

/**
 * Retrieves the month week number of the last week of this [Month] in the provided [year] using the provided
 * [weekFormat].
 *
 * @see [lastMonthWeekIn]
 */
@ExperimentalTime
fun Month.lastMonthWeekIn(year: Int, weekFormat: WeekFormat = WeekFormat()): Int =
    lastMonthWeekIn(year = Year(year), weekFormat = weekFormat)

/**
 * Returns the [Month] that is the specified number of months after this one.
 *
 * The calculation rolls around the end of the year from December to January. The specified period may be negative.
 */
operator fun Month.plus(value: Int): Month {
    val months = Month.values()
    val index = months.indexOf(this)

    return months[index + value % months.size]
}

/**
 * Returns the [Month] that is the specified number of months before this one.
 *
 * The calculation rolls around the end of the year from January to December. The specified period may be negative.
 */
operator fun Month.minus(value: Int): Month {
    val months = Month.values()
    val index = months.indexOf(this)

    return months[index - value % months.size]
}
