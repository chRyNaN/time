@file:Suppress("unused")

package com.chrynan.time

/**
 * An enum representing the two periods of a 24-hour day for [ClockConvention.TWELVE_HOUR] clocks. Those two periods
 * are `a.m.` (from Latin "ante meridiem", translating to before midday), a.k.a. `AM`, and `p.m.` (from Latin
 * "post meridiem" translating to after midday), a.k.a. `PM`.
 *
 * An hour within the day can easily be converted to a 12-hour time with the associated [MeridiemPeriod]. Likewise, an
 * hour within the 12-hour time and its [MeridiemPeriod] can be converted to a 24-hour time.
 */
enum class MeridiemPeriod {

    AM,
    PM
}
