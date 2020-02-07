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

    /**
     * Retrieves a [CalendarDate] for this [Moment]. This represents a day within a calendar year with no respect to
     * exact time or region information. For time information, refer to the [timeOfDay] property.
     *
     * @author chRyNaN
     */
    val calendarDate: CalendarDate

    /**
     * Retrieves a [TimeOfDay] for this [Moment]. This represents exact time within a calendar day with no respect to
     * the date or region information. For date information, refer to the [calendarDate] property.
     *
     * @author chRyNaN
     */
    val timeOfDay: TimeOfDay

    /**
     * Retrieves a [CalendarDateAndTime] for this [Moment]. This is a convenience function for wrapping [calendarDate]
     * and [timeOfDay] with a [CalendarDateAndTime].
     *
     * @author chRyNaN
     */
    val calendarDateAndTime: CalendarDateAndTime
        get() = CalendarDateAndTime(calendarDate = calendarDate, timeOfDay = timeOfDay)

    /**
     * Retrieves a [TimeOffset] indicating the utc offset from the utc origin time.
     *
     * @author chRyNaN
     */
    val offsetFromUtc: TimeOffset

    /**
     * Retrieves a [TimeZoneRegionId] for this [Moment] if one is available.
     *
     * @author chRyNaN
     */
    val timeZoneRegionId: TimeZoneRegionId?

    operator fun plus(duration: Duration): Moment

    operator fun minus(duration: Duration): Moment

    /**
     * Returns a new [Moment] representing the start of the current day.
     *
     * @author chRyNaN
     */
    fun startOfDay(): Moment

    /**
     * Retrieves a new [Moment] representing the same time as this [Moment] but in the UTC/GMT region. This is similar
     * to subtracting the [offsetFromUtc] from this [Moment] and updating the [timeZoneRegionId] to be
     * [DefaultTimeZoneRegionId.UTC].
     *
     * @author chRyNaN
     */
    fun toUtc(): Moment
}