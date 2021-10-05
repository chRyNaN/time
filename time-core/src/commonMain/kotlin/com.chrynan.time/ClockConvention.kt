@file:Suppress("unused")

package com.chrynan.time

import kotlinx.serialization.Serializable

/**
 * Represents a clock's display type. Whether the clock displays its time in twenty-four hours or twelve hours.
 */
@Serializable
enum class ClockConvention {

    TWENTY_FOUR_HOUR,
    TWELVE_HOUR;

    companion object
}
