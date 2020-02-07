package com.chrynan.time

import kotlin.time.ExperimentalTime

@ExperimentalTime
interface MomentParser {

    val pattern: MomentFormatPattern

    fun parse(input: String): Moment

    fun parseOrNull(input: String): Moment?
}