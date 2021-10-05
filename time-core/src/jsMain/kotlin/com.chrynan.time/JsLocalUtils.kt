package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlin.time.ExperimentalTime

@ExperimentalTime
actual fun LocalDate.weekOfYear(weekFormat: WeekFormat): Int =
    throw UnsupportedOperationException("LocalDate.weekOfYear is currently not supported in Javascript.")

@ExperimentalTime
actual fun LocalDate.weekOfMonth(weekFormat: WeekFormat): Int =
    throw UnsupportedOperationException("LocalDate.weekOfYear is currently not supported in Javascript.")
