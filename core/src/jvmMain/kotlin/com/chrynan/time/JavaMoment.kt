package com.chrynan.time

import java.time.Instant
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds

@ExperimentalTime
class JavaMoment internal constructor(
    override val durationSinceTheEpoch: Duration,
    override val offsetFromUtc: TimeOffset,
    override val timeZoneRegionId: TimeZoneRegionId
) : Moment {

    private val instant: Instant = Instant.ofEpochMilli(durationSinceTheEpoch.toLongMilliseconds())

    override val calendarDate: CalendarDate = instant.atOffset(offsetFromUtc.toZoneOffset()).toCalendarDate()

    override val timeOfDay: TimeOfDay = instant.atOffset(offsetFromUtc.toZoneOffset()).toTimeOfDay()

    override fun plus(duration: Duration): Moment = JavaMoment(
        durationSinceTheEpoch = durationSinceTheEpoch + duration,
        offsetFromUtc = offsetFromUtc,
        timeZoneRegionId = timeZoneRegionId
    )

    override fun minus(duration: Duration): Moment = JavaMoment(
        durationSinceTheEpoch = durationSinceTheEpoch - duration,
        offsetFromUtc = offsetFromUtc,
        timeZoneRegionId = timeZoneRegionId
    )

    override fun startOfDay(): Moment {
        val millis = calendarDate.toLocalDate().atStartOfDay().toInstant(offsetFromUtc.toZoneOffset()).toEpochMilli()

        return JavaMoment(
            durationSinceTheEpoch = millis.milliseconds,
            offsetFromUtc = offsetFromUtc,
            timeZoneRegionId = timeZoneRegionId
        )
    }

    override fun toUtc(): Moment = JavaMoment(
        durationSinceTheEpoch = durationSinceTheEpoch,
        offsetFromUtc = TimeOffset.ZERO,
        timeZoneRegionId = DefaultTimeZoneRegionId.UTC.regionId
    )
}