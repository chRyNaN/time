package com.chrynan.time

/**
 * Represents the minute within an hour for a Calendar day. This is an inline class wrapper around a numerical
 * representation of a hour. This could be a value starting from, and including, 0, up to, and excluding, 60. Note that
 * no check is performed to assert that the provided value is valid. Also, note that this class is different from the
 * [Minutes] class. Where the [Minutes] class denotes an amount of time or duration, this class denotes an exact minute
 * within an hour.
 *
 * @property [value] An [Int] value indicating the minute number within the hour.
 *
 * @author chRyNaN
 */
inline class MinuteInHour(val value: Int)