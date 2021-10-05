package com.chrynan.time

import kotlinx.datetime.LocalDate
import java.time.temporal.WeekFields

@UnstableTimeApi
actual fun LocalDate.weekOfYear(locale: Locale): Int {
    val weekFields = WeekFields.of(locale.toJavaLocale())

    val javaLocalDate = java.time.LocalDate.of(year, month, dayOfMonth)

    return javaLocalDate.get(weekFields.weekOfYear())
}

@UnstableTimeApi
actual fun LocalDate.weekOfMonth(locale: Locale): Int {
    val weekFields = WeekFields.of(locale.toJavaLocale())

    val javaLocalDate = java.time.LocalDate.of(year, month, dayOfMonth)

    return javaLocalDate.get(weekFields.weekOfMonth())
}
