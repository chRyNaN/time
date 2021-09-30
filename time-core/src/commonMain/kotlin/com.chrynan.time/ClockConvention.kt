@file:Suppress("unused")

package com.chrynan.time

import kotlinx.serialization.Serializable

@Serializable
enum class ClockConvention {

    TWENTY_FOUR_HOUR,
    TWELVE_HOUR;

    companion object
}
