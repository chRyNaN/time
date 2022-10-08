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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IosDateTimeFormatter) return false

        if (format != other.format) return false
        if (nsDateFormatter != other.nsDateFormatter) return false

        return true
    }

    override fun hashCode(): Int {
        var result = format.hashCode()
        result = 31 * result + nsDateFormatter.hashCode()
        return result
    }

    override fun toString(): String =
        "IosDateTimeFormatter(format='$format', nsDateFormatter=$nsDateFormatter)"

    private fun getFormatter(timeZone: TimeZone, locale: NSLocale = NSLocale.currentLocale()) =
        nsDateFormatter.apply {
            setDateFormat(format)
            setTimeZone(timeZone.toNSTimeZone())
            setLocale(locale)
        }
}

@ExperimentalTime
actual fun DateTimeFormatter(format: String): DateTimeFormatter = IosDateTimeFormatter(format)
