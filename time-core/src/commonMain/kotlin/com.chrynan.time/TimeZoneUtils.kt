@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*

/**
 * Retrieves all the available [TimeZone]s that are known.
 *
 * This is a convenience for calling [TimeZone.availableZoneIds] and mapping the results each to a [TimeZone].
 *
 * @see [TimeZone.availableZoneIds]
 */
val TimeZone.Companion.availableTimeZones: Set<TimeZone>
    get() = availableZoneIds.map { of(it) }.toSet()

/**
 * Retrieves all the [FixedOffsetTimeZone]s at the provided [instant].
 */
fun TimeZone.Companion.availableFixedOffsetTimeZonesAt(instant: Instant): Set<FixedOffsetTimeZone> =
    availableTimeZones.map { it.offsetAt(instant).asTimeZone() }.toSet()

/**
 * Retrieves all the [FixedOffsetTimeZone]s at the provided [instant].
 */
fun FixedOffsetTimeZone.Companion.availableFixedOffsetTimeZonesAt(instant: Instant): Set<FixedOffsetTimeZone> =
    TimeZone.availableFixedOffsetTimeZonesAt(instant = instant)
