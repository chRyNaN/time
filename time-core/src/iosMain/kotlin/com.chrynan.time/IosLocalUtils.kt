package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.toNSDateComponents
import kotlin.time.ExperimentalTime

@ExperimentalTime
actual fun LocalDate.weekOfYear(weekFormat: WeekFormat): Int =
    this.toNSDateComponents().weekOfYear.toInt()

@ExperimentalTime
actual fun LocalDate.weekOfMonth(weekFormat: WeekFormat): Int =
    this.toNSDateComponents().weekOfMonth.toInt()
