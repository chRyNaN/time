package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toJavaInstant
import java.time.ZoneId
import kotlin.time.ExperimentalTime

@ExperimentalTime
class JvmTimeFormatter(override val format: String) : TimeFormatter {

    private val dateTimeFormatter = java.time.format.DateTimeFormatter.ofPattern(format)

    override fun invoke(value: Instant, timeZone: TimeZone): String =
        dateTimeFormatter.withZone(timeZone.toZoneId()).format(value.toJavaInstant())

    private fun TimeZone.toZoneId(): ZoneId = ZoneId.of(id)
}

@ExperimentalTime
actual fun TimeFormatter(format: String): TimeFormatter = JvmTimeFormatter(format)
