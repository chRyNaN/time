package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.hours

/**
 * Represents an amount of hours as in a duration.
 *
 * @property [amount] A [Long] value representing the amount of hours of this duration.
 *
 * @author chRyNaN
 */
@ExperimentalTime
inline class Hours(private val amount: Long) {

    /**
     * Converts this [Hours] amount into a [Duration].
     *
     * @author chRyNaN
     */
    val duration: Duration
        get() = amount.hours
}