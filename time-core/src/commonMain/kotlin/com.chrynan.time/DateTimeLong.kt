package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline
import kotlin.time.ExperimentalTime

/**
 * A wrapper class for a [Long] value that represents milliseconds since the UTC Epoch.
 *
 * Note that this should probably be an inline class but the kotlinx.serialization library doesn't currently support
 * inline classes.
 */
@ExperimentalTime
@Serializable
@JvmInline
value class DateTimeLong(val value: Long) : PointInTime {

    override fun toInstant(): Instant = Instant.fromEpochMilliseconds(value)

    override fun toDateTimeString(): DateTimeString = toInstant().toDateTimeStringFromDurationSinceEpoch()

    override fun toDateTimeLong(): DateTimeLong = this

    override fun toString(): String = value.toString()

    companion object
}
