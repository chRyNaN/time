package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * A class representing an offset of time in hours and minutes. This class is useful for representing a time offset
 * with respect to UTC time for a particular [Moment] in time. This allows specifying a UTC [Moment] in terms to a more
 * local time. Note that regions of the world don't necessarily have static [TimeOffset]s from UTC time. An example of
 * a non-static time offset is in regions that observe daylight savings time, where their time offsets from UTC change
 * multiple times a year.
 *
 * @author chRyNaN
 */
@ExperimentalTime
data class TimeOffset(
    val hours: Hours,
    val minutes: Minutes = Minutes(0),
    val seconds: Seconds = Seconds(0)
) {

    companion object {

        val ZERO = TimeOffset(hours = Hours(0), minutes = Minutes(0), seconds = Seconds(0))
    }

    /**
     * A [Duration] representing this [TimeOffset]. This a [Duration] of the [hours] and [minutes] of this time offset.
     *
     * @author chRyNaN
     */
    val duration: Duration = hours.duration + minutes.duration + seconds.duration

    operator fun plus(other: TimeOffset): TimeOffset =
        TimeOffset(hours = hours + other.hours, minutes = minutes + other.minutes, seconds = seconds + other.seconds)

    operator fun minus(other: TimeOffset): TimeOffset =
        TimeOffset(hours = hours - other.hours, minutes = minutes - other.minutes, seconds = seconds + other.seconds)
}