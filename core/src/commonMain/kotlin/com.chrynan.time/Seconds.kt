package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

/**
 * Represents an amount of seconds as in a duration.
 *
 * @property [amount] A [Long] value representing the amount of seconds of this duration.
 *
 * @author chRyNaN
 */
@ExperimentalTime
inline class Seconds(private val amount: Long) {

    /**
     * Converts this [Seconds] amount into a [Duration].
     *
     * @author chRyNaN
     */
    val duration: Duration
        get() = amount.seconds

    operator fun plus(other: Seconds): Seconds = Seconds(amount + other.amount)

    operator fun minus(other: Seconds): Seconds = Seconds(amount - other.amount)
}