package com.chrynan.time

import kotlinx.datetime.LocalDate

@UnstableTimeApi
actual fun LocalDate.weekOfYear(locale: Locale): Int =
    throw UnsupportedOperationException("LocalDate.weekOfYear is currently not supported in Javascript.")

@UnstableTimeApi
actual fun LocalDate.weekOfMonth(locale: Locale): Int =
    throw UnsupportedOperationException("LocalDate.weekOfYear is currently not supported in Javascript.")
