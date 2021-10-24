package com.chrynan.time

import kotlinx.datetime.*
import kotlin.time.ExperimentalTime

/**
 * A utility that formats a provided time value, such as an [Instant], to a formatted [String]
 * dependent on the [format] [String] value.
 *
 * Note that each target platform may have their own [format] structures. So it might be better to
 * use expect/actual for [format] values.
 *
 * @see [DateTimeFormatter] For creating an instance of this interface.
 * @see [Java DateTimeFormatter](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)
 * @see [iOS NSDateFormatter](https://developer.apple.com/documentation/foundation/nsdateformatter)
 * @see [Javascript Date Formatter Library](https://blog.stevenlevithan.com/archives/date-time-format)
 */
@ExperimentalTime
interface DateTimeFormatter : Converter<String> {

    val format: String

    override operator fun invoke(value: Instant, timeZone: TimeZone): String

    companion object
}

/**
 * Creates a [DateTimeFormatter] instance with the provided [format] [String] value.
 *
 * @see [DateTimeFormatter]
 */
@ExperimentalTime
expect fun DateTimeFormatter(format: String): DateTimeFormatter
