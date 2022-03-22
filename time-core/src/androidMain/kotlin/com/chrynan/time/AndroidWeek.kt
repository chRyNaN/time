@file:Suppress("unused")

package com.chrynan.time

import android.annotation.TargetApi
import android.os.Build
import java.time.temporal.WeekFields
import java.util.*
import kotlin.time.ExperimentalTime

@TargetApi(Build.VERSION_CODES.O)
@ExperimentalTime
@UnstableTimeApi
fun WeekFormat(locale: Locale): WeekFormat {
    val weekFields = WeekFields.of(locale)

    return WeekFormat(
        minimalDaysInFirstWeek = weekFields.minimalDaysInFirstWeek,
        firstDayOfWeek = weekFields.firstDayOfWeek
    )
}
