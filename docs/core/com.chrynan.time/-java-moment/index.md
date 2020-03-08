[core](../../index.md) / [com.chrynan.time](../index.md) / [JavaMoment](./index.md)

# JavaMoment

(JVM, COMMON) `@ExperimentalTime class JavaMoment : `[`Moment`](../-moment/index.md)

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [calendarDate](calendar-date.md) | Retrieves a [CalendarDate](../-calendar-date/index.md) for this [Moment](../-moment/index.md). This represents a day within a calendar year with no respect to exact time or region information. For time information, refer to the [timeOfDay](../-moment/time-of-day.md) property.`val calendarDate: `[`CalendarDate`](../-calendar-date/index.md) |
| (JVM, COMMON) [durationSinceTheEpoch](duration-since-the-epoch.md) | The amount of time from the unix epoch (00:00:00 UTC on 1 January 1970). The value is a [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) representing the difference between the current moment and the unix epoch moment. This value can be negative if it is before the epoch.`val durationSinceTheEpoch: `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| (JVM, COMMON) [offsetFromUtc](offset-from-utc.md) | Retrieves a [TimeOffset](../-time-offset/index.md) indicating the utc offset from the utc origin time.`val offsetFromUtc: `[`TimeOffset`](../-time-offset/index.md) |
| (JVM, COMMON) [timeOfDay](time-of-day.md) | Retrieves a [TimeOfDay](../-time-of-day/index.md) for this [Moment](../-moment/index.md). This represents exact time within a calendar day with no respect to the date or region information. For date information, refer to the [calendarDate](../-moment/calendar-date.md) property.`val timeOfDay: `[`TimeOfDay`](../-time-of-day/index.md) |
| (JVM, COMMON) [timeZoneRegionId](time-zone-region-id.md) | Retrieves a [TimeZoneRegionId](../-time-zone-region-id/index.md) for this [Moment](../-moment/index.md) if one is available.`val timeZoneRegionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md) |

### Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [minus](minus.md) | `fun minus(duration: `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)`): `[`Moment`](../-moment/index.md) |
| (JVM, COMMON) [plus](plus.md) | `fun plus(duration: `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)`): `[`Moment`](../-moment/index.md) |
| (JVM, COMMON) [startOfDay](start-of-day.md) | Returns a new [Moment](../-moment/index.md) representing the start of the current day.`fun startOfDay(): `[`Moment`](../-moment/index.md) |
| (JVM, COMMON) [toUtc](to-utc.md) | Retrieves a new [Moment](../-moment/index.md) representing the same time as this [Moment](../-moment/index.md) but in the UTC/GMT region. This is similar to subtracting the [offsetFromUtc](../-moment/offset-from-utc.md) from this [Moment](../-moment/index.md) and updating the [timeZoneRegionId](../-moment/time-zone-region-id.md) to be [DefaultTimeZoneRegionId.UTC](../-default-time-zone-region-id/-u-t-c.md).`fun toUtc(): `[`Moment`](../-moment/index.md) |

### Extension Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [compareTo](../compare-to.md) | `operator fun `[`Moment`](../-moment/index.md)`.compareTo(other: `[`Moment`](../-moment/index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| (JVM, COMMON) [isSameDateAs](../is-same-date-as.md) | Determines whether this [Moment](../-moment/index.md) and the provided [other](../is-same-date-as.md#com.chrynan.time$isSameDateAs(com.chrynan.time.Moment, com.chrynan.time.Moment)/other) are the same [CalendarDate](../-calendar-date/index.md). This is a convenience function for comparing the [Moment.calendarDate](../-moment/calendar-date.md) fields of both of the [Moment](../-moment/index.md)s. TODO consider the offset because two calendar dates may be the same but at different regions, so technically not the same`fun `[`Moment`](../-moment/index.md)`.isSameDateAs(other: `[`Moment`](../-moment/index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [minus](../minus.md) | `operator fun `[`Moment`](../-moment/index.md)`.minus(hours: `[`Hours`](../-hours/index.md)`): `[`Moment`](../-moment/index.md)<br>`operator fun `[`Moment`](../-moment/index.md)`.minus(minutes: `[`Minutes`](../-minutes/index.md)`): `[`Moment`](../-moment/index.md)<br>`operator fun `[`Moment`](../-moment/index.md)`.minus(seconds: `[`Seconds`](../-seconds/index.md)`): `[`Moment`](../-moment/index.md)<br>`operator fun `[`Moment`](../-moment/index.md)`.minus(timeOffset: `[`TimeOffset`](../-time-offset/index.md)`): `[`Moment`](../-moment/index.md) |
| (JVM, COMMON) [plus](../plus.md) | `operator fun `[`Moment`](../-moment/index.md)`.plus(hours: `[`Hours`](../-hours/index.md)`): `[`Moment`](../-moment/index.md)<br>`operator fun `[`Moment`](../-moment/index.md)`.plus(minutes: `[`Minutes`](../-minutes/index.md)`): `[`Moment`](../-moment/index.md)<br>`operator fun `[`Moment`](../-moment/index.md)`.plus(seconds: `[`Seconds`](../-seconds/index.md)`): `[`Moment`](../-moment/index.md)<br>`operator fun `[`Moment`](../-moment/index.md)`.plus(timeOffset: `[`TimeOffset`](../-time-offset/index.md)`): `[`Moment`](../-moment/index.md) |
| (JVM, COMMON) [to](../to.md) | Retrieves the [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) from this [Moment](../-moment/index.md) to the [other](../to.md#com.chrynan.time$to(com.chrynan.time.Moment, com.chrynan.time.Moment)/other) provided [Moment](../-moment/index.md). This is equivalent to subtracting this [Moment](../-moment/index.md)s [Moment.durationSinceTheEpoch](../-moment/duration-since-the-epoch.md) value from the [other](../to.md#com.chrynan.time$to(com.chrynan.time.Moment, com.chrynan.time.Moment)/other) moments [Moment.durationSinceTheEpoch](../-moment/duration-since-the-epoch.md).`infix fun `[`Moment`](../-moment/index.md)`.to(other: `[`Moment`](../-moment/index.md)`): `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| (JVM, COMMON) [toDate](../to-date.md) | Converts this [Moment](../-moment/index.md) to a Java Time [Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) by first converting this [Moment](../-moment/index.md) to a UTC time.`fun `[`Moment`](../-moment/index.md)`.toDate(): `[`Date`](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html) |
| (JVM, COMMON) [toInstant](../to-instant.md) | Converts this [Moment](../-moment/index.md) to a Java Time [Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) by first converting this [Moment](../-moment/index.md) to a UTC time.`fun `[`Moment`](../-moment/index.md)`.toInstant(): `[`Instant`](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) |
| (JVM, COMMON) [toLocalDateTime](../to-local-date-time.md) | Converts this [Moment](../-moment/index.md) to a Java Time [LocalDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html).`fun `[`Moment`](../-moment/index.md)`.toLocalDateTime(): `[`LocalDateTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) |
