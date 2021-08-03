@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*
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
value class UtcMillisSinceEpoch(@Suppress("MemberVisibilityCanBePrivate") val value: Long) {

    val duration: Duration
        get() = value.milliseconds

    fun toInstant(): Instant = Instant.fromEpochMilliseconds(value)

    fun toLocalDateTime(timeZone: TimeZone): LocalDateTime =
        toInstant().toLocalDateTime(timeZone = timeZone)

    fun toLocalDate(timeZone: TimeZone): LocalDate =
        toInstant().toLocalDateTime(timeZone = timeZone).date

    companion object
}

@ExperimentalTime
fun Instant.toUtcMillisSinceEpoch(): UtcMillisSinceEpoch =
    UtcMillisSinceEpoch(toEpochMilliseconds())

@ExperimentalTime
fun LocalDateTime.toUtcMillisSinceEpoch(timeZone: TimeZone): UtcMillisSinceEpoch =
    toInstant(timeZone).toUtcMillisSinceEpoch()

@ExperimentalTime
fun LocalDate.toStartOfDayDateTimeLong(timeZone: TimeZone = TimeZone.currentSystemDefault()): UtcMillisSinceEpoch =
    this.atStartOfDayIn(timeZone).toUtcMillisSinceEpoch()

@ExperimentalTime
fun Duration.toUtcMillisSinceEpoch(): UtcMillisSinceEpoch =
    UtcMillisSinceEpoch(toInstantSinceEpoch().toEpochMilliseconds())

@ExperimentalTime
fun Long.toUtcMillisSinceEpoch(): UtcMillisSinceEpoch =
    UtcMillisSinceEpoch(value = this)

@ExperimentalTime
fun Clock.nowUtcMillisSinceEpoch(): UtcMillisSinceEpoch = now().toUtcMillisSinceEpoch()
