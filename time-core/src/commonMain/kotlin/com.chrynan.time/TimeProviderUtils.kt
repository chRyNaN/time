@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*
import kotlin.time.ExperimentalTime

@ExperimentalTime
fun TimeProvider.yesterdayAt(timeZone: TimeZone): LocalDate =
    (now() - 1.days).toLocalDateTime(timeZone = timeZone).date

@ExperimentalTime
fun TimeProvider.tomorrowAt(timeZone: TimeZone): LocalDate =
    (now() + 1.days).toLocalDateTime(timeZone = timeZone).date

@ExperimentalTime
fun TimeProvider.currentMonthAt(timeZone: TimeZone): Month =
    todayAt(timeZone = timeZone).month

@ExperimentalTime
fun TimeProvider.currentYearAt(timeZone: TimeZone): Year =
    Year(todayAt(timeZone = timeZone).year)

@ExperimentalTime
fun TimeProvider.currentYearMonthAt(timeZone: TimeZone): YearMonth {
    val today = todayAt(timeZone = timeZone)

    return YearMonth(
        year = Year(today.year),
        month = today.month
    )
}

@ExperimentalTime
private fun TimeProvider.isTodayAt(timeZone: TimeZone, localDate: LocalDate): Boolean =
    todayAt(timeZone = timeZone) == localDate
