@file:Suppress("unused")

package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.toDuration

/**
 * The new updated Duration API is verbose and less kotlin-esque. It prefers static function calls to convert
 * Numbers into durations instead of property accessors which are more readable. This was most likely done to
 * not "pollute" the number namespace. But I find it less friendly. So, this brings back the properties and
 * just delegates to the newer function calls.
 *
 * FIXME: Note that it seems that the Duration API has reverted course and un-deprecated the Int.milliseconds style
 * extension properties for Durations. This is good news, and these will slowly be replaced with that API again.
 */

/**
 * Returns a [Duration] equal to this [Int] number of nanoseconds.
 */
val Int.nanoseconds
    get() = this.toDuration(DurationUnit.NANOSECONDS)

/**
 * Returns a [Duration] equal to this [Long] number of nanoseconds.
 */
val Long.nanoseconds
    get() = this.toDuration(DurationUnit.NANOSECONDS)

/**
 * Returns a [Duration] equal to this [Double] number of nanoseconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
val Double.nanoseconds
    get() = this.toDuration(DurationUnit.NANOSECONDS)

/**
 * Returns a [Duration] equal to this [Int] number of microseconds.
 */
val Int.microseconds
    get() = this.toDuration(DurationUnit.MICROSECONDS)

/**
 * Returns a [Duration] equal to this [Long] number of microseconds.
 */
val Long.microseconds
    get() = this.toDuration(DurationUnit.MICROSECONDS)

/**
 * Returns a [Duration] equal to this [Double] number of microseconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
val Double.microseconds
    get() = this.toDuration(DurationUnit.MICROSECONDS)

/**
 * Returns a [Duration] equal to this [Int] number of milliseconds.
 */
val Int.milliseconds
    get() = this.toDuration(DurationUnit.MILLISECONDS)

/**
 * Returns a [Duration] equal to this [Long] number of milliseconds.
 */
val Long.milliseconds
    get() = this.toDuration(DurationUnit.MILLISECONDS)

/**
 * Returns a [Duration] equal to this [Double] number of milliseconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
val Double.milliseconds
    get() = this.toDuration(DurationUnit.MILLISECONDS)

/**
 * Returns a [Duration] equal to this [Int] number of seconds.
 */
val Int.seconds
    get() = this.toDuration(DurationUnit.SECONDS)

/**
 * Returns a [Duration] equal to this [Long] number of seconds.
 */
val Long.seconds
    get() = this.toDuration(DurationUnit.SECONDS)

/**
 * Returns a [Duration] equal to this [Double] number of seconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
val Double.seconds
    get() = this.toDuration(DurationUnit.SECONDS)

/**
 * Returns a [Duration] equal to this [Int] number of minutes.
 */
val Int.minutes
    get() = this.toDuration(DurationUnit.MINUTES)

/**
 * Returns a [Duration] equal to this [Long] number of minutes.
 */
val Long.minutes
    get() = this.toDuration(DurationUnit.MINUTES)

/**
 * Returns a [Duration] equal to this [Double] number of minutes.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
val Double.minutes
    get() = this.toDuration(DurationUnit.MINUTES)

/**
 * Returns a [Duration] equal to this [Int] number of hours.
 */
val Int.hours
    get() = this.toDuration(DurationUnit.HOURS)

/**
 * Returns a [Duration] equal to this [Long] number of hours.
 */
val Long.hours
    get() = this.toDuration(DurationUnit.HOURS)

/**
 * Returns a [Duration] equal to this [Double] number of hours.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
val Double.hours
    get() = this.toDuration(DurationUnit.HOURS)

/**
 * Returns a [Duration] equal to this [Int] number of days.
 */
val Int.days
    get() = this.toDuration(DurationUnit.DAYS)

/**
 * Returns a [Duration] equal to this [Long] number of days.
 */
val Long.days
    get() = this.toDuration(DurationUnit.DAYS)

/**
 * Returns a [Duration] equal to this [Double] number of days.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
val Double.days
    get() = this.toDuration(DurationUnit.DAYS)
