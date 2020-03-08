package com.chrynan.time

/**
 * Converts this [HourInDay] instance to a [HourIn24HourClock]. If this [HourInDay] is already a [HourIn24HourClock],
 * then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn12HourClock] to
 * [HourIn24HourClock].
 *
 * @author chRyNaN
 */
fun HourInDay.convertTo24HourClock(): HourIn24HourClock =
    if (this is HourIn24HourClock) {
        this
    } else {
        val twelveHour = this as HourIn12HourClock
        val value = when {
            twelveHour.period == MeridiemPeriod.AM && twelveHour.value == 12 -> 0
            twelveHour.period == MeridiemPeriod.PM && twelveHour.value == 12 -> 12
            twelveHour.period == MeridiemPeriod.PM -> twelveHour.value + 12
            else -> twelveHour.value
        }

        HourIn24HourClock(value = value)
    }

/**
 * Converts this [HourInDay] instance to a [HourIn12HourClock]. If this [HourInDay] is already a [HourIn12HourClock],
 * then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn24HourClock] to
 * [HourIn12HourClock].
 *
 * @author chRyNaN
 */
fun HourInDay.convertTo12HourClock(): HourIn12HourClock {
    return if (this is HourIn12HourClock) {
        this
    } else {
        val twentyFourHour = this as HourIn24HourClock
        val period = if (twentyFourHour.value >= 12) MeridiemPeriod.PM else MeridiemPeriod.AM
        val zeroBasedValue = twentyFourHour.value % 12
        val value = if (zeroBasedValue == 0) 12 else zeroBasedValue

        HourIn12HourClock(value = value, period = period)
    }
}