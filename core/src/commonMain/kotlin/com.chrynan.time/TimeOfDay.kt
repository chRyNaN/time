package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds

/**
 * A class that represents the exact time within a Calendar date. This represents a moment of time and not an elapsed
 * time value like a duration. This class has properties that represent the exact time down to millisecond precision
 * within a calendar day. Note that this class has no reference to the calendar date or region.
 *
 * @author chRyNaN
 */
@ExperimentalTime
data class TimeOfDay(val elapsedDurationInDay: Duration) {

    companion object {

        /**
         * Midnight, or start of day, representation for [TimeOfDay]. This value is set to 00:00 in twenty four hour
         * clock time. Note that the [TimeOfDay] has no reference to what day it is, only the time of a day.
         *
         * @author chRyNaN
         */
        val MIDNIGHT = TimeOfDay(0.milliseconds)

        /**
         * Alias for [MIDNIGHT].
         *
         * @author chRyNaN
         */
        val START_OF_DAY = MIDNIGHT
    }

    val minuteInHour: MinuteInHour
        get() = MinuteInHour((elapsedDurationInDay.inMinutes.toInt() % TimeUtils.MINUTES_IN_HOUR).toInt())

    val secondInMinute: SecondInMinute
        get() = SecondInMinute((elapsedDurationInDay.inSeconds.toInt() % TimeUtils.SECONDS_IN_MINUTE).toInt())

    val millisecondInSecond: MillisecondInSecond
        get() = MillisecondInSecond((elapsedDurationInDay.inMilliseconds.toInt() % TimeUtils.MILLISECONDS_IN_SECOND).toInt())

    fun hourInDay(clockConvention: ClockConvention): HourInDay {
        val hourIn24HourDay = elapsedDurationInDay.inHours.toInt()
        elapsedDurationInDay.inMicroseconds

        return if (clockConvention == ClockConvention.TWENTY_FOUR_HOUR_CLOCK) {
            HourIn24HourClock(hourIn24HourDay)
        } else {
            HourIn24HourClock(hourIn24HourDay).convertTo12HourClock()
        }
    }
}