@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

/**
 * A wrapper class for a [Long] value that represents milliseconds since the UTC Epoch.
 */
@ExperimentalTime
@Serializable
@JvmInline
value class UtcMillisSinceEpoch(val value: Long) : PointInTime {

    val duration: Duration
        get() = value.milliseconds

    override fun toInstant(): Instant = Instant.fromEpochMilliseconds(value)

    override fun toUtcMillisSinceEpoch(): UtcMillisSinceEpoch = this

    override fun toString(): String = value.toString()

    companion object
}
