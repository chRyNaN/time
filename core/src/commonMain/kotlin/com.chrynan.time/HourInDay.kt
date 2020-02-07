package com.chrynan.time

/**
 * Represents an hour within a Calendar Day. This is an class wrapper around a numerical representation of a
 * hour. This could represent an hour within a 12-hour clock period, in which case it would be in the range of 1 to 12
 * with both 1 and 12 being inclusive, or this could represent an hour within a 24-hour clock period, in which case it
 * would be in the range of 0 to 24 with 0 being inclusive and 24 being exclusive. Note that no check is performed to
 * assert that the provided value is valid. Also, note that this class is different from the [Hours] class. Where the
 * [Hours] class denotes an amount of time or duration, this class denotes an exact hour within a day.
 *
 * @property [value] An [Int] value indicating the hour number within the day.
 *
 * @author chRyNaN
 */
sealed class HourInDay {

    abstract val value: Int
}

/**
 * Represents a [HourInDay] for a twelve hour clock.
 *
 * @property [value] An [Int] indicating the hour, 1 to 12.
 * @property [period] A [MeridiemPeriod] indicating whether this hour is in AM or PM.
 *
 * @author chRyNaN
 */
data class HourIn12HourClock(
    override val value: Int,
    val period: MeridiemPeriod
) : HourInDay()

/**
 * Represents a [HourInDay] for a twenty four hour clock.
 *
 * @property [value] An [Int] indicating the hour, 0 to 23.
 *
 * @author chRyNaN
 */
data class HourIn24HourClock(override val value: Int) : HourInDay()