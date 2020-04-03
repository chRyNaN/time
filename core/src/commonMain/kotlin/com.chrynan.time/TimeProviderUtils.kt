package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource
import kotlin.time.days

/**
 * Retrieves the [Moment] representing the start of today. This is a convenience function for calling
 * [TimeProvider.now] followed by [Moment.startOfDay].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.today(regionId: TimeZoneRegionId = timeZoneOffsetProvider.defaultTimeZoneRegionId): Moment =
    now(regionId = regionId).startOfDay()

/**
 * Retrieves the [Moment] representing the start of the day prior to today. This is a convenience function for calling
 * [TimeProvider.now] followed by [Moment.startOfDay] and then subtracting a one day [Duration].
 *
 * @author chRyNan
 */
@ExperimentalTime
fun TimeProvider.yesterday(regionId: TimeZoneRegionId = timeZoneOffsetProvider.defaultTimeZoneRegionId): Moment =
    now(regionId = regionId).startOfDay() - 1.days

/**
 * Retrieves the [Moment] representing the start of the day after today. This is a convenience function for calling
 * [TimeProvider.now] followed by [Moment.startOfDay] and then adding a one day [Duration].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.tomorrow(regionId: TimeZoneRegionId = timeZoneOffsetProvider.defaultTimeZoneRegionId): Moment =
    now(regionId = regionId).startOfDay() + 1.days

/**
 * Determines whether the provided [moment] is the same date as today. This is a convenience function for calling
 * [TimeProvider.now] and then calling [Moment.isSameDateAs] on that and the provided value to determine if they are
 * the same date.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.isToday(
    moment: Moment,
    regionId: TimeZoneRegionId = timeZoneOffsetProvider.defaultTimeZoneRegionId
): Boolean = now(regionId = regionId).isSameDateAs(moment)

/**
 * Retrieves the [Moment] that represents the epoch at UTC/GMT (January 1, 1970 [midnight UTC/GMT], not counting
 * leap seconds [in ISO 8601: 1970-01-01T00:00:00Z]). This is a static value. This is different from the [utc]
 * function which retrieves the current [Moment] at UTC/GMT. This [epoch] function retrieves the static [Moment]
 * representing the epoch. The value returned is offset by the provided [regionId]. If no [regionId] is provided
 * then the [DefaultTimeZoneRegionId.UTC.regionId] is used.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.epoch(regionId: TimeZoneRegionId = DefaultTimeZoneRegionId.UTC.regionId): Moment =
    moment(durationSinceEpoch = Duration.ZERO, regionId = regionId)

/**
 * Retrieves the [Moment] that represents the unix epoch time, or the time that has elapsed at UTC since the epoch
 * (January 1, 1970 [midnight UTC/GMT], not counting leap seconds [in ISO 8601: 1970-01-01T00:00:00Z]). The region
 * for this time is static at UTC/GMT.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.utc(): Moment = now(regionId = DefaultTimeZoneRegionId.UTC.regionId)

/**
 * An alias for the [TimeProvider.utc] function.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.unix(): Moment = utc()

/**
 * A convenience function for obtaining the duration since the epoch by calling [TimeProvider.unix] and then
 * [Moment.durationSinceTheEpoch].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.durationSinceEpoch() = unix().durationSinceTheEpoch

/**
 * Retrieves the [Moment] from offsetting the [TimeOffset] obtained from the [regionId].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.offset(moment: Moment, regionId: TimeZoneRegionId): Moment {
    val offset = timeZoneOffsetProvider.offsetFor(moment, regionId)
    return moment + offset
}

/**
 * Retrieves the [Moment] from the provided [CalendarDateAndTime] and [regionId]. This is a convenience function for
 * calling [TimeProvider.moment].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.moment(
    calendarDateAndTime: CalendarDateAndTime,
    regionId: TimeZoneRegionId = timeZoneOffsetProvider.defaultTimeZoneRegionId
): Moment =
    moment(
        calendarDate = calendarDateAndTime.calendarDate,
        timeOfDay = calendarDateAndTime.timeOfDay,
        regionId = regionId
    )

/**
 * Retrieves a [MomentFormatter] for the provided [pattern] for converting [Moment]s into [String]s. This is a
 * convenience function that converts the provided [pattern] [String] to a [MomentFormatPattern], and then calls the
 * [TimeProvider.formatter] function.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.formatter(pattern: String): MomentFormatter = formatter(pattern = MomentFormatPattern(pattern))

/**
 * Retrieves a [MomentParser] for the provided [pattern] for converting [String]s into [Moment]s. This is a
 * convenience function that converts the provided [pattern] [String] to a [MomentFormatPattern], and then calls the
 * [TimeProvider.parser] function.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.parser(pattern: String): MomentParser = parser(pattern = MomentFormatPattern(pattern))

/**
 * A convenience function for accessing the [TimeSource.Monotonic] [TimeSource] to track elapsed time.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeProvider.monotonic(): TimeSource = TimeSource.Monotonic
