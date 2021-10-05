package com.chrynan.time

import android.annotation.TargetApi
import android.os.Build
import java.time.temporal.WeekFields
import kotlin.time.ExperimentalTime

@TargetApi(Build.VERSION_CODES.O)
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
