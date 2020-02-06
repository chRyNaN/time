package com.chrynan.time

/**
 * Represents a day in a Calendar Month. Days in a Calendar Month start with one and go up until 31. A value of one
 * means that it is the first day of the month. Months have different amounts of days in them and some vary
 * (Ex: February during a leap year). Note that no check is done to assert that the provided [value] is valid when
 * constructing an instance of this class.
 *
 * @author chRyNaN
 */
inline class DayInMonth(val value: Int)