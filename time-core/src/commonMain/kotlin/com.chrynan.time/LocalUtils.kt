@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlin.time.ExperimentalTime

@ExperimentalTime
expect fun LocalDate.weekOfYear(weekFormat: WeekFormat = WeekFormat()): Int

@ExperimentalTime
expect fun LocalDate.weekOfMonth(weekFormat: WeekFormat = WeekFormat()): Int

@ExperimentalTime
@UnstableTimeApi
fun LocalDate.weekOfYear(locale: Locale): Int {
    val weekFormat = WeekFormat(locale = locale)

    return weekOfYear(weekFormat = weekFormat)
}

@ExperimentalTime
@UnstableTimeApi
fun LocalDate.weekOfMonth(locale: Locale): Int {
    val weekFormat = WeekFormat(locale = locale)

    return weekOfMonth(weekFormat = weekFormat)
}

@ExperimentalTime
fun LocalDateTime.weekOfYear(weekFormat: WeekFormat = WeekFormat()): Int =
    this.date.weekOfYear(weekFormat = weekFormat)

@ExperimentalTime
fun LocalDateTime.weekOfMonth(weekFormat: WeekFormat = WeekFormat()): Int =
    this.date.weekOfMonth(weekFormat = weekFormat)

@ExperimentalTime
@UnstableTimeApi
fun LocalDateTime.weekOfYear(locale: Locale): Int =
    this.date.weekOfYear(locale = locale)

@ExperimentalTime
@UnstableTimeApi
fun LocalDateTime.weekOfMonth(locale: Locale): Int =
    this.date.weekOfMonth(locale = locale)
