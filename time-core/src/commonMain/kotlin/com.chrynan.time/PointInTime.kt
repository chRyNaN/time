@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * An interface representing a point in time, like a [DateTimeString] or [UtcMillisSinceEpoch], which shares
 * common functions.
 */
@ExperimentalTime
interface PointInTime : Comparable<PointInTime> {

    val durationSinceEpoch: Duration
        get() = toInstant().durationSinceEpoch

    val millisecondsSinceEpoch: Long
        get() = durationSinceEpoch.inWholeMilliseconds

    fun toInstant(): Instant

    fun toLocalDateTime(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDateTime =
        toInstant().toLocalDateTime(timeZone)

    fun toDateTimeString(): DateTimeString

    fun toUtcMillisSinceEpoch(): UtcMillisSinceEpoch

    infix fun durationTo(other: Instant): Duration =
        (other.toEpochMilliseconds() - millisecondsSinceEpoch).milliseconds

    infix fun durationTo(other: PointInTime): Duration =
        (other.millisecondsSinceEpoch - millisecondsSinceEpoch).milliseconds

    override operator fun compareTo(other: PointInTime): Int =
        when {
            this.durationSinceEpoch < other.durationSinceEpoch -> -1
            this.durationSinceEpoch > other.durationSinceEpoch -> 1
            this.durationSinceEpoch == other.durationSinceEpoch -> 0
            else -> 0
        }
}
