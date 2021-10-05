package com.chrynan.time

import android.annotation.TargetApi
import android.os.Build
import kotlinx.datetime.LocalDate
import java.time.temporal.WeekFields

@TargetApi(Build.VERSION_CODES.O)
@UnstableTimeApi
actual fun LocalDate.weekOfYear(locale: Locale): Int {
    val weekFields = WeekFields.of(locale.toJavaLocale())

    weekFields.minimalDaysInFirstWeek
    weekFields.firstDayOfWeek

    val javaLocalDate = java.time.LocalDate.of(year, month, dayOfMonth)

    return javaLocalDate.get(weekFields.weekOfYear())
}

@TargetApi(Build.VERSION_CODES.O)
@UnstableTimeApi
actual fun LocalDate.weekOfMonth(locale: Locale): Int {
    val weekFields = WeekFields.of(locale.toJavaLocale())

    val javaLocalDate = java.time.LocalDate.of(year, month, dayOfMonth)

    return javaLocalDate.get(weekFields.weekOfMonth())
}
