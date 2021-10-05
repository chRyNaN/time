package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.toNSDateComponents

@UnstableTimeApi
actual fun LocalDate.weekOfYear(locale: Locale): Int =
    this.toNSDateComponents().weekOfYear.toInt()

@UnstableTimeApi
actual fun LocalDate.weekOfMonth(locale: Locale): Int =
    this.toNSDateComponents().weekOfMonth.toInt()
