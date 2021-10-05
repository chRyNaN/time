@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDate
import java.time.temporal.WeekFields
import kotlin.time.ExperimentalTime

@ExperimentalTime
actual fun LocalDate.weekOfYear(weekFormat: WeekFormat): Int {
    val weekFields = WeekFields.of(weekFormat.firstDayOfWeek, weekFormat.minimalDaysInFirstWeek)

    val javaLocalDate = java.time.LocalDate.of(year, month, dayOfMonth)

    return javaLocalDate.get(weekFields.weekOfYear())
}

@ExperimentalTime
actual fun LocalDate.weekOfMonth(weekFormat: WeekFormat): Int {
    val weekFields = WeekFields.of(weekFormat.firstDayOfWeek, weekFormat.minimalDaysInFirstWeek)

    val javaLocalDate = java.time.LocalDate.of(year, month, dayOfMonth)

    return javaLocalDate.get(weekFields.weekOfMonth())
}
