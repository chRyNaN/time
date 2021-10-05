@file:Suppress("unused")

package com.chrynan.time

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime

@UnstableTimeApi
expect fun LocalDate.weekOfYear(locale: Locale): Int

@UnstableTimeApi
expect fun LocalDate.weekOfMonth(locale: Locale): Int

@UnstableTimeApi
fun LocalDateTime.weekOfYear(locale: Locale): Int =
    this.date.weekOfYear(locale = locale)

@UnstableTimeApi
fun LocalDateTime.weekOfMonth(locale: Locale): Int =
    this.date.weekOfMonth(locale = locale)
