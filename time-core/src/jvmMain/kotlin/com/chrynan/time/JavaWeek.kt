package com.chrynan.time

import java.time.temporal.WeekFields
import kotlin.time.ExperimentalTime

@ExperimentalTime
@UnstableTimeApi
actual fun WeekFormat(locale: Locale): WeekFormat {
    val javaLocale = locale.toJavaLocale()

    val weekFields = WeekFields.of(javaLocale)

    return WeekFormat(
        minimalDaysInFirstWeek = weekFields.minimalDaysInFirstWeek,
        firstDayOfWeek = weekFields.firstDayOfWeek
    )
}
