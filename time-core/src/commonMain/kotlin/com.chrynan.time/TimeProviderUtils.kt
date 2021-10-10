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
fun TimeProvider.isTodayAt(timeZone: TimeZone, localDate: LocalDate): Boolean =
    todayAt(timeZone = timeZone) == localDate

@ExperimentalTime
fun TimeProvider.isYesterdayAt(timeZone: TimeZone, localDate: LocalDate): Boolean =
    yesterdayAt(timeZone = timeZone) == localDate

@ExperimentalTime
fun TimeProvider.isTomorrowAt(timeZone: TimeZone, localDate: LocalDate): Boolean =
    yesterdayAt(timeZone = timeZone) == localDate

@ExperimentalTime
fun TimeProvider.isToday(dateStamp: DateStamp): Boolean =
    todayAt(timeZone = dateStamp.timeZone) == dateStamp.date

@ExperimentalTime
fun TimeProvider.isYesterday(dateStamp: DateStamp): Boolean =
    yesterdayAt(timeZone = dateStamp.timeZone) == dateStamp.date

@ExperimentalTime
fun TimeProvider.isTomorrow(dateStamp: DateStamp): Boolean =
    tomorrowAt(timeZone = dateStamp.timeZone) == dateStamp.date
