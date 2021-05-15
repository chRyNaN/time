@file:Suppress("unused")

package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * The new updated Duration API is verbose and less kotlin-esque. It prefers static function calls to convert
 * Numbers into durations instead of property accessors which are more readable. This was most likely done to
 * not "pollute" the number namespace. But I find it less friendly. So, this brings back the properties and
 * just delegates to the newer function calls.
 */

@ExperimentalTime
val Int.nanoseconds
    get() = Duration.nanoseconds(this)

/** Returns a [Duration] equal to this [Long] number of nanoseconds. */
@ExperimentalTime
val Long.nanoseconds
    get() = Duration.nanoseconds(this)

/**
 * Returns a [Duration] equal to this [Double] number of nanoseconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
val Double.nanoseconds
    get() = Duration.nanoseconds(this)

/** Returns a [Duration] equal to this [Int] number of microseconds. */
@ExperimentalTime
val Int.microseconds
    get() = Duration.microseconds(this)

/** Returns a [Duration] equal to this [Long] number of microseconds. */
@ExperimentalTime
val Long.microseconds
    get() = Duration.microseconds(this)

/**
 * Returns a [Duration] equal to this [Double] number of microseconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
val Double.microseconds
    get() = Duration.microseconds(this)

/** Returns a [Duration] equal to this [Int] number of milliseconds. */
@ExperimentalTime
val Int.milliseconds
    get() = Duration.milliseconds(this)

/** Returns a [Duration] equal to this [Long] number of milliseconds. */
@ExperimentalTime
val Long.milliseconds
    get() = Duration.milliseconds(this)

/**
 * Returns a [Duration] equal to this [Double] number of milliseconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
val Double.milliseconds
    get() = Duration.milliseconds(this)

/** Returns a [Duration] equal to this [Int] number of seconds. */
@ExperimentalTime
val Int.seconds
    get() = Duration.seconds(this)

/** Returns a [Duration] equal to this [Long] number of seconds. */
@ExperimentalTime
val Long.seconds
    get() = Duration.seconds(this)

/**
 * Returns a [Duration] equal to this [Double] number of seconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
val Double.seconds
    get() = Duration.seconds(this)

/** Returns a [Duration] equal to this [Int] number of minutes. */
@ExperimentalTime
val Int.minutes
    get() = Duration.minutes(this)

/** Returns a [Duration] equal to this [Long] number of minutes. */
@ExperimentalTime
val Long.minutes
    get() = Duration.minutes(this)

/**
 * Returns a [Duration] equal to this [Double] number of minutes.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
val Double.minutes
    get() = Duration.minutes(this)

/** Returns a [Duration] equal to this [Int] number of hours. */
@ExperimentalTime
val Int.hours
    get() = Duration.hours(this)

/** Returns a [Duration] equal to this [Long] number of hours. */
@ExperimentalTime
val Long.hours
    get() = Duration.hours(this)

/**
 * Returns a [Duration] equal to this [Double] number of hours.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
val Double.hours
    get() = Duration.hours(this)

/** Returns a [Duration] equal to this [Int] number of days. */
@ExperimentalTime
val Int.days
    get() = Duration.days(this)

/** Returns a [Duration] equal to this [Long] number of days. */
@ExperimentalTime
val Long.days
    get() = Duration.days(this)

/**
 * Returns a [Duration] equal to this [Double] number of days.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
val Double.days
    get() = Duration.days(this)
