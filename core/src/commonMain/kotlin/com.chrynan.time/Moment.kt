package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * Represents an exact moment of time. This uses the unix epoch as a reference and the amount of time from the epoch
 * can be obtained using the [durationSinceTheEpoch] property.
 *
 * @author chRyNaN
 */
@ExperimentalTime
interface Moment {

    /**
     * The amount of time from the unix epoch (00:00:00 UTC on 1 January 1970). The value is a [Duration] representing
     * the difference between the current moment and the unix epoch moment. This value can be negative if it is before
     * the epoch.
     *
     * @author chRyNaN
     */
    val durationSinceTheEpoch: Duration

    val dayInYear: DayInYear

    val dayInMonth: DayInMonth

    val dayOfWeek: DayOfWeek

    val month: Month

    val year: Year

    val calendarDate: CalendarDate
        get() = CalendarDate(
            year = year,
            month = month,
            dayInYear = dayInYear,
            dayInMonth = dayInMonth,
            dayOfWeek = dayOfWeek
        )

    operator fun plus(duration: Duration): Moment

    operator fun minus(duration: Duration): Moment

    /**
     * Returns a new [Moment] representing the start of the current day.
     *
     * @author chRyNaN
     */
    fun startOfDay(): Moment
}