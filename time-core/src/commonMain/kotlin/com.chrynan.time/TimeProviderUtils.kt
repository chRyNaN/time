@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
expect val TimeProvider.elapsedSystemTime: Duration

@ExperimentalTime
fun TimeProvider.yesterdayIn(timeZone: TimeZone): LocalDate =
    (now() - 1.days).toLocalDateTime(timeZone = timeZone).date

@ExperimentalTime
fun TimeProvider.tomorrowIn(timeZone: TimeZone): LocalDate =
    (now() + 1.days).toLocalDateTime(timeZone = timeZone).date

@ExperimentalTime
fun TimeProvider.currentMonthIn(timeZone: TimeZone): Month =
    todayIn(timeZone = timeZone).month

@ExperimentalTime
fun TimeProvider.currentYearIn(timeZone: TimeZone): Year =
    Year(todayIn(timeZone = timeZone).year)

@ExperimentalTime
fun TimeProvider.currentYearMonthIn(timeZone: TimeZone): YearMonth {
    val today = todayIn(timeZone = timeZone)

    return YearMonth(
        year = Year(today.year),
        month = today.month
    )
}

@ExperimentalTime
fun TimeProvider.isTodayIn(timeZone: TimeZone, localDate: LocalDate): Boolean =
    todayIn(timeZone = timeZone) == localDate

@ExperimentalTime
fun TimeProvider.isYesterdayIn(timeZone: TimeZone, localDate: LocalDate): Boolean =
    yesterdayIn(timeZone = timeZone) == localDate

@ExperimentalTime
fun TimeProvider.isTomorrowIn(timeZone: TimeZone, localDate: LocalDate): Boolean =
    yesterdayIn(timeZone = timeZone) == localDate

@ExperimentalTime
fun TimeProvider.isToday(dateStamp: DateStamp): Boolean =
    todayIn(timeZone = dateStamp.timeZone) == dateStamp.date

@ExperimentalTime
fun TimeProvider.isYesterday(dateStamp: DateStamp): Boolean =
    yesterdayIn(timeZone = dateStamp.timeZone) == dateStamp.date

@ExperimentalTime
fun TimeProvider.isTomorrow(dateStamp: DateStamp): Boolean =
    tomorrowIn(timeZone = dateStamp.timeZone) == dateStamp.date
