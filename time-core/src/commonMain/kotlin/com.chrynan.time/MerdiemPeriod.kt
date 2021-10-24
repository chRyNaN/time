@file:Suppress("unused")

package com.chrynan.time

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An enum representing the two periods of a 24-hour day for [ClockConvention.TWELVE_HOUR] clocks. Those two periods
 * are `a.m.` (from Latin "ante meridiem", translating to before midday), a.k.a. `AM`, and `p.m.` (from Latin
 * "post meridiem" translating to after midday), a.k.a. `PM`.
 *
 * An hour within the day can easily be converted to a 12-hour time with the associated [MeridiemPeriod]. Likewise, an
 * hour within the 12-hour time and its [MeridiemPeriod] can be converted to a 24-hour time.
 */
@Serializable
enum class MeridiemPeriod {

    @SerialName(value = "am")
    AM,

    @SerialName(value = "pm")
    PM;

    companion object
}

val MeridiemPeriod.isAm: Boolean
    get() = this == MeridiemPeriod.AM

val MeridiemPeriod.isPm: Boolean
    get() = this == MeridiemPeriod.PM
