package com.chrynan.time

import java.time.*
import java.util.*
import kotlin.time.ExperimentalTime
import kotlin.time.nanoseconds
import kotlin.time.seconds

/**
 * Converts this [TimeZoneRegionId] to a Java Time [ZoneId].
 *
 * @author chRyNaN
 */
fun TimeZoneRegionId.toZoneId(): ZoneId = ZoneId.of(id)

/**
 * Converts this Java Time [ZoneId] to a [TimeZoneRegionId].
 *
 * @author chRyNaN
 */
fun ZoneId.toTimeZoneRegionId(): TimeZoneRegionId = TimeZoneRegionId(id)

/**
 * Converts this Java Time [LocalDateTime] to a [TimeOfDay].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun LocalDateTime.toTimeOfDay(): TimeOfDay = toLocalTime().toTimeOfDay()

/**
 * Converts this Java Time [LocalDateTime] to a [CalendarDate].
 *
 * @author chRyNaN
 */
fun LocalDateTime.toCalendarDate(): CalendarDate = toLocalDate().toCalendarDate()

/**
 * Converts this Java Time [ZonedDateTime] to a [TimeOfDay].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun ZonedDateTime.toTimeOfDay(): TimeOfDay = toLocalTime().toTimeOfDay()

/**
 * Converts this Java Time [ZonedDateTime] to a [CalendarDate].
 *
 * @author chRyNaN
 */
fun ZonedDateTime.toCalendarDate(): CalendarDate = toLocalDate().toCalendarDate()

/**
 * Converts this Java Time [OffsetDateTime] to a [TimeOfDay].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun OffsetDateTime.toTimeOfDay(): TimeOfDay = toLocalTime().toTimeOfDay()

/**
 * Converts this Java Time [OffsetDateTime] to a [CalendarDate].
 *
 * @author chRyNaN
 */
fun OffsetDateTime.toCalendarDate(): CalendarDate = toLocalDate().toCalendarDate()

/**
 * Converts this Java Time [LocalTime] to a [TimeOfDay].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun LocalTime.toTimeOfDay(): TimeOfDay =
    TimeOfDay(elapsedDurationInDay = nano.nanoseconds)

/**
 * Converts this [TimeOfDay] to a Java Time [LocalTime].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeOfDay.toLocalTime(): LocalTime =
    LocalTime.of(
        hourInDay(ClockConvention.TWENTY_FOUR_HOUR_CLOCK).value,
        minuteInHour.value,
        secondInMinute.value,
        (millisecondInSecond.value * TimeUtils.NANOSECONDS_IN_MILLISECOND).toInt()
    )

/**
 * Converts this Java Time [LocalDate] to a [CalendarDate].
 *
 * @author chRyNaN
 */
fun LocalDate.toCalendarDate(): CalendarDate =
    CalendarDate(
        year = Year(year.toLong()),
        dayInYear = DayInYear(dayOfYear),
        dayInMonth = DayInMonth(dayOfMonth),
        dayOfWeek = dayOfWeek.toDayOfWeek(),
        month = month.toMonth()
    )

/**
 * Converts this [CalendarDate] to a Java Time [LocalDate].
 *
 * @author chRyNaN
 */
fun CalendarDate.toLocalDate(): LocalDate = LocalDate.of(year.value.toInt(), month.toJavaMonth(), dayInMonth.value)

/**
 * Converts this [CalendarDateAndTime] to a Java Time [LocalDate].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun CalendarDateAndTime.toLocalDate(): LocalDate = calendarDate.toLocalDate()

/**
 * Converts this [CalendarDateAndTime] to a Java Time [LocalTime].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun CalendarDateAndTime.toLocalTime(): LocalTime = timeOfDay.toLocalTime()

/**
 * Converts this [CalendarDateAndTime] to a Java Time [LocalDateTime].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun CalendarDateAndTime.toLocalDateTime(): LocalDateTime =
    LocalDateTime.of(calendarDate.toLocalDate(), timeOfDay.toLocalTime())

/**
 * Converts this Java Time [java.time.DayOfWeek] to a [DayOfWeek].
 *
 * @author chRyNaN
 */
fun java.time.DayOfWeek.toDayOfWeek(): DayOfWeek = when (this) {
    java.time.DayOfWeek.SUNDAY -> DayOfWeek.SUNDAY
    java.time.DayOfWeek.MONDAY -> DayOfWeek.MONDAY
    java.time.DayOfWeek.TUESDAY -> DayOfWeek.TUESDAY
    java.time.DayOfWeek.WEDNESDAY -> DayOfWeek.WEDNESDAY
    java.time.DayOfWeek.THURSDAY -> DayOfWeek.THURSDAY
    java.time.DayOfWeek.FRIDAY -> DayOfWeek.FRIDAY
    java.time.DayOfWeek.SATURDAY -> DayOfWeek.SATURDAY
}

/**
 * Converts this [DayOfWeek] to a Java Time [java.time.DayOfWeek].
 *
 * @author chRyNaN
 */
fun DayOfWeek.toJavaDayOfWeek(): java.time.DayOfWeek = when (this) {
    DayOfWeek.SUNDAY -> java.time.DayOfWeek.SUNDAY
    DayOfWeek.MONDAY -> java.time.DayOfWeek.MONDAY
    DayOfWeek.TUESDAY -> java.time.DayOfWeek.TUESDAY
    DayOfWeek.WEDNESDAY -> java.time.DayOfWeek.WEDNESDAY
    DayOfWeek.THURSDAY -> java.time.DayOfWeek.THURSDAY
    DayOfWeek.FRIDAY -> java.time.DayOfWeek.FRIDAY
    DayOfWeek.SATURDAY -> java.time.DayOfWeek.SATURDAY
}

/**
 * Converts this Java Time [java.time.Month] to a [Month].
 *
 * @author chRyNaN
 */
fun java.time.Month.toMonth(): Month = when (this) {
    java.time.Month.JANUARY -> Month.JANUARY
    java.time.Month.FEBRUARY -> Month.FEBRUARY
    java.time.Month.MARCH -> Month.MARCH
    java.time.Month.APRIL -> Month.APRIL
    java.time.Month.MAY -> Month.MAY
    java.time.Month.JUNE -> Month.JUNE
    java.time.Month.JULY -> Month.JULY
    java.time.Month.AUGUST -> Month.AUGUST
    java.time.Month.SEPTEMBER -> Month.SEPTEMBER
    java.time.Month.OCTOBER -> Month.OCTOBER
    java.time.Month.NOVEMBER -> Month.NOVEMBER
    java.time.Month.DECEMBER -> Month.DECEMBER
}

/**
 * Converts this [Month] to a Java Time [java.time.Month].
 *
 * @author chRyNaN
 */
fun Month.toJavaMonth(): java.time.Month = when (this) {
    Month.JANUARY -> java.time.Month.JANUARY
    Month.FEBRUARY -> java.time.Month.FEBRUARY
    Month.MARCH -> java.time.Month.MARCH
    Month.APRIL -> java.time.Month.APRIL
    Month.MAY -> java.time.Month.MAY
    Month.JUNE -> java.time.Month.JUNE
    Month.JULY -> java.time.Month.JULY
    Month.AUGUST -> java.time.Month.AUGUST
    Month.SEPTEMBER -> java.time.Month.SEPTEMBER
    Month.OCTOBER -> java.time.Month.OCTOBER
    Month.NOVEMBER -> java.time.Month.NOVEMBER
    Month.DECEMBER -> java.time.Month.DECEMBER
}

/**
 * Converts this Java Time [ZoneOffset] to a [TimeOffset].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun ZoneOffset.toTimeOffset(): TimeOffset {
    val duration = totalSeconds.seconds
    val hours = duration.inHours.toLong()
    val minutes = duration.inMinutes.toLong() % TimeUtils.MINUTES_IN_HOUR
    val seconds = duration.inSeconds.toLong() % TimeUtils.SECONDS_IN_MINUTE

    return TimeOffset(hours = Hours(hours), minutes = Minutes(minutes), seconds = Seconds(seconds))
}

/**
 * Converts this [TimeOffset] to a Java Time [ZoneOffset].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun TimeOffset.toZoneOffset(): ZoneOffset = ZoneOffset.ofTotalSeconds(duration.inSeconds.toInt())

/**
 * Converts this [Moment] to a Java Time [LocalDateTime].
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun Moment.toLocalDateTime(): LocalDateTime = calendarDateAndTime.toLocalDateTime()

/**
 * Converts this [Moment] to a Java Time [Instant] by first converting this [Moment] to a UTC time.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun Moment.toInstant(): Instant = Instant.ofEpochMilli(toUtc().durationSinceTheEpoch.inMilliseconds.toLong())

/**
 * Converts this [Moment] to a Java Time [Instant] by first converting this [Moment] to a UTC time.
 *
 * @author chRyNaN
 */
@ExperimentalTime
fun Moment.toDate(): Date = Date.from(toInstant())