package com.chrynan.time

import kotlin.time.ExperimentalTime

/**
 * A convenience data wrapper class around [CalendarDate] and [TimeOfDay].
 *
 * @author chRyNaN
 */
@ExperimentalTime
data class CalendarDateAndTime(
    val calendarDate: CalendarDate,
    val timeOfDay: TimeOfDay
)