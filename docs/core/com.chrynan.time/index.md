[core](../index.md) / [com.chrynan.time](./index.md)

## Package com.chrynan.time

### Types

| Name | Summary |
|---|---|
| (JVM, COMMON) [CalendarDate](-calendar-date/index.md) | A class that represents a Date within a Calendar with no reference to exact time, such as, minutes or hours, or a region. Note multiple [CalendarDate](-calendar-date/index.md)s may be considered equal if their values are the same, even though the [Moment](-moment/index.md)s they came from may be in different regions, so technically they do not represent the same time. This is because a [CalendarDate](-calendar-date/index.md) has no reference to a region.`data class CalendarDate` |
| (JVM, COMMON) [CalendarDateAndTime](-calendar-date-and-time/index.md) | A convenience data wrapper class around [CalendarDate](-calendar-date/index.md) and [TimeOfDay](-time-of-day/index.md).`data class CalendarDateAndTime` |
| (JVM, COMMON) [ClockConvention](-clock-convention/index.md) | An enum class representing the different supported clock formats (twelve or twenty four hour).`enum class ClockConvention` |
| (JVM, COMMON) [DayInMonth](-day-in-month/index.md) | Represents a day in a Calendar Month. Days in a Calendar Month start with one and go up until 31. A value of one means that it is the first day of the month. Months have different amounts of days in them and some vary (Ex: February during a leap year). Note that no check is done to assert that the provided [value](-day-in-month/value.md) is valid when constructing an instance of this class.`class DayInMonth` |
| (JVM, COMMON) [DayInYear](-day-in-year/index.md) | Represents a day in a Calendar Year. Days in a Calendar Year start at one and go up to 366. A value of 366 means it is a leap year and a value of 365 means it is not a leap year. Note that no check is done to assert that the provided [value](-day-in-year/value.md) is valid when constructing an instance of this class.`class DayInYear` |
| (JVM, COMMON) [DayOfWeek](-day-of-week/index.md) | An enum class representing the different days of a week. This enum consists of the days Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday. This enum class has no reference to a particular time or [Moment](-moment/index.md), instead it is just an indicator of the named day.`enum class DayOfWeek` |
| (JVM, COMMON) [DefaultTimeZoneRegionId](-default-time-zone-region-id/index.md) | An enum containing a finite set of supported default timezones.`enum class DefaultTimeZoneRegionId` |
| (JVM, COMMON) [HourIn12HourClock](-hour-in12-hour-clock/index.md) | Represents a [HourInDay](-hour-in-day/index.md) for a twelve hour clock.`data class HourIn12HourClock : `[`HourInDay`](-hour-in-day/index.md) |
| (JVM, COMMON) [HourIn24HourClock](-hour-in24-hour-clock/index.md) | Represents a [HourInDay](-hour-in-day/index.md) for a twenty four hour clock.`data class HourIn24HourClock : `[`HourInDay`](-hour-in-day/index.md) |
| (JVM, COMMON) [HourInDay](-hour-in-day/index.md) | Represents an hour within a Calendar Day. This is an class wrapper around a numerical representation of a hour. This could represent an hour within a 12-hour clock period, in which case it would be in the range of 1 to 12 with both 1 and 12 being inclusive, or this could represent an hour within a 24-hour clock period, in which case it would be in the range of 0 to 24 with 0 being inclusive and 24 being exclusive. Note that no check is performed to assert that the provided value is valid. Also, note that this class is different from the [Hours](-hours/index.md) class. Where the [Hours](-hours/index.md) class denotes an amount of time or duration, this class denotes an exact hour within a day.`sealed class HourInDay` |
| (JVM, COMMON) [Hours](-hours/index.md) | Represents an amount of hours as in a duration.`class Hours` |
| (JVM, COMMON) [JavaMoment](-java-moment/index.md) | `class JavaMoment : `[`Moment`](-moment/index.md) |
| (JVM, COMMON) [JavaMomentFormatterAndParser](-java-moment-formatter-and-parser/index.md) | `class JavaMomentFormatterAndParser : `[`MomentFormatter`](-moment-formatter/index.md)`, `[`MomentParser`](-moment-parser/index.md) |
| (JVM, COMMON) [JavaTimeProvider](-java-time-provider/index.md) | `class JavaTimeProvider : `[`TimeProvider`](-time-provider/index.md) |
| (JVM, COMMON) [JavaTimeZoneOffsetProvider](-java-time-zone-offset-provider/index.md) | `class JavaTimeZoneOffsetProvider : `[`TimeZoneOffsetProvider`](-time-zone-offset-provider/index.md) |
| (JVM, COMMON) [MeridiemPeriod](-meridiem-period/index.md) | An enum representing the two periods of a 24 hour day for the 12-hour clock time convention. Those two periods are a.m. (from Latin "ante meridiem", translating to before midday), or AM, and p.m. (from Latin "post meridiem" translating to after midday), or PM.`enum class MeridiemPeriod` |
| (JVM, COMMON) [MillisecondInSecond](-millisecond-in-second/index.md) | Represents the millisecond within a second for a Calendar day. This is an inline class wrapper around a numerical representation of a millisecond. This could be a value starting from, and including, 0, up to, and excluding, 1,000. Note that no check is performed to assert that the provided value is valid when instantiating an instance of this class.`class MillisecondInSecond` |
| (JVM, COMMON) [MinuteInHour](-minute-in-hour/index.md) | Represents the minute within an hour for a Calendar day. This is an inline class wrapper around a numerical representation of a hour. This could be a value starting from, and including, 0, up to, and excluding, 60. Note that no check is performed to assert that the provided value is valid. Also, note that this class is different from the [Minutes](-minutes/index.md) class. Where the [Minutes](-minutes/index.md) class denotes an amount of time or duration, this class denotes an exact minute within an hour.`class MinuteInHour` |
| (JVM, COMMON) [Minutes](-minutes/index.md) | Represents an amount of minutes as in a duration.`class Minutes` |
| (JVM, COMMON) [Moment](-moment/index.md) | Represents an exact moment of time. This uses the unix epoch as a reference and the amount of time from the epoch can be obtained using the [durationSinceTheEpoch](-moment/duration-since-the-epoch.md) property.`interface Moment` |
| (JVM, COMMON) [MomentFormatPattern](-moment-format-pattern/index.md) | An inline class that contains the format used by [MomentFormatter](-moment-formatter/index.md) and [MomentParser](-moment-parser/index.md) for formatting and parsing.`class MomentFormatPattern` |
| (JVM, COMMON) [MomentFormatter](-moment-formatter/index.md) | This interface represents a utility that can convert a [Moment](-moment/index.md) into a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) representation. The format for the [Moment](-moment/index.md) to be converted to is defined by the [pattern](-moment-formatter/pattern.md) property.`interface MomentFormatter` |
| (JVM, COMMON) [MomentParser](-moment-parser/index.md) | This interface represents a utility that can convert a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) into a [Moment](-moment/index.md). The format for the input is defined by the [pattern](-moment-parser/pattern.md) property.`interface MomentParser` |
| (JVM, COMMON) [Month](-month/index.md) | An enum class representing the different months in a year. This enum consists of January, February, March, April, May, June, July, August, September, October, November, and December. This enum class has no reference to a particular time or [Moment](-moment/index.md), instead it is just an indicator of the named month.`enum class Month` |
| (JVM, COMMON) [SecondInMinute](-second-in-minute/index.md) | Represents the second within a minute for a Calendar day. This is an inline class wrapper around a numerical representation of a second. This could be a value starting from, and including, 0, up to, and excluding, 60. Note that no check is performed to assert that the provided value is valid when instantiating an instance of this class.`class SecondInMinute` |
| (JVM, COMMON) [Seconds](-seconds/index.md) | Represents an amount of seconds as in a duration.`class Seconds` |
| (JVM, COMMON) [TimeOfDay](-time-of-day/index.md) | A class that represents the exact time within a Calendar date. This represents a moment of time and not an elapsed time value like a duration. This class has properties that represent the exact time down to millisecond precision within a calendar day. Note that this class has no reference to the calendar date or region.`data class TimeOfDay` |
| (JVM, COMMON) [TimeOffset](-time-offset/index.md) | A class representing an offset of time in hours and minutes. This class is useful for representing a time offset with respect to UTC time for a particular [Moment](-moment/index.md) in time. This allows specifying a UTC [Moment](-moment/index.md) in terms to a more local time. Note that regions of the world don't necessarily have static [TimeOffset](-time-offset/index.md)s from UTC time. An example of a non-static time offset is in regions that observe daylight savings time, where their time offsets from UTC change multiple times a year.`data class TimeOffset` |
| (JVM, COMMON) [TimeProvider](-time-provider/index.md) | `interface TimeProvider` |
| (JVM, COMMON) [TimeUtils](-time-utils/index.md) | Convenience utilities for converting between different time intervals.`object TimeUtils` |
| (JVM, COMMON) [TimeZoneOffsetProvider](-time-zone-offset-provider/index.md) | `interface TimeZoneOffsetProvider` |
| (JVM, COMMON) [TimeZoneRegionId](-time-zone-region-id/index.md) | A class representing a time zone region identifier, such as "America/Phoenix". Note that this class does not contain any information about UTC offsets or time. Also, note that no checks are performed to assert a valid input when constructing an instance of this class.`class TimeZoneRegionId` |
| (JVM, COMMON) [UtcTimeOffset](-utc-time-offset/index.md) | An enum class representing a group of common UTC [TimeOffset](-time-offset/index.md)s. The [offset](-utc-time-offset/offset.md) value returns the actual [TimeOffset](-time-offset/index.md). Note that this may not be a comprehensive list and for offsets that are not provided by this enum class, use the [TimeOffset](-time-offset/index.md) class directly.`enum class UtcTimeOffset` |
| (JVM, COMMON) [Year](-year/index.md) | Represents a Calendar Year. This is an inline class wrapper around a numerical representation of a year. A negative value denotes a year within the Before Common Era period. A value of zero is not a valid year with respect to the Common Era but can be used if using with a different calendar era. Note that this is not a duration, this does not represent an amount of years, but rather, represents an exact year within a calendar.`class Year` |

### Extensions for External Classes

| Name | Summary |
|---|---|
| (JVM, COMMON) [java.time.DayOfWeek](java.time.-day-of-week/index.md) |  |
| (JVM, COMMON) [java.time.LocalDate](java.time.-local-date/index.md) |  |
| (JVM, COMMON) [java.time.LocalDateTime](java.time.-local-date-time/index.md) |  |
| (JVM, COMMON) [java.time.LocalTime](java.time.-local-time/index.md) |  |
| (JVM, COMMON) [java.time.Month](java.time.-month/index.md) |  |
| (JVM, COMMON) [java.time.OffsetDateTime](java.time.-offset-date-time/index.md) |  |
| (JVM, COMMON) [java.time.ZonedDateTime](java.time.-zoned-date-time/index.md) |  |
| (JVM, COMMON) [java.time.ZoneId](java.time.-zone-id/index.md) |  |
| (JVM, COMMON) [java.time.ZoneOffset](java.time.-zone-offset/index.md) |  |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [isApril](is-april.md) | `val `[`Month`](-month/index.md)`.isApril: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isAugust](is-august.md) | `val `[`Month`](-month/index.md)`.isAugust: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isDecember](is-december.md) | `val `[`Month`](-month/index.md)`.isDecember: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isFebruary](is-february.md) | `val `[`Month`](-month/index.md)`.isFebruary: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isFriday](is-friday.md) | Returns true if this [DayOfWeek](-day-of-week/index.md) equals [DayOfWeek.FRIDAY](-day-of-week/-f-r-i-d-a-y.md), otherwise false.`val `[`DayOfWeek`](-day-of-week/index.md)`.isFriday: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isJanuary](is-january.md) | `val `[`Month`](-month/index.md)`.isJanuary: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isJuly](is-july.md) | `val `[`Month`](-month/index.md)`.isJuly: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isJune](is-june.md) | `val `[`Month`](-month/index.md)`.isJune: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isMarch](is-march.md) | `val `[`Month`](-month/index.md)`.isMarch: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isMay](is-may.md) | `val `[`Month`](-month/index.md)`.isMay: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isMonday](is-monday.md) | Returns true if this [DayOfWeek](-day-of-week/index.md) equals [DayOfWeek.MONDAY](-day-of-week/-m-o-n-d-a-y.md), otherwise false.`val `[`DayOfWeek`](-day-of-week/index.md)`.isMonday: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isNovember](is-november.md) | `val `[`Month`](-month/index.md)`.isNovember: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isOctober](is-october.md) | `val `[`Month`](-month/index.md)`.isOctober: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isSaturday](is-saturday.md) | Returns true if this [DayOfWeek](-day-of-week/index.md) equals [DayOfWeek.SATURDAY](-day-of-week/-s-a-t-u-r-d-a-y.md), otherwise false.`val `[`DayOfWeek`](-day-of-week/index.md)`.isSaturday: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isSeptember](is-september.md) | `val `[`Month`](-month/index.md)`.isSeptember: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isSunday](is-sunday.md) | Returns true if this [DayOfWeek](-day-of-week/index.md) equals [DayOfWeek.SUNDAY](-day-of-week/-s-u-n-d-a-y.md), otherwise false.`val `[`DayOfWeek`](-day-of-week/index.md)`.isSunday: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isThursday](is-thursday.md) | Returns true if this [DayOfWeek](-day-of-week/index.md) equals [DayOfWeek.THURSDAY](-day-of-week/-t-h-u-r-s-d-a-y.md), otherwise false.`val `[`DayOfWeek`](-day-of-week/index.md)`.isThursday: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isTuesday](is-tuesday.md) | Returns true if this [DayOfWeek](-day-of-week/index.md) equals [DayOfWeek.TUESDAY](-day-of-week/-t-u-e-s-d-a-y.md), otherwise false.`val `[`DayOfWeek`](-day-of-week/index.md)`.isTuesday: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isWednesday](is-wednesday.md) | Returns true if this [DayOfWeek](-day-of-week/index.md) equals [DayOfWeek.WEDNESDAY](-day-of-week/-w-e-d-n-e-s-d-a-y.md), otherwise false.`val `[`DayOfWeek`](-day-of-week/index.md)`.isWednesday: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [compareTo](compare-to.md) | `operator fun `[`Moment`](-moment/index.md)`.compareTo(other: `[`Moment`](-moment/index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| (JVM, COMMON) [convertTo12HourClock](convert-to12-hour-clock.md) | Converts this [HourInDay](-hour-in-day/index.md) instance to a [HourIn12HourClock](-hour-in12-hour-clock/index.md). If this [HourInDay](-hour-in-day/index.md) is already a [HourIn12HourClock](-hour-in12-hour-clock/index.md), then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn24HourClock](-hour-in24-hour-clock/index.md) to [HourIn12HourClock](-hour-in12-hour-clock/index.md).`fun `[`HourInDay`](-hour-in-day/index.md)`.convertTo12HourClock(): `[`HourIn12HourClock`](-hour-in12-hour-clock/index.md) |
| (JVM, COMMON) [convertTo24HourClock](convert-to24-hour-clock.md) | Converts this [HourInDay](-hour-in-day/index.md) instance to a [HourIn24HourClock](-hour-in24-hour-clock/index.md). If this [HourInDay](-hour-in-day/index.md) is already a [HourIn24HourClock](-hour-in24-hour-clock/index.md), then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn12HourClock](-hour-in12-hour-clock/index.md) to [HourIn24HourClock](-hour-in24-hour-clock/index.md).`fun `[`HourInDay`](-hour-in-day/index.md)`.convertTo24HourClock(): `[`HourIn24HourClock`](-hour-in24-hour-clock/index.md) |
| (JVM, COMMON) [durationSinceEpoch](duration-since-epoch.md) | A convenience function for obtaining the duration since the epoch by calling [TimeProvider.unix](unix.md) and then [Moment.durationSinceTheEpoch](-moment/duration-since-the-epoch.md).`fun `[`TimeProvider`](-time-provider/index.md)`.durationSinceEpoch(): `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| (JVM, COMMON) [epoch](epoch.md) | Retrieves the [Moment](-moment/index.md) that represents the epoch at UTC/GMT (January 1, 1970 [midnight UTC/GMT](midnight UTC/GMT), not counting leap seconds [in ISO 8601:1970-01-01T00:00:00Z](#)). This is a static value. This is different from the [utc](utc.md) function which retrieves the current [Moment](-moment/index.md) at UTC/GMT. This [epoch](epoch.md) function retrieves the static [Moment](-moment/index.md) representing the epoch. The value returned is offset by the provided [regionId](epoch.md#com.chrynan.time$epoch(com.chrynan.time.TimeProvider, com.chrynan.time.TimeZoneRegionId)/regionId). If no [regionId](epoch.md#com.chrynan.time$epoch(com.chrynan.time.TimeProvider, com.chrynan.time.TimeZoneRegionId)/regionId) is provided then the [DefaultTimeZoneRegionId.UTC.regionId](-default-time-zone-region-id/region-id.md) is used.`fun `[`TimeProvider`](-time-provider/index.md)`.epoch(regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)` = DefaultTimeZoneRegionId.UTC.regionId): `[`Moment`](-moment/index.md) |
| (JVM, COMMON) [formatter](formatter.md) | Retrieves a [MomentFormatter](-moment-formatter/index.md) for the provided [pattern](formatter.md#com.chrynan.time$formatter(com.chrynan.time.TimeProvider, kotlin.String)/pattern) for converting [Moment](-moment/index.md)s into [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)s. This is a convenience function that converts the provided [pattern](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) to a [MomentFormatPattern](-moment-format-pattern/index.md), and then calls the [TimeProvider.formatter](-time-provider/formatter.md) function.`fun `[`TimeProvider`](-time-provider/index.md)`.formatter(pattern: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`MomentFormatter`](-moment-formatter/index.md) |
| (JVM, COMMON) [isSameDateAs](is-same-date-as.md) | Determines whether this [Moment](-moment/index.md) and the provided [other](is-same-date-as.md#com.chrynan.time$isSameDateAs(com.chrynan.time.Moment, com.chrynan.time.Moment)/other) are the same [CalendarDate](-calendar-date/index.md). This is a convenience function for comparing the [Moment.calendarDate](-moment/calendar-date.md) fields of both of the [Moment](-moment/index.md)s. TODO consider the offset because two calendar dates may be the same but at different regions, so technically not the same`fun `[`Moment`](-moment/index.md)`.isSameDateAs(other: `[`Moment`](-moment/index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isToday](is-today.md) | Determines whether the provided [moment](is-today.md#com.chrynan.time$isToday(com.chrynan.time.TimeProvider, com.chrynan.time.Moment, com.chrynan.time.TimeZoneRegionId)/moment) is the same date as today. This is a convenience function for calling [TimeProvider.now](-time-provider/now.md) and then calling [Moment.isSameDateAs](is-same-date-as.md) on that and the provided value to determine if they are the same date.`fun `[`TimeProvider`](-time-provider/index.md)`.isToday(moment: `[`Moment`](-moment/index.md)`, regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)` = timeZoneOffsetProvider.defaultTimeZoneRegionId): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [minus](minus.md) | `operator fun `[`Moment`](-moment/index.md)`.minus(hours: `[`Hours`](-hours/index.md)`): `[`Moment`](-moment/index.md)<br>`operator fun `[`Moment`](-moment/index.md)`.minus(minutes: `[`Minutes`](-minutes/index.md)`): `[`Moment`](-moment/index.md)<br>`operator fun `[`Moment`](-moment/index.md)`.minus(seconds: `[`Seconds`](-seconds/index.md)`): `[`Moment`](-moment/index.md)<br>`operator fun `[`Moment`](-moment/index.md)`.minus(timeOffset: `[`TimeOffset`](-time-offset/index.md)`): `[`Moment`](-moment/index.md) |
| (JVM, COMMON) [moment](moment.md) | Retrieves the [Moment](-moment/index.md) from the provided [CalendarDateAndTime](-calendar-date-and-time/index.md) and [regionId](moment.md#com.chrynan.time$moment(com.chrynan.time.TimeProvider, com.chrynan.time.CalendarDateAndTime, com.chrynan.time.TimeZoneRegionId)/regionId). This is a convenience function for calling [TimeProvider.moment](-time-provider/moment.md).`fun `[`TimeProvider`](-time-provider/index.md)`.moment(calendarDateAndTime: `[`CalendarDateAndTime`](-calendar-date-and-time/index.md)`, regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)` = timeZoneOffsetProvider.defaultTimeZoneRegionId): `[`Moment`](-moment/index.md) |
| (JVM, COMMON) [offset](offset.md) | Retrieves the [Moment](-moment/index.md) from offsetting the [TimeOffset](-time-offset/index.md) obtained from the [regionId](offset.md#com.chrynan.time$offset(com.chrynan.time.TimeProvider, com.chrynan.time.Moment, com.chrynan.time.TimeZoneRegionId)/regionId).`fun `[`TimeProvider`](-time-provider/index.md)`.offset(moment: `[`Moment`](-moment/index.md)`, regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)`): `[`Moment`](-moment/index.md) |
| (JVM, COMMON) [parser](parser.md) | Retrieves a [MomentParser](-moment-parser/index.md) for the provided [pattern](parser.md#com.chrynan.time$parser(com.chrynan.time.TimeProvider, kotlin.String)/pattern) for converting [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)s into [Moment](-moment/index.md)s. This is a convenience function that converts the provided [pattern](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) to a [MomentFormatPattern](-moment-format-pattern/index.md), and then calls the [TimeProvider.parser](-time-provider/parser.md) function.`fun `[`TimeProvider`](-time-provider/index.md)`.parser(pattern: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`MomentParser`](-moment-parser/index.md) |
| (JVM, COMMON) [plus](plus.md) | `operator fun `[`Moment`](-moment/index.md)`.plus(hours: `[`Hours`](-hours/index.md)`): `[`Moment`](-moment/index.md)<br>`operator fun `[`Moment`](-moment/index.md)`.plus(minutes: `[`Minutes`](-minutes/index.md)`): `[`Moment`](-moment/index.md)<br>`operator fun `[`Moment`](-moment/index.md)`.plus(seconds: `[`Seconds`](-seconds/index.md)`): `[`Moment`](-moment/index.md)<br>`operator fun `[`Moment`](-moment/index.md)`.plus(timeOffset: `[`TimeOffset`](-time-offset/index.md)`): `[`Moment`](-moment/index.md) |
| (JVM, COMMON) [to](to.md) | Retrieves the [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) from this [Moment](-moment/index.md) to the [other](to.md#com.chrynan.time$to(com.chrynan.time.Moment, com.chrynan.time.Moment)/other) provided [Moment](-moment/index.md). This is equivalent to subtracting this [Moment](-moment/index.md)s [Moment.durationSinceTheEpoch](-moment/duration-since-the-epoch.md) value from the [other](to.md#com.chrynan.time$to(com.chrynan.time.Moment, com.chrynan.time.Moment)/other) moments [Moment.durationSinceTheEpoch](-moment/duration-since-the-epoch.md).`infix fun `[`Moment`](-moment/index.md)`.to(other: `[`Moment`](-moment/index.md)`): `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| (JVM, COMMON) [toDate](to-date.md) | Converts this [Moment](-moment/index.md) to a Java Time [Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) by first converting this [Moment](-moment/index.md) to a UTC time.`fun `[`Moment`](-moment/index.md)`.toDate(): `[`Date`](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html) |
| (JVM, COMMON) [today](today.md) | Retrieves the [Moment](-moment/index.md) representing the start of today. This is a convenience function for calling [TimeProvider.now](-time-provider/now.md) followed by [Moment.startOfDay](-moment/start-of-day.md).`fun `[`TimeProvider`](-time-provider/index.md)`.today(regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)` = timeZoneOffsetProvider.defaultTimeZoneRegionId): `[`Moment`](-moment/index.md) |
| (JVM, COMMON) [toInstant](to-instant.md) | Converts this [Moment](-moment/index.md) to a Java Time [Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) by first converting this [Moment](-moment/index.md) to a UTC time.`fun `[`Moment`](-moment/index.md)`.toInstant(): `[`Instant`](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) |
| (JVM, COMMON) [toJavaDayOfWeek](to-java-day-of-week.md) | Converts this [DayOfWeek](-day-of-week/index.md) to a Java Time [java.time.DayOfWeek](https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html).`fun `[`DayOfWeek`](-day-of-week/index.md)`.toJavaDayOfWeek(): `[`DayOfWeek`](https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html) |
| (JVM, COMMON) [toJavaMonth](to-java-month.md) | Converts this [Month](-month/index.md) to a Java Time [java.time.Month](https://docs.oracle.com/javase/8/docs/api/java/time/Month.html).`fun `[`Month`](-month/index.md)`.toJavaMonth(): `[`Month`](https://docs.oracle.com/javase/8/docs/api/java/time/Month.html) |
| (JVM, COMMON) [toLocalDate](to-local-date.md) | Converts this [CalendarDate](-calendar-date/index.md) to a Java Time [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html).`fun `[`CalendarDate`](-calendar-date/index.md)`.toLocalDate(): `[`LocalDate`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)<br>Converts this [CalendarDateAndTime](-calendar-date-and-time/index.md) to a Java Time [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html).`fun `[`CalendarDateAndTime`](-calendar-date-and-time/index.md)`.toLocalDate(): `[`LocalDate`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) |
| (JVM, COMMON) [toLocalDateTime](to-local-date-time.md) | Converts this [CalendarDateAndTime](-calendar-date-and-time/index.md) to a Java Time [LocalDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html).`fun `[`CalendarDateAndTime`](-calendar-date-and-time/index.md)`.toLocalDateTime(): `[`LocalDateTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)<br>Converts this [Moment](-moment/index.md) to a Java Time [LocalDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html).`fun `[`Moment`](-moment/index.md)`.toLocalDateTime(): `[`LocalDateTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) |
| (JVM, COMMON) [toLocalTime](to-local-time.md) | Converts this [TimeOfDay](-time-of-day/index.md) to a Java Time [LocalTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html).`fun `[`TimeOfDay`](-time-of-day/index.md)`.toLocalTime(): `[`LocalTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html)<br>Converts this [CalendarDateAndTime](-calendar-date-and-time/index.md) to a Java Time [LocalTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html).`fun `[`CalendarDateAndTime`](-calendar-date-and-time/index.md)`.toLocalTime(): `[`LocalTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html) |
| (JVM, COMMON) [tomorrow](tomorrow.md) | Retrieves the [Moment](-moment/index.md) representing the start of the day after today. This is a convenience function for calling [TimeProvider.now](-time-provider/now.md) followed by [Moment.startOfDay](-moment/start-of-day.md) and then adding a one day [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html).`fun `[`TimeProvider`](-time-provider/index.md)`.tomorrow(regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)` = timeZoneOffsetProvider.defaultTimeZoneRegionId): `[`Moment`](-moment/index.md) |
| (JVM, COMMON) [toZoneId](to-zone-id.md) | Converts this [TimeZoneRegionId](-time-zone-region-id/index.md) to a Java Time [ZoneId](https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html).`fun `[`TimeZoneRegionId`](-time-zone-region-id/index.md)`.toZoneId(): `[`ZoneId`](https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html) |
| (JVM, COMMON) [toZoneOffset](to-zone-offset.md) | Converts this [TimeOffset](-time-offset/index.md) to a Java Time [ZoneOffset](https://docs.oracle.com/javase/8/docs/api/java/time/ZoneOffset.html).`fun `[`TimeOffset`](-time-offset/index.md)`.toZoneOffset(): `[`ZoneOffset`](https://docs.oracle.com/javase/8/docs/api/java/time/ZoneOffset.html) |
| (JVM, COMMON) [unix](unix.md) | An alias for the [TimeProvider.utc](utc.md) function.`fun `[`TimeProvider`](-time-provider/index.md)`.unix(): `[`Moment`](-moment/index.md) |
| (JVM, COMMON) [utc](utc.md) | Retrieves the [Moment](-moment/index.md) that represents the unix epoch time, or the time that has elapsed at UTC since the epoch (January 1, 1970 [midnight UTC/GMT](midnight UTC/GMT), not counting leap seconds [in ISO 8601:1970-01-01T00:00:00Z](#)). The region for this time is static at UTC/GMT.`fun `[`TimeProvider`](-time-provider/index.md)`.utc(): `[`Moment`](-moment/index.md) |
| (JVM, COMMON) [yesterday](yesterday.md) | Retrieves the [Moment](-moment/index.md) representing the start of the day prior to today. This is a convenience function for calling [TimeProvider.now](-time-provider/now.md) followed by [Moment.startOfDay](-moment/start-of-day.md) and then subtracting a one day [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html).`fun `[`TimeProvider`](-time-provider/index.md)`.yesterday(regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)` = timeZoneOffsetProvider.defaultTimeZoneRegionId): `[`Moment`](-moment/index.md) |