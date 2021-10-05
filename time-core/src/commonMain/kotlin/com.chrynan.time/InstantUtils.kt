@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * Parses the provided [isoString] to an [Instant] or null if it cannot be parsed.
 *
 * @see [Instant.parse]
 */
fun Instant.Companion.parseOrNull(isoString: String): Instant? =
    try {
        parse(isoString)
    } catch (exception: Exception) {
        null
    }

/**
 * Parses the provided [isoString] to an [Instant] and allowing leniency with the provided [String], for example
 * a [String] without some time values.
 */
@ExperimentalTime
fun Instant.Companion.parseLenient(isoString: String): Instant =
    convertDateTimeStringToInstant(value = isoString)

/**
 * Parses the provided [isoString] to an [Instant] or null if it can not be parsed.
 *
 * @see [parseLenient]
 */
@ExperimentalTime
fun Instant.Companion.parseLenientOrNull(isoString: String): Instant? =
    try {
        Instant.parseLenient(isoString)
    } catch (exception: Exception) {
        null
    }

/**
 * Retrieves a [Duration] of the time elapsed since the Epoch.
 *
 * @see [Instant.toEpochMilliseconds]
 */
@ExperimentalTime
val Instant.durationSinceEpoch: Duration
    get() = toEpochMilliseconds().milliseconds

/**
 * Retrieves the [Duration] between this [Instant] and the provided [other] [Instant].
 *
 * If the [other] [Instant] is later in time than this [Instant], the returned [Duration] will be positive.
 */
@ExperimentalTime
infix fun Instant.durationTo(other: Instant): Duration =
    (other.toEpochMilliseconds() - toEpochMilliseconds()).milliseconds
