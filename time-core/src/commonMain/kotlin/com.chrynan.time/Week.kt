package com.chrynan.time

import kotlinx.datetime.DayOfWeek

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
 *
 * @property [isZeroBased] Whether any days before the first week are considered week zero. If this is true, any values
 * before the first week and within the same year, calculated using the [minimalDaysInFirstWeek] and [firstDayOfWeek]
 * properties, are considered within week zero. If false, those values are considered within the previous year.
 */
data class WeekFormat(
    val minimalDaysInFirstWeek: Int = 4,
    val firstDayOfWeek: DayOfWeek = DayOfWeek.MONDAY,
    val isZeroBased: Boolean = true
)
