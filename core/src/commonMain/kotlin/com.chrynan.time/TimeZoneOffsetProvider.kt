package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
interface TimeZoneOffsetProvider {

    val defaultTimeZoneRegionId: TimeZoneRegionId

    fun offsetFor(durationSinceTheEpoch: Duration, regionId: TimeZoneRegionId): TimeOffset

    fun offsetFor(calendarDate: CalendarDate, timeOfDay: TimeOfDay, regionId: TimeZoneRegionId): TimeOffset

    fun offsetFor(moment: Moment, regionId: TimeZoneRegionId): TimeOffset =
        offsetFor(durationSinceTheEpoch = moment.durationSinceTheEpoch, regionId = regionId)
}