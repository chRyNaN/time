@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlin.time.ExperimentalTime

/**
 * A Utility interface to format time values relative to each other, into a formatted [String].
 *
 * This component differs from the [DateTimeFormatter] in that it compares two sets of time values and outputs a
 * formatted [String] describing the relationship between those values (ex: "15 mins ago").
 */
@ExperimentalTime
interface RelativeDateTimeFormatter {

    operator fun invoke(
        fromInstant: Instant,
        fromTimeZone: TimeZone,
        toInstant: Instant,
        toTimeZone: TimeZone
    ): String

    companion object
}
