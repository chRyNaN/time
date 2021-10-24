@file:Suppress("unused")

package com.chrynan.time

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a clock's display type. Whether the clock displays its time in twenty-four hours or twelve hours.
 */
@Serializable
enum class ClockConvention {

    @SerialName(value = "24hr")
    TWENTY_FOUR_HOUR,

    @SerialName(value = "12hr")
    TWELVE_HOUR;

    companion object
}

val ClockConvention.isTwentyFourHour: Boolean
    get() = this == ClockConvention.TWENTY_FOUR_HOUR

val ClockConvention.isTwelveHour: Boolean
    get() = this == ClockConvention.TWELVE_HOUR
