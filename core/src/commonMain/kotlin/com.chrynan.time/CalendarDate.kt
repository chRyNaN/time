package com.chrynan.time

/**
 * A class that represents a Date within a Calendar with no reference to exact time, such as, minutes or hours.
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