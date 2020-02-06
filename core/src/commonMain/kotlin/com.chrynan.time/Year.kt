package com.chrynan.time

/**
 * Represents a Calendar Year. This is an inline class wrapper around a numerical representation of a year. A negative
 * value denotes a year within the Before Common Era period. A value of zero is not a valid year with respect to the
 * Common Era but can be used if using with a different calendar era. Note that this is not a duration, this does not
 * represent an amount of years, but rather, represents an exact year within a calendar.
 *
 * @author chRyNaN
 */
inline class Year(val value: Long) {

    /**
     * Determines whether this [Year] is within the Before Christ Era, or any year less than zero. This is equivalent
     * to [isBCE]. Both properties are provided for convenience for usage depending on locality and personal preference.
     *
     * @author chRyNaN
     */
    val isBC: Boolean
        get() = value < 0

    /**
     * Determines whether this [Year] is within the Before Common Era, or any year less than zero. This is equivalent
     * to [isBC]. Both properties are provided for convenience for usage depending on locality and personal preference.
     *
     * @author chRyNaN
     */
    val isBCE: Boolean
        get() = isBC

    /**
     * Determines whether this [Year] is within the Anno Domini Era, or any year equal to one or greater. This is
     * equivalent to [isCE]. Both properties are provided for convenience for usage depending on locality and personal
     * preference.
     *
     * @author chRyNaN
     */
    val isAD: Boolean
        get() = value > 0

    /**
     * Determines whether this [Year] is within the Common Era, or any year equal to one or greater. This is equivalent
     * to [isAD]. Both properties are provided for convenience for usage depending on locality and personal preference.
     *
     * @author chRyNaN
     */
    val isCE: Boolean
        get() = isAD

    /**
     * Determines whether this [Year] is a valid year in the Gregorian Calendar according to the Common Era years
     * notation. For instance, the year 1 BCE is immediately followed by the year 1 CE. This means there is no year
     * with a value of zero. So this condition determines if the year is not zero.
     *
     * @author chRyNaN
     */
    val isValidGregorianYear: Boolean
        get() = value != 0L

    /**
     * Determines whether this [Year] is a leap year according to the Gregorian Calendar. According to this system, the
     * average year is about 365.2425 days long and spaces leap years every four years. The rules for determining this
     * value are:
     *
     * "Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100,
     * but these centurial years are leap years if they are exactly divisible by 400."
     *
     * - taken from Wikipedia (https://en.wikipedia.org/wiki/Gregorian_calendar), February 7th, 2020.
     *
     * @author chRyNaN
     */
    val isGregorianLeapYear: Boolean
        get() = when {
            value % 400L == 0L -> true
            value % 100L == 0L -> false
            value % 4L == 0L -> true
            else -> false
        }
}