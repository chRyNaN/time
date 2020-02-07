package com.chrynan.time

import kotlin.time.ExperimentalTime

/**
 * An enum class representing a group of common UTC [TimeOffset]s. The [offset] value returns the actual [TimeOffset].
 * Note that this may not be a comprehensive list and for offsets that are not provided by this enum class, use the
 * [TimeOffset] class directly.
 *
 * @author chRyNaN
 */
@ExperimentalTime
enum class UtcTimeOffset(val offset: TimeOffset) {

    MINUS_1_HOUR(offset = TimeOffset(Hours(-1))),
    MINUS_2_HOURS(offset = TimeOffset(Hours(-2))),
    MINUS_2_HOURS_30_MINUTES(offset = TimeOffset(Hours(-2), Minutes(-30))),
    MINUS_3_HOURS(offset = TimeOffset(Hours(-3))),
    MINUS_3_HOURS_30_MINUTES(offset = TimeOffset(Hours(-3), Minutes(-30))),
    MINUS_4_HOURS(offset = TimeOffset(Hours(-4))),
    MINUS_4_HOURS_30_MINUTES(offset = TimeOffset(Hours(-4), Minutes(-30))),
    MINUS_5_HOURS(offset = TimeOffset(Hours(-5))),
    MINUS_6_HOURS(offset = TimeOffset(Hours(-6))),
    MINUS_7_HOURS(offset = TimeOffset(Hours(-7))),
    MINUS_8_HOURS(offset = TimeOffset(Hours(-8))),
    MINUS_9_HOURS(offset = TimeOffset(Hours(-9))),
    MINUS_9_HOURS_30_MINUTES(offset = TimeOffset(Hours(-9), Minutes(-30))),
    MINUS_10_HOURS(offset = TimeOffset(Hours(-10))),
    MINUS_11_HOURS(offset = TimeOffset(Hours(-11))),
    MINUS_12_HOURS(offset = TimeOffset(Hours(-12))),
    ZERO(offset = TimeOffset(Hours(0), Minutes(0))),
    PLUS_1_HOUR(offset = TimeOffset(Hours(1))),
    PLUS_2_HOURS(offset = TimeOffset(Hours(2))),
    PLUS_3_HOURS(offset = TimeOffset(Hours(3))),
    PLUS_3_HOURS_30_MINUTES(offset = TimeOffset(Hours(3), Minutes(30))),
    PLUS_4_HOURS(offset = TimeOffset(Hours(4))),
    PLUS_4_HOURS_30_MINUTES(offset = TimeOffset(Hours(4), Minutes(30))),
    PLUS_5_HOURS(offset = TimeOffset(Hours(5))),
    PLUS_5_HOURS_30_MINUTES(offset = TimeOffset(Hours(5), Minutes(30))),
    PLUS_5_HOURS_45_MINUTES(offset = TimeOffset(Hours(5), Minutes(45))),
    PLUS_6_HOURS(offset = TimeOffset(Hours(6))),
    PLUS_6_HOURS_30_MINUTES(offset = TimeOffset(Hours(6), Minutes(30))),
    PLUS_7_HOURS(offset = TimeOffset(Hours(7))),
    PLUS_8_HOURS(offset = TimeOffset(Hours(8))),
    PLUS_8_HOURS_45_MINUTES(offset = TimeOffset(Hours(8), Minutes(45))),
    PLUS_9_HOURS(offset = TimeOffset(Hours(9))),
    PLUS_9_HOURS_30_MINUTES(offset = TimeOffset(Hours(9), Minutes(30))),
    PLUS_10_HOURS(offset = TimeOffset(Hours(10))),
    PLUS_10_HOURS_30_MINUTES(offset = TimeOffset(Hours(10), Minutes(30))),
    PLUS_11_HOURS(offset = TimeOffset(Hours(11))),
    PLUS_12_HOURS(offset = TimeOffset(Hours(12))),
    PLUS_12_HOURS_45_MINUTES(offset = TimeOffset(Hours(12), Minutes(45))),
    PLUS_13_HOURS(offset = TimeOffset(Hours(13))),
    PLUS_13_HOURS_45_MINUTES(offset = TimeOffset(Hours(13), Minutes(45))),
    PLUS_14_HOURS(offset = TimeOffset(Hours(14)))
}