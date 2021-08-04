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
 * @see [TimeFormatter] For creating an instance of this interface.
 * @see [Java SimpleDateFormat](https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)
 * @see [iOS NSDateFormatter](https://developer.apple.com/documentation/foundation/nsdateformatter)
 * @see [Javascript Date Formatter Library](https://blog.stevenlevithan.com/archives/date-time-format)
 */
interface TimeFormatter {

    val format: String

    operator fun invoke(value: Instant, timeZone: TimeZone): String

    @ExperimentalTime
    fun invoke(value: UtcMillisSinceEpoch, timeZone: TimeZone): String =
        invoke(value = value.toInstant(), timeZone = timeZone)

    fun invoke(value: TimeStamp, timeZone: TimeZone): String =
        invoke(value = value.toInstant(), timeZone = timeZone)

    fun invoke(value: LocalDateTime, timeZone: TimeZone): String =
        invoke(value = value.toInstant(timeZone = timeZone), timeZone = timeZone)

    fun invoke(value: LocalDate, timeZone: TimeZone): String =
        invoke(value = value.atStartOfDayIn(timeZone = timeZone), timeZone = timeZone)
}

/**
 * Creates a [TimeFormatter] instance with the provided [format] [String] value.
 *
 * @see [TimeFormatter]
 */
expect fun TimeFormatter(format: String): TimeFormatter
