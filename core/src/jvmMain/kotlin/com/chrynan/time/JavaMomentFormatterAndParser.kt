package com.chrynan.time

import java.time.Instant
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds

@ExperimentalTime
class JavaMomentFormatterAndParser(
    override val pattern: MomentFormatPattern,
    private val locale: Locale = Locale.getDefault()
) : MomentFormatter,
    MomentParser {

    private val formatter by lazy { DateTimeFormatter.ofPattern(pattern.value, locale) }

    override fun format(moment: Moment): String = formatter.format(moment.toInstant())

    override fun formatOrNull(moment: Moment): String? =
        try {
            format(moment)
        } catch (e: Exception) {
            null
        }

    override fun parse(input: String): Moment =
        try {
            val zonedDateTime = ZonedDateTime.parse(input, formatter)

            val regionId = zonedDateTime.zone.toTimeZoneRegionId()
            val offset = zonedDateTime.offset.toTimeOffset()
            val duration = zonedDateTime.toInstant().toEpochMilli().milliseconds

            JavaMoment(
                durationSinceTheEpoch = duration,
                offsetFromUtc = offset,
                timeZoneRegionId = regionId
            )
        } catch (e: Exception) {
            val instant = Instant.from(formatter.parse(input))

            JavaMoment(
                durationSinceTheEpoch = instant.toEpochMilli().milliseconds,
                offsetFromUtc = TimeOffset.ZERO,
                timeZoneRegionId = DefaultTimeZoneRegionId.UTC.regionId
            )
        }

    override fun parseOrNull(input: String): Moment? =
        try {
            parse(input)
        } catch (e: Exception) {
            null
        }
}