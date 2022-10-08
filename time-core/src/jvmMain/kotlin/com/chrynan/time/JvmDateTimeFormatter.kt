package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toJavaInstant
import java.time.ZoneId
import kotlin.time.ExperimentalTime

@ExperimentalTime
internal class JvmDateTimeFormatter(override val format: String) : DateTimeFormatter {

    private val dateTimeFormatter = java.time.format.DateTimeFormatter.ofPattern(format)

    override fun invoke(value: Instant, timeZone: TimeZone): String =
        dateTimeFormatter.withZone(timeZone.toZoneId()).format(value.toJavaInstant())

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JvmDateTimeFormatter) return false

        if (format != other.format) return false
        if (dateTimeFormatter != other.dateTimeFormatter) return false

        return true
    }

    override fun hashCode(): Int {
        var result = format.hashCode()
        result = 31 * result + (dateTimeFormatter?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String =
        "JvmDateTimeFormatter(format='$format', dateTimeFormatter=$dateTimeFormatter)"

    private fun TimeZone.toZoneId(): ZoneId = ZoneId.of(id)
}

@ExperimentalTime
actual fun DateTimeFormatter(format: String): DateTimeFormatter = JvmDateTimeFormatter(format)
