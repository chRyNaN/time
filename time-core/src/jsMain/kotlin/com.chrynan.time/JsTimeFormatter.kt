package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone

class JsTimeFormatter(override val format: String) : TimeFormatter {

    override fun invoke(instant: Instant, timeZone: TimeZone): String {
        TODO("Js Not Yet Implemented")
    }
}

actual fun TimeFormatter(format: String): TimeFormatter = JsTimeFormatter(format)
