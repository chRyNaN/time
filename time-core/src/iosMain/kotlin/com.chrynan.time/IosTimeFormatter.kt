package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toNSTimeZone
import platform.Foundation.*

class IosTimeFormatter(override val format: String) : TimeFormatter {

    override operator fun invoke(value: Instant, timeZone: TimeZone): String {
        val date = NSDate.dateWithTimeIntervalSince1970(value.epochSeconds.toDouble())

        return getFormatter(timeZone = timeZone).stringFromDate(date)
    }

    private fun getFormatter(timeZone: TimeZone, locale: NSLocale = NSLocale.currentLocale()) =
        NSDateFormatter().apply {
            setDateFormat(format)
            setTimeZone(timeZone.toNSTimeZone())
            setLocale(locale)
        }
}

actual fun TimeFormatter(format: String): TimeFormatter = IosTimeFormatter(format)
