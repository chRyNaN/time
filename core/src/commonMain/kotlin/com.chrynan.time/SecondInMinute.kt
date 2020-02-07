package com.chrynan.time

/**
 * Represents the second within a minute for a Calendar day. This is an inline class wrapper around a numerical
 * representation of a second. This could be a value starting from, and including, 0, up to, and excluding, 60. Note
 * that no check is performed to assert that the provided value is valid when instantiating an instance of this class.
 *
 * @author chRyNaN
 */
inline class SecondInMinute(val value: Int)