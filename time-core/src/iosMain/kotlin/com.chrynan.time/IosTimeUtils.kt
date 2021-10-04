package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.toNSDateComponents
import kotlin.time.ExperimentalTime

/**
 * Known issues:
 * https://github.com/Kotlin/kotlinx-datetime/issues/67
 * https://github.com/Kotlin/kotlinx-datetime/issues/56
 */
@ExperimentalTime
actual fun convertDateTimeStringToInstant(value: String) = Instant.parse(value)

@UnstableTimeApi
actual fun LocalDate.weekOfYear(locale: Locale): Int =
    this.toNSDateComponents().weekOfYear.toInt()

@UnstableTimeApi
actual fun LocalDate.weekOfMonth(locale: Locale): Int =
    this.toNSDateComponents().weekOfMonth.toInt()
