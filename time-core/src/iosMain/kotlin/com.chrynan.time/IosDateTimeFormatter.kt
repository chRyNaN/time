package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toNSTimeZone
import platform.Foundation.*
import kotlin.time.ExperimentalTime

@ExperimentalTime
internal class IosDateTimeFormatter(override val format: String) : DateTimeFormatter {

    private val nsDateFormatter = NSDateFormatter()

    override operator fun invoke(value: Instant, timeZone: TimeZone): String {
        val date = NSDate.dateWithTimeIntervalSince1970(value.epochSeconds.toDouble())

        return getFormatter(timeZone = timeZone).stringFromDate(date)
    }

    private fun getFormatter(timeZone: TimeZone, locale: NSLocale = NSLocale.currentLocale()) =
        nsDateFormatter.apply {
            setDateFormat(format)
            setTimeZone(timeZone.toNSTimeZone())
            setLocale(locale)
        }
}

@ExperimentalTime
actual fun DateTimeFormatter(format: String): DateTimeFormatter = IosDateTimeFormatter(format)
