@file:Suppress("unused")

package com.chrynan.time

import android.text.format.DateUtils
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
class AndroidRelativeTimeFormatter(
    private val timeProvider: TimeProvider = TimeProvider()
) : RelativeTimeFormatter {

    override fun formatPastDurationRelativeToNow(pastDuration: Duration): CharSequence {
        val now = timeProvider.now().toEpochMilliseconds()

        return DateUtils.getRelativeTimeSpanString(
            now - pastDuration.inWholeMilliseconds,
            now,
            0L,
            DateUtils.FORMAT_ABBREV_ALL
        )
    }

    override fun formatFutureDurationRelativeToNow(futureDuration: Duration): CharSequence {
        val now = timeProvider.now().toEpochMilliseconds()

        return DateUtils.getRelativeTimeSpanString(
            now + futureDuration.inWholeMilliseconds,
            now,
            DateUtils.MINUTE_IN_MILLIS
        )
    }

    override fun formatElapsedTime(duration: Duration): CharSequence =
        DateUtils.formatElapsedTime(duration.inWholeSeconds)
}
