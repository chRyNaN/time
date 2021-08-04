package com.chrynan.time

import android.icu.text.SimpleDateFormat
import kotlinx.datetime.*
import kotlinx.datetime.TimeZone
import java.util.*

class AndroidTimeFormatter(override val format: String) : TimeFormatter {

    override fun invoke(instant: Instant, timeZone: TimeZone): String {
        val date = Date(instant.toEpochMilliseconds())

        return getFormatter(timeZone = timeZone).format(date)
    }

    private fun getFormatter(timeZone: TimeZone, locale: Locale = Locale.getDefault()) =
        SimpleDateFormat(format, locale).apply {
            setTimeZone(timeZone.toAndroidTimeZone())
        }

    private fun TimeZone.toAndroidTimeZone(): android.icu.util.TimeZone =
        android.icu.util.TimeZone.getTimeZone(this.id)
}

actual fun TimeFormatter(format: String): TimeFormatter = AndroidTimeFormatter(format)
