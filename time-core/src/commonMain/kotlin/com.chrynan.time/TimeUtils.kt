@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * Known issues:
 * https://github.com/Kotlin/kotlinx-datetime/issues/67
 * https://github.com/Kotlin/kotlinx-datetime/issues/56
 *
 * Made this an expect/actual to attempt to overcome the limitations of those issues but ran into
 * limitations of the Java Time API not being available on older Android versions.
 */
@ExperimentalTime
internal expect fun convertDateTimeStringToInstant(value: String): Instant

@ExperimentalTime
fun Duration.toInstantSinceEpoch(): Instant =
    Instant.fromEpochMilliseconds(this.inWholeMilliseconds)

@ExperimentalTime
fun Long.toInstantFromMillisecondsSinceEpoch(): Instant = milliseconds.toInstantSinceEpoch()
