package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlin.time.ExperimentalTime

/**
 * Known issues:
 * https://github.com/Kotlin/kotlinx-datetime/issues/67
 * https://github.com/Kotlin/kotlinx-datetime/issues/56
 */
@ExperimentalTime
actual fun convertDateTimeStringToInstant(value: String) = Instant.parse(value)

actual fun LocalDate.weekOfYear(locale: Locale): Int =
    throw UnsupportedOperationException("LocalDate.weekOfYear is currently not supported in Javascript.")

actual fun LocalDate.weekOfMonth(locale: Locale): Int =
    throw UnsupportedOperationException("LocalDate.weekOfYear is currently not supported in Javascript.")
