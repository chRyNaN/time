@file:Suppress("unused")

package com.chrynan.time.android

import android.text.format.DateUtils
import com.chrynan.time.DateTimeString
import com.chrynan.time.TimeFormatter
import com.chrynan.time.TimeProvider
import com.chrynan.time.millisecondsSinceEpoch
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
class AndroidTimeFormatter(
    private val timeProvider: TimeProvider = TimeProvider()
) : TimeFormatter {

    override fun formatPastRelativeToNow(pastTime: DateTimeString): CharSequence =
        DateUtils.getRelativeTimeSpanString(
            pastTime.millisecondsSinceEpoch,
            timeProvider.now().toEpochMilliseconds(),
            0L,
            DateUtils.FORMAT_ABBREV_ALL
        )

    override fun formatPastDurationRelativeToNow(pastDuration: Duration): CharSequence {
        val now = timeProvider.now().toEpochMilliseconds()

        return DateUtils.getRelativeTimeSpanString(
            now - pastDuration.toLongMilliseconds(),
            now,
            0L,
            DateUtils.FORMAT_ABBREV_ALL
        )
    }

    override fun formatFutureRelativeToNow(futureTime: DateTimeString): CharSequence =
        DateUtils.getRelativeTimeSpanString(
            futureTime.millisecondsSinceEpoch,
            timeProvider.now().toEpochMilliseconds(),
            DateUtils.MINUTE_IN_MILLIS
        )

    override fun formatFutureDurationRelativeToNow(futureDuration: Duration): CharSequence {
        val now = timeProvider.now().toEpochMilliseconds()

        return DateUtils.getRelativeTimeSpanString(
            now + futureDuration.toLongMilliseconds(),
            now,
            DateUtils.MINUTE_IN_MILLIS
        )
    }

    override fun formatElapsedTime(duration: Duration): CharSequence =
        DateUtils.formatElapsedTime(duration.inSeconds.toLong())
}
