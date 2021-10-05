package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import java.text.SimpleDateFormat
import java.util.*
import kotlin.time.ExperimentalTime

@ExperimentalTime
class JvmTimeFormatter(override val format: String) : TimeFormatter {

    override fun invoke(value: Instant, timeZone: TimeZone): String {
        val date = Date(value.toEpochMilliseconds())

        return getFormatter(timeZone = timeZone).format(date)
    }

    private fun getFormatter(timeZone: TimeZone, locale: java.util.Locale = java.util.Locale.getDefault()) =
        SimpleDateFormat(format, locale).apply {
            setTimeZone(timeZone.toJavaTimeZone())
        }

    private fun TimeZone.toJavaTimeZone(): java.util.TimeZone =
        java.util.TimeZone.getTimeZone(this.id)
}

@ExperimentalTime
actual fun TimeFormatter(format: String): TimeFormatter = JvmTimeFormatter(format)
