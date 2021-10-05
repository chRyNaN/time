package com.chrynan.time

import kotlinx.datetime.Instant
import kotlin.time.ExperimentalTime

/**
 * Known issues:
 * https://github.com/Kotlin/kotlinx-datetime/issues/67
 * https://github.com/Kotlin/kotlinx-datetime/issues/56
 */
@ExperimentalTime
actual fun convertLenientDateTimeStringToInstant(value: String) = Instant.parse(value)
