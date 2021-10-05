package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlin.time.ExperimentalTime

@ExperimentalTime
class JsTimeFormatter(override val format: String) : TimeFormatter {

    override fun invoke(value: Instant, timeZone: TimeZone): String {
        TODO("Js Not Yet Implemented")
    }
}

@ExperimentalTime
actual fun TimeFormatter(format: String): TimeFormatter = JsTimeFormatter(format)
