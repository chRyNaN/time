package com.chrynan.time

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
class JavaTimeZoneOffsetProvider : TimeZoneOffsetProvider {

    override val defaultTimeZoneRegionId: TimeZoneRegionId
        get() = ZoneId.systemDefault().toTimeZoneRegionId()

    override fun offsetFor(calendarDate: CalendarDate, timeOfDay: TimeOfDay, regionId: TimeZoneRegionId): TimeOffset {
        val zonedDateTime =
            LocalDateTime.of(calendarDate.toLocalDate(), timeOfDay.toLocalTime()).atZone(regionId.toZoneId())

        return zonedDateTime.offset.toTimeOffset()
    }

    override fun offsetFor(durationSinceTheEpoch: Duration, regionId: TimeZoneRegionId): TimeOffset {
        val instant = Instant.ofEpochMilli(durationSinceTheEpoch.toLongMilliseconds())
        val zoneId = regionId.toZoneId()

        return instant.atZone(zoneId).offset.toTimeOffset()
    }
}