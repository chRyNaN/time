package com.chrynan.time

import kotlin.time.ExperimentalTime

@ExperimentalTime
interface MomentFormatter {

    val pattern: MomentFormatPattern

    fun format(moment: Moment): String

    fun formatOrNull(moment: Moment): String?
}