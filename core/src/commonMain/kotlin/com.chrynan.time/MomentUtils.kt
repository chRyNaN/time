package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
operator fun Moment.compareTo(other: Moment): Int = durationSinceTheEpoch.compareTo(other.durationSinceTheEpoch)

@ExperimentalTime
operator fun Moment.plus(hours: Hours): Moment = this + hours.duration

@ExperimentalTime
operator fun Moment.minus(hours: Hours): Moment = this - hours.duration

@ExperimentalTime
operator fun Moment.plus(minutes: Minutes): Moment = this + minutes.duration

@ExperimentalTime
operator fun Moment.minus(minutes: Minutes): Moment = this - minutes.duration

/**
 * Retrieves the [Duration] from this [Moment] to the [other] provided [Moment]. This is equivalent to subtracting this
 * [Moment]s [Moment.durationSinceTheEpoch] value from the [other] moments [Moment.durationSinceTheEpoch].
 *
 * @author chRyNaN
 */
@ExperimentalTime
infix fun Moment.to(other: Moment): Duration = other.durationSinceTheEpoch - durationSinceTheEpoch

/**
 * Determines whether this [Moment] and the provided [other] are the same [CalendarDate]. This is a convenience
 * function for comparing the [Moment.calendarDate] fields of both of the [Moment]s.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun Moment.isSameDateAs(other: Moment): Boolean = calendarDate == other.calendarDate