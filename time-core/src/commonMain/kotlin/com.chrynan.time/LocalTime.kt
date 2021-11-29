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
 * Retrieves the [MeridiemPeriod] of this [LocalTime].
 *
 * Note that different conventions treat midnight and noon differently. Typically, midnight is considered
 * [MeridiemPeriod.AM] and noon is considered [MeridiemPeriod.PM], which is the default behavior of this function.
 * However, this is not always the case as sometimes they can be inverted. This function supports inverting the
 * midnight and noon [MeridiemPeriod] values by provided the [isMidnightAM] parameter value.
 */
@ExperimentalTime
fun LocalTime.meridiemPeriod(isMidnightAM: Boolean = true): MeridiemPeriod =
    if (isMidnightAM) {
        if (hour < 12) MeridiemPeriod.AM else MeridiemPeriod.PM
    } else {
        when {
            hour == 0 -> MeridiemPeriod.PM
            hour == 12 -> MeridiemPeriod.AM
            hour < 12 -> MeridiemPeriod.AM
            else -> MeridiemPeriod.PM
        }
    }

/**
 * A convenience function for testing whether this [LocalTime.meridiemPeriod] is [MeridiemPeriod.AM].
 */
@ExperimentalTime
fun LocalTime.isAm(isMidnightAM: Boolean = true): Boolean = meridiemPeriod(isMidnightAM = isMidnightAM).isAm

/**
 * A convenience function for testing whether this [LocalTime.meridiemPeriod] is [MeridiemPeriod.PM].
 */
@ExperimentalTime
fun LocalTime.isPm(isMidnightAM: Boolean = true): Boolean = meridiemPeriod(isMidnightAM = isMidnightAM).isPm

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
