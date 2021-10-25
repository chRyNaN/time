@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.*

val TimeZone.Companion.availableTimeZones: Set<TimeZone>
    get() = availableZoneIds.map { of(it) }.toSet()

fun TimeZone.Companion.availableFixedOffsetTimeZonesAt(instant: Instant): Set<FixedOffsetTimeZone> =
    availableTimeZones.map { it.offsetAt(instant).asTimeZone() }.toSet()

fun FixedOffsetTimeZone.Companion.availableFixedOffsetTimeZonesAt(instant: Instant): Set<FixedOffsetTimeZone> =
    TimeZone.availableFixedOffsetTimeZonesAt(instant = instant)
