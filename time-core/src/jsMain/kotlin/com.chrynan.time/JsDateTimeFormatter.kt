package com.chrynan.time

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlin.time.ExperimentalTime

// FIXME
// https://github.com/felixge/node-dateformat looks promising, but only available for Node.js?
// It is MIT Licensed. It is only one file of code, so maybe adapt it to Kotlin?
@ExperimentalTime
internal class JsDateTimeFormatter(override val format: String) : DateTimeFormatter {

    override fun invoke(value: Instant, timeZone: TimeZone): String {
        TODO("Js Not Yet Implemented")
    }
}

@ExperimentalTime
actual fun DateTimeFormatter(format: String): DateTimeFormatter = JsDateTimeFormatter(format)
