@file:Suppress("unused")

package com.chrynan.time

import java.time.temporal.WeekFields
import java.util.*
import kotlin.time.ExperimentalTime

/**
 * Creates a [WeekFormat] instance using the provided [locale] value.
 */
@ExperimentalTime
@UnstableTimeApi
fun WeekFormat(locale: Locale): WeekFormat {
    val weekFields = WeekFields.of(locale)

    return WeekFormat(
        minimalDaysInFirstWeek = weekFields.minimalDaysInFirstWeek,
        firstDayOfWeek = weekFields.firstDayOfWeek
    )
}
