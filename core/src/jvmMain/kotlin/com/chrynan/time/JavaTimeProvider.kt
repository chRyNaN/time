package com.chrynan.time

import java.time.Instant
import java.time.LocalDateTime
import java.util.*
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds
import kotlin.time.nanoseconds

@ExperimentalTime
class JavaTimeProvider(
    override val timeZoneOffsetProvider: TimeZoneOffsetProvider = JavaTimeZoneOffsetProvider(),
    private val locale: Locale = Locale.getDefault()
) : TimeProvider {

    override val elapsedSystemDuration: Duration
        get() = System.nanoTime().nanoseconds

    override fun moment(durationSinceEpoch: Duration, regionId: TimeZoneRegionId): Moment {
        val offset = timeZoneOffsetProvider.offsetFor(durationSinceTheEpoch = durationSinceEpoch, regionId = regionId)

        return JavaMoment(
            durationSinceTheEpoch = durationSinceEpoch,
            timeZoneRegionId = regionId,
            offsetFromUtc = offset
        )
    }

    override fun moment(calendarDate: CalendarDate, timeOfDay: TimeOfDay, regionId: TimeZoneRegionId): Moment {
        val localDate = calendarDate.toLocalDate()
        val localTime = timeOfDay.toLocalTime()
        val localDateTime = LocalDateTime.of(localDate, localTime)

        val offset =
            timeZoneOffsetProvider.offsetFor(calendarDate = calendarDate, timeOfDay = timeOfDay, regionId = regionId)

        val duration = localDateTime.atOffset(offset.toZoneOffset()).toInstant().toEpochMilli().milliseconds

        return JavaMoment(
            durationSinceTheEpoch = duration,
            timeZoneRegionId = regionId,
            offsetFromUtc = offset
        )
    }

    override fun now(regionId: TimeZoneRegionId): Moment {
        val instant = Instant.now()
        val durationSinceEpoch = instant.toEpochMilli().milliseconds
        val offset = timeZoneOffsetProvider.offsetFor(durationSinceTheEpoch = durationSinceEpoch, regionId = regionId)

        return JavaMoment(
            durationSinceTheEpoch = durationSinceEpoch,
            timeZoneRegionId = regionId,
            offsetFromUtc = offset
        )
    }

    override fun formatter(pattern: MomentFormatPattern): MomentFormatter =
        JavaMomentFormatterAndParser(
            pattern = pattern,
            locale = locale
        )

    override fun parser(pattern: MomentFormatPattern): MomentParser =
        JavaMomentFormatterAndParser(
            pattern = pattern,
            locale = locale
        )
}