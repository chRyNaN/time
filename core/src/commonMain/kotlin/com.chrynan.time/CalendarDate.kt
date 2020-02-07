package com.chrynan.time

/**
 * A class that represents a Date within a Calendar with no reference to exact time, such as, minutes or hours, or a
 * region. Note multiple [CalendarDate]s may be considered equal if their values are the same, even though the
 * [Moment]s they came from may be in different regions, so technically they do not represent the same time. This is
 * because a [CalendarDate] has no reference to a region.
 *
 * @author chRyNaN
 */
data class CalendarDate(
    val year: Year,
    val month: Month,
    val dayInYear: DayInYear,
    val dayInMonth: DayInMonth,
    val dayOfWeek: DayOfWeek
)