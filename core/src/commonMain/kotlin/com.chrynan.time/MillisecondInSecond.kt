package com.chrynan.time

/**
 * Represents the millisecond within a second for a Calendar day. This is an inline class wrapper around a numerical
 * representation of a millisecond. This could be a value starting from, and including, 0, up to, and excluding, 1,000.
 * Note that no check is performed to assert that the provided value is valid when instantiating an instance of this
 * class.
 *
 * @author chRyNaN
 */
inline class MillisecondInSecond(val value: Int)