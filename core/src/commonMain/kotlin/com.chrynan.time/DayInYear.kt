package com.chrynan.time

/**
 * Represents a day in a Calendar Year. Days in a Calendar Year start at one and go up to 366. A value of 366 means it
 * is a leap year and a value of 365 means it is not a leap year. Note that no check is done to assert that the
 * provided [value] is valid when constructing an instance of this class.
 *
 * @author chRyNaN
 */
inline class DayInYear(val value: Int)