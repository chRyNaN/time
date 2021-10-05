@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
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

@UnstableTimeApi
expect fun LocalDate.weekOfYear(locale: Locale): Int

@UnstableTimeApi
expect fun LocalDate.weekOfMonth(locale: Locale): Int

@UnstableTimeApi
fun LocalDateTime.weekOfYear(locale: Locale): Int =
    this.date.weekOfYear(locale = locale)

@UnstableTimeApi
fun LocalDateTime.weekOfMonth(locale: Locale): Int =
    this.date.weekOfMonth(locale = locale)
