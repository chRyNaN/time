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
fun LocalDateTime.weekOfYear(weekFormat: WeekFormat = WeekFormat()): Int =
    this.date.weekOfYear(weekFormat = weekFormat)

@ExperimentalTime
fun LocalDateTime.weekOfMonth(weekFormat: WeekFormat = WeekFormat()): Int =
    this.date.weekOfMonth(weekFormat = weekFormat)

val LocalDateTime.millisecond: Int
    get() = nanosecond / 1_000_000
