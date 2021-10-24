package com.chrynan.time

import kotlinx.datetime.*
import kotlin.time.ExperimentalTime

/**
 * An interface that converts an [Instant] and its related [TimeZone] to a value of type [T].
 */
fun interface Converter<T> {

    operator fun invoke(value: Instant, timeZone: TimeZone): T

    companion object
}

@ExperimentalTime
fun <T> Converter<T>.invoke(value: UtcMillisSinceEpoch, timeZone: TimeZone): T =
    invoke(value = value.toInstant(), timeZone = timeZone)

@ExperimentalTime
fun <T> Converter<T>.invoke(value: TimeStamp, timeZone: TimeZone): T =
    invoke(value = value.toInstant(), timeZone = timeZone)

@ExperimentalTime
fun <T> Converter<T>.invoke(value: LocalDateTime, timeZone: TimeZone): T =
    invoke(value = value.toInstant(timeZone = timeZone), timeZone = timeZone)

@ExperimentalTime
fun <T> Converter<T>.invoke(value: LocalDate, timeZone: TimeZone): T =
    invoke(value = value.atStartOfDayIn(timeZone = timeZone), timeZone = timeZone)
