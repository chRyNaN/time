package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlin.time.ExperimentalTime

@ExperimentalTime
internal class JsDateTimeFormatter(override val format: String) : DateTimeFormatter {

    override fun invoke(value: Instant, timeZone: TimeZone): String {
        TODO("Js Not Yet Implemented")
    }
}

@ExperimentalTime
actual fun DateTimeFormatter(format: String): DateTimeFormatter = JsDateTimeFormatter(format)
