package com.chrynan.time

import kotlin.time.ExperimentalTime

/**
 * This interface represents a utility that can convert a [String] into a [Moment]. The format for the input is defined
 * by the [pattern] property.
 *
 * @property [pattern] The [MomentFormatPattern] that represents the formatted input from converting a [String] to a
 * [Moment].
 *
 * @author chRyNaN
 */
@ExperimentalTime
interface MomentParser {

    val pattern: MomentFormatPattern

    /**
     * Converts the provided [String] into a [Moment] using the [pattern]. Throws a [Throwable] if there was an error
     * in the conversion process.
     *
     * @author chRyNaN
     */
    fun parse(input: String): Moment

    /**
     * Converts the provided [String] into a [Moment] using the [pattern]. Returns null if there was an error in the
     * conversion process.
     *
     * @author chRyNaN
     */
    fun parseOrNull(input: String): Moment?
}