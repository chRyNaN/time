@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDateTime
import kotlin.time.ExperimentalTime

/**
 * Represents the time components of the [LocalDateTime] class.
 *
 * @see [LocalDateTime]
 * @see [LocalDate]
 */
@ExperimentalTime
data class LocalTime(
    val hour: Int,
    val minute: Int,
    val second: Int,
    val nanosecond: Int
)

@ExperimentalTime
val LocalTime.millisecond: Int
    get() = nanosecond / 1_000_000

/**
 * Retrieves the [LocalTime] from this [LocalDateTime].
 */
@ExperimentalTime
val LocalDateTime.time: LocalTime
    get() = LocalTime(
        hour = hour,
        minute = minute,
        second = second,
        nanosecond = nanosecond
    )