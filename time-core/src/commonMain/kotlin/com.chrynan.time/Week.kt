@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.DayOfWeek
import kotlin.time.ExperimentalTime

/**
 * Represents the formatting for the counting of weeks within a month or year.
 *
 * @property [minimalDaysInFirstWeek] Gets the minimal number of days in the first week.
 * The number of days considered to define the first week of a month or year varies by culture. For example, the
 * ISO-8601 requires 4 days (more than half a week) to be present before counting the first week.
 *
 * @property [firstDayOfWeek] Gets the first day-of-week.
 * The first day-of-week varies by culture. For example, the US uses Sunday, while France and the ISO-8601 standard use
 * Monday. This method returns the first day using the standard DayOfWeek enum.
 */
@ExperimentalTime
data class WeekFormat(
    val minimalDaysInFirstWeek: Int = 4,
    val firstDayOfWeek: DayOfWeek = DayOfWeek.MONDAY
) {

    companion object
}

/**
 * Creates a [WeekFormat] instance from the provided [Locale]. If it is possible to obtain a [WeekFormat] from the
 * provided [Locale] then that is returned, otherwise a default [WeekFormat] is returned.
 */
@ExperimentalTime
@UnstableTimeApi
expect fun WeekFormat(locale: Locale): WeekFormat
