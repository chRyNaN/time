package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline
import kotlin.time.ExperimentalTime

@ExperimentalTime
@Serializable
@JvmInline
value class InstantPointInTime(val value: Instant) : PointInTime {

    override fun toInstant(): Instant = value

    override fun toDateTimeString(): DateTimeString = value.toDateTimeStringFromDurationSinceEpoch()

    override fun toDateTimeLong(): DateTimeLong = value.toDateTimeLong()
}
