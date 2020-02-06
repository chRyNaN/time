package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.minutes

/**
 * Represents an amount of minutes as in a duration.
 *
 * @property [amount] A [Long] value representing the amount of minutes of this duration.
 *
 * @author chRyNaN
 */
@ExperimentalTime
inline class Minutes(private val amount: Long) {

    /**
     * Converts this [Minutes] amount into a [Duration].
     *
     * @author chRyNaN
     */
    val duration: Duration
        get() = amount.minutes
}