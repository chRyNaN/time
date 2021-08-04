package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import java.text.SimpleDateFormat
import java.util.*

class JvmTimeFormatter(override val format: String) : TimeFormatter {

    override fun invoke(instant: Instant, timeZone: TimeZone): String {
        val date = Date(instant.toEpochMilliseconds())

        return getFormatter(timeZone = timeZone).format(date)
    }

    private fun getFormatter(timeZone: TimeZone, locale: Locale = Locale.getDefault()) =
        SimpleDateFormat(format, locale).apply {
            setTimeZone(timeZone.toJavaTimeZone())
        }

    private fun TimeZone.toJavaTimeZone(): java.util.TimeZone =
        java.util.TimeZone.getTimeZone(this.id)
}

actual fun TimeFormatter(format: String): TimeFormatter = JvmTimeFormatter(format)
