@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.serialization.SerialName
import kotlin.jvm.JvmInline
import kotlinx.serialization.Serializable
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.time.ExperimentalTime

/**
 * Represents the hour within a single day. The [value] is an integer representation of the hour within a single day,
 * this could be either a value between 0-23 or 0-11 depending on the [clockConvention] used.
 */
@UnstableTimeApi
sealed interface HourOfDay {

    val clockConvention: ClockConvention
    val value: Int

    /**
     * An [HourOfDay] for a [ClockConvention.TWELVE_HOUR] clock.
     */
    @UnstableTimeApi
    @Serializable
    data class TwelveBased internal constructor(
        @SerialName(value = "value") override val value: Int,
        @SerialName(value = "meridiem_period") val meridiemPeriod: MeridiemPeriod
    ) : HourOfDay {

        init {
            require(value >= 0) { "HourOfDay for a twelve hour based clock must be between 0-11, value was $value" }
            require(value < 12) { "HourOfDay for a twelve hour based clock must be between 0-11, value was $value" }
        }

        @SerialName(value = "clock_convention")
        override val clockConvention: ClockConvention = ClockConvention.TWELVE_HOUR
    }

    /**
     * An [HourOfDay] for a [ClockConvention.TWENTY_FOUR_HOUR] clock.
     */
    @UnstableTimeApi
    @Serializable
    @JvmInline
    value class TwentyFourBased internal constructor(@SerialName(value = "value") override val value: Int) : HourOfDay {

        init {
            require(value >= 0) { "HourOfDay for a twenty-four hour based clock must be between 0-23, value was $value" }
            require(value < 24) { "HourOfDay for a twenty-four hour based clock must be between 0-23, value was $value" }
        }

        @SerialName(value = "clock_convention")
        override val clockConvention: ClockConvention
            get() = ClockConvention.TWENTY_FOUR_HOUR
    }

    companion object
}

/**
 * Constructs a [HourOfDay] from the provided [twentyFourHourValue]. The provided value must be between 0-23.
 */
@Suppress("FunctionName")
@UnstableTimeApi
fun HourOfDay(twentyFourHourValue: Int): HourOfDay.TwentyFourBased =
    HourOfDay.TwentyFourBased(value = twentyFourHourValue)

/**
 * Constructs a [HourOfDay] from the provided [twelveHourValue] and [meridiemPeriod]. The provided value must be
 * between 0-11.
 */
@Suppress("FunctionName")
@UnstableTimeApi
fun HourOfDay(twelveHourValue: Int, meridiemPeriod: MeridiemPeriod): HourOfDay.TwelveBased =
    HourOfDay.TwelveBased(value = twelveHourValue, meridiemPeriod = meridiemPeriod)

/**
 * Returns `true` if this [HourOfDay] instance is [HourOfDay.TwelveBased], `false` otherwise.
 */
@OptIn(ExperimentalContracts::class)
@UnstableTimeApi
fun HourOfDay.isTwelveBased(): Boolean {
    contract {
        returns(true) implies (this@isTwelveBased is HourOfDay.TwelveBased)
        returns(false) implies (this@isTwelveBased is HourOfDay.TwentyFourBased)
    }

    return this is HourOfDay.TwelveBased
}

/**
 * Returns `true` if this [HourOfDay] instance is [HourOfDay.TwentyFourBased], `false` otherwise.
 */
@OptIn(ExperimentalContracts::class)
@UnstableTimeApi
fun HourOfDay.isTwentyFourBased(): Boolean {
    contract {
        returns(true) implies (this@isTwentyFourBased is HourOfDay.TwentyFourBased)
        returns(false) implies (this@isTwentyFourBased is HourOfDay.TwelveBased)
    }

    return this is HourOfDay.TwentyFourBased
}

/**
 * Retrieves the [HourOfDay.TwelveBased] value from this [LocalDateTime] instance.
 */
@UnstableTimeApi
@ExperimentalTime
fun LocalDateTime.twelveBasedHourOfDay(): HourOfDay.TwelveBased =
    HourOfDay.TwelveBased(value = hourInTwelveHourClock, meridiemPeriod = MeridiemPeriod.AM)

/**
 * Retrieves the [HourOfDay.TwentyFourBased] value from this [LocalDateTime] instance.
 */
@UnstableTimeApi
fun LocalDateTime.twentyFourBasedHourOfDay(): HourOfDay.TwentyFourBased =
    HourOfDay.TwentyFourBased(value = hour)

/**
 * Retrieves the [HourOfDay.TwelveBased] value from this [LocalDateTime] instance.
 */
@UnstableTimeApi
@ExperimentalTime
fun LocalTime.twelveBasedHourOfDay(): HourOfDay.TwelveBased =
    HourOfDay.TwelveBased(value = hourInTwelveHourClock, meridiemPeriod = MeridiemPeriod.AM)

/**
 * Retrieves the [HourOfDay.TwentyFourBased] value from this [LocalDateTime] instance.
 */
@UnstableTimeApi
@ExperimentalTime
fun LocalTime.twentyFourBasedHourOfDay(): HourOfDay.TwentyFourBased =
    HourOfDay.TwentyFourBased(value = hour)
