package com.chrynan.time

import kotlinx.datetime.Instant

/**
 * Known issues:
 * https://github.com/Kotlin/kotlinx-datetime/issues/67
 * https://github.com/Kotlin/kotlinx-datetime/issues/56
 */
actual fun DateTimeString.toInstant() = Instant.parse(value)
