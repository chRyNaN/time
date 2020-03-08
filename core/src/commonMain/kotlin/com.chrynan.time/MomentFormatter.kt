package com.chrynan.time

import kotlin.time.ExperimentalTime

/**
 * This interface represents a utility that can convert a [Moment] into a [String] representation. The format for the
 * [Moment] to be converted to is defined by the [pattern] property.
 *
 * @property [pattern] The [MomentFormatPattern] that represents the formatted output from converting a [Moment].
 *
 * @author chRyNaN
 */
@ExperimentalTime
interface MomentFormatter {

    val pattern: MomentFormatPattern

    /**
     * Converts the provided [Moment] into a [String] using the [pattern]. Throws a [Throwable] if there was an error
     * in the conversion process.
     *
     * @author chRyNaN
     */
    fun format(moment: Moment): String

    /**
     * Converts the provided [Moment] into a [String] using the [pattern]. Returns null if there was an error in the
     * conversion process.
     *
     * @author chRyNaN
     */
    fun formatOrNull(moment: Moment): String?
}