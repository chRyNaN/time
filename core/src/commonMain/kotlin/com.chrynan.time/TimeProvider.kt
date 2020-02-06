package com.chrynan.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
interface TimeProvider {

    val elapsedSystemDuration: Duration

    fun moment(durationSinceEpoch: Duration): Moment

    fun moment(calendarDate: CalendarDate): Moment

    fun now(): Moment

    fun epoch(): Moment = moment(durationSinceEpoch = Duration.ZERO)
}