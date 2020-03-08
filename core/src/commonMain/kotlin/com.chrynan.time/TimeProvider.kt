package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
interface TimeProvider {

    /**
     * A [Duration] indicating the elapsed system duration. This value could be useful for measuring time differences
     * in the same environment. This is not useful for persisting this value and using it in calculations later.
     *
     * @author chRyNaN
     */
    val elapsedSystemDuration: Duration

    /**
     * The [TimeZoneOffsetProvider] used within this [TimeProvider] to calculate the offsets from UTC.
     *
     * @author chRyNaN
     */
    val timeZoneOffsetProvider: TimeZoneOffsetProvider

    /**
     * Retrieves a [Moment] for the provided [durationSinceEpoch] and [regionId]. If no [regionId] is provided the
     * default obtained by the [TimeZoneOffsetProvider.defaultTimeZoneRegionId] is used. The resulting [Moment] is
     * relative to the provided [regionId]. This is the same as obtaining the [Moment] at UTC/GMT for the
     * [durationSinceEpoch] and then offsetting it with the [regionId].
     *
     * @author chRyNaN
     */
    fun moment(
        durationSinceEpoch: Duration,
        regionId: TimeZoneRegionId = timeZoneOffsetProvider.defaultTimeZoneRegionId
    ): Moment

    /**
     * Retrieves a [Moment] for the provided [calendarDate], [timeOfDay], and [regionId]. If no [regionId] is provided
     * the default obtained by the [TimeZoneOffsetProvider.defaultTimeZoneRegionId] is used. The resulting [Moment] is
     * relative to the provided [regionId].
     *
     * @author chRyNaN
     */
    fun moment(
        calendarDate: CalendarDate,
        timeOfDay: TimeOfDay = TimeOfDay.START_OF_DAY,
        regionId: TimeZoneRegionId = timeZoneOffsetProvider.defaultTimeZoneRegionId
    ): Moment

    /**
     * Retrieves a [Moment] representing the current moment in time for the provided [regionId]. If no [regionId] is
     * provided then the default obtained by the [TimeZoneOffsetProvider.defaultTimeZoneRegionId] is used. The
     * resulting [Moment] is relative to the provided [regionId].
     *
     * @author chRyNaN
     */
    fun now(regionId: TimeZoneRegionId = timeZoneOffsetProvider.defaultTimeZoneRegionId): Moment

    /**
     * Retrieves a [MomentFormatter] for the provided [MomentFormatPattern] for converting [Moment]s into [String]s.
     *
     * @author chRyNaN
     */
    fun formatter(pattern: MomentFormatPattern): MomentFormatter

    /**
     * Retrieves a [MomentParser] for the provided [MomentFormatPattern] for converting [String]s into [Moment]s.
     *
     * @author chRyNaN
     */
    fun parser(pattern: MomentFormatPattern): MomentParser
}