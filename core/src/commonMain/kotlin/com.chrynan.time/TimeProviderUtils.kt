package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.days

/**
 * Retrieves the [Moment] representing the start of today. This is a convenience function for calling
 * [TimeProvider.now] followed by [Moment.startOfDay].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.today(): Moment = now().startOfDay()

/**
 * Retrieves the [Moment] representing the start of the day prior to today. This is a convenience function for calling
 * [TimeProvider.now] followed by [Moment.startOfDay] and then subtracting a one day [Duration].
 *
 * @author chRyNan
 */
@ExperimentalTime
fun TimeProvider.yesterday(): Moment = now().startOfDay() - 1.days

/**
 * Retrieves the [Moment] representing the start of the day after today. This is a convenience function for calling
 * [TimeProvider.now] followed by [Moment.startOfDay] and then adding a one day [Duration].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.tomorrow(): Moment = now().startOfDay() + 1.days

/**
 * Determines whether the provided [moment] is the same date as today. This is a convenience function for calling
 * [TimeProvider.now] and then calling [Moment.isSameDateAs] on that and the provided value to determine if they are
 * the same date.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.isToday(moment: Moment): Boolean = now().isSameDateAs(moment)
