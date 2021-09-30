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
value class UtcMillisSinceEpoch(@Suppress("MemberVisibilityCanBePrivate") val value: Long) :
    Comparable<UtcMillisSinceEpoch> {

    val duration: Duration
        get() = value.milliseconds

    override fun compareTo(other: UtcMillisSinceEpoch): Int = value.compareTo(other.value)

    companion object
}

@ExperimentalTime
fun UtcMillisSinceEpoch.toInstant(): Instant = Instant.fromEpochMilliseconds(value)

@ExperimentalTime
fun UtcMillisSinceEpoch.toLocalDateTime(timeZone: TimeZone): LocalDateTime =
    toInstant().toLocalDateTime(timeZone = timeZone)

@ExperimentalTime
fun UtcMillisSinceEpoch.toLocalDate(timeZone: TimeZone): LocalDate =
    toInstant().toLocalDateTime(timeZone = timeZone).date

@ExperimentalTime
fun Instant.toUtcMillisSinceEpoch(): UtcMillisSinceEpoch =
    UtcMillisSinceEpoch(toEpochMilliseconds())

@ExperimentalTime
fun LocalDateTime.toUtcMillisSinceEpoch(timeZone: TimeZone): UtcMillisSinceEpoch =
    toInstant(timeZone).toUtcMillisSinceEpoch()

@ExperimentalTime
fun LocalDate.toStartOfDayUtcMillisSinceEpoch(timeZone: TimeZone): UtcMillisSinceEpoch =
    this.atStartOfDayIn(timeZone).toUtcMillisSinceEpoch()

@ExperimentalTime
fun Duration.toUtcMillisSinceEpoch(): UtcMillisSinceEpoch =
    UtcMillisSinceEpoch(toInstantSinceEpoch().toEpochMilliseconds())

@ExperimentalTime
fun Long.toUtcMillisSinceEpoch(): UtcMillisSinceEpoch =
    UtcMillisSinceEpoch(value = this)
