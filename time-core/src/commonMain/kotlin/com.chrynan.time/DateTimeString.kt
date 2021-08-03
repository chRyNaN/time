package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline
import kotlin.time.ExperimentalTime

/**
 * A wrapper class for a [String] value that indicates that this [String] value is in ISO-8601 format.
 *
 * For more information refer to the following:
 * https://en.wikipedia.org/wiki/ISO_8601
 *
 * Note that this should probably be an inline class but the kotlinx.serialization library doesn't currently support
 * inline classes.
 */
@ExperimentalTime
@Serializable
@JvmInline
value class DateTimeString(val value: String) : PointInTime {

    override fun toInstant(): Instant = convertDateTimeStringToInstant(value = this)

    override fun toDateTimeString(): DateTimeString = this

    override fun toUtcMillisSinceEpoch(): UtcMillisSinceEpoch = toInstant().toUtcMillisSinceEpoch()

    override fun toString(): String = value

    companion object
}
