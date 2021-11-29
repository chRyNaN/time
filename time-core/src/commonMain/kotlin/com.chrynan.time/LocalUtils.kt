@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlin.time.ExperimentalTime

@ExperimentalTime
expect fun LocalDate.weekOfYear(weekFormat: WeekFormat = WeekFormat()): Int

@ExperimentalTime
expect fun LocalDate.weekOfMonth(weekFormat: WeekFormat = WeekFormat()): Int

@ExperimentalTime
fun LocalDateTime.weekOfYear(weekFormat: WeekFormat = WeekFormat()): Int =
    this.date.weekOfYear(weekFormat = weekFormat)

@ExperimentalTime
fun LocalDateTime.weekOfMonth(weekFormat: WeekFormat = WeekFormat()): Int =
    this.date.weekOfMonth(weekFormat = weekFormat)

val LocalDateTime.millisecond: Int
    get() = nanosecond / 1_000_000

/**
 * Retrieves the [MeridiemPeriod] of this [LocalDateTime].
 *
 * Note that different conventions treat midnight and noon differently. Typically, midnight is considered
 * [MeridiemPeriod.AM] and noon is considered [MeridiemPeriod.PM], which is the default behavior of this function.
 * However, this is not always the case as sometimes they can be inverted. This function supports inverting the
 * midnight and noon [MeridiemPeriod] values by provided the [isMidnightAM] parameter value.
 */
@ExperimentalTime
fun LocalDateTime.meridiemPeriod(isMidnightAM: Boolean = true): MeridiemPeriod =
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
 * A convenience function for testing whether this [LocalDateTime.meridiemPeriod] is [MeridiemPeriod.AM].
 */
@ExperimentalTime
fun LocalDateTime.isAm(isMidnightAM: Boolean = true): Boolean = meridiemPeriod(isMidnightAM = isMidnightAM).isAm

/**
 * A convenience function for testing whether this [LocalDateTime.meridiemPeriod] is [MeridiemPeriod.PM].
 */
@ExperimentalTime
fun LocalDateTime.isPm(isMidnightAM: Boolean = true): Boolean = meridiemPeriod(isMidnightAM = isMidnightAM).isPm
