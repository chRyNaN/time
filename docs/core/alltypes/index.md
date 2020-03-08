

### All Types

| Name | Summary |
|---|---|
|(JVM, COMMON)

##### [com.chrynan.time.CalendarDate](../com.chrynan.time/-calendar-date/index.md)

A class that represents a Date within a Calendar with no reference to exact time, such as, minutes or hours, or a
region. Note multiple [CalendarDate](../com.chrynan.time/-calendar-date/index.md)s may be considered equal if their values are the same, even though the
[Moment](../com.chrynan.time/-moment/index.md)s they came from may be in different regions, so technically they do not represent the same time. This is
because a [CalendarDate](../com.chrynan.time/-calendar-date/index.md) has no reference to a region.


|(JVM, COMMON)

##### [com.chrynan.time.CalendarDateAndTime](../com.chrynan.time/-calendar-date-and-time/index.md)

A convenience data wrapper class around [CalendarDate](../com.chrynan.time/-calendar-date/index.md) and [TimeOfDay](../com.chrynan.time/-time-of-day/index.md).


|(JVM, COMMON)

##### [com.chrynan.time.ClockConvention](../com.chrynan.time/-clock-convention/index.md)

An enum class representing the different supported clock formats (twelve or twenty four hour).


|(JVM, COMMON)

##### [com.chrynan.time.DayInMonth](../com.chrynan.time/-day-in-month/index.md)

Represents a day in a Calendar Month. Days in a Calendar Month start with one and go up until 31. A value of one
means that it is the first day of the month. Months have different amounts of days in them and some vary
(Ex: February during a leap year). Note that no check is done to assert that the provided [value](../com.chrynan.time/-day-in-month/value.md) is valid when
constructing an instance of this class.


|(JVM, COMMON)

##### [com.chrynan.time.DayInYear](../com.chrynan.time/-day-in-year/index.md)

Represents a day in a Calendar Year. Days in a Calendar Year start at one and go up to 366. A value of 366 means it
is a leap year and a value of 365 means it is not a leap year. Note that no check is done to assert that the
provided [value](../com.chrynan.time/-day-in-year/value.md) is valid when constructing an instance of this class.


|(JVM, COMMON)

##### [com.chrynan.time.DayOfWeek](../com.chrynan.time/-day-of-week/index.md)

An enum class representing the different days of a week. This enum consists of the days Sunday, Monday, Tuesday,
Wednesday, Thursday, Friday, and Saturday. This enum class has no reference to a particular time or [Moment](../com.chrynan.time/-moment/index.md),
instead it is just an indicator of the named day.


|(JVM, COMMON)  (extensions in package com.chrynan.time)

##### [java.time.DayOfWeek](../com.chrynan.time/java.time.-day-of-week/index.md)


|(JVM, COMMON)

##### [com.chrynan.time.DefaultTimeZoneRegionId](../com.chrynan.time/-default-time-zone-region-id/index.md)

An enum containing a finite set of supported default timezones.


|(JVM, COMMON)

##### [com.chrynan.time.HourIn12HourClock](../com.chrynan.time/-hour-in12-hour-clock/index.md)

Represents a [HourInDay](../com.chrynan.time/-hour-in-day/index.md) for a twelve hour clock.


|(JVM, COMMON)

##### [com.chrynan.time.HourIn24HourClock](../com.chrynan.time/-hour-in24-hour-clock/index.md)

Represents a [HourInDay](../com.chrynan.time/-hour-in-day/index.md) for a twenty four hour clock.


|(JVM, COMMON)

##### [com.chrynan.time.HourInDay](../com.chrynan.time/-hour-in-day/index.md)

Represents an hour within a Calendar Day. This is an class wrapper around a numerical representation of a
hour. This could represent an hour within a 12-hour clock period, in which case it would be in the range of 1 to 12
with both 1 and 12 being inclusive, or this could represent an hour within a 24-hour clock period, in which case it
would be in the range of 0 to 24 with 0 being inclusive and 24 being exclusive. Note that no check is performed to
assert that the provided value is valid. Also, note that this class is different from the [Hours](../com.chrynan.time/-hours/index.md) class. Where the
[Hours](../com.chrynan.time/-hours/index.md) class denotes an amount of time or duration, this class denotes an exact hour within a day.


|(JVM, COMMON)

##### [com.chrynan.time.Hours](../com.chrynan.time/-hours/index.md)

Represents an amount of hours as in a duration.


|(JVM, COMMON)

##### [com.chrynan.time.JavaMoment](../com.chrynan.time/-java-moment/index.md)


|(JVM, COMMON)

##### [com.chrynan.time.JavaMomentFormatterAndParser](../com.chrynan.time/-java-moment-formatter-and-parser/index.md)


|(JVM, COMMON)

##### [com.chrynan.time.JavaTimeProvider](../com.chrynan.time/-java-time-provider/index.md)


|(JVM, COMMON)

##### [com.chrynan.time.JavaTimeZoneOffsetProvider](../com.chrynan.time/-java-time-zone-offset-provider/index.md)


|(JVM, COMMON)  (extensions in package com.chrynan.time)

##### [java.time.LocalDate](../com.chrynan.time/java.time.-local-date/index.md)


|(JVM, COMMON)  (extensions in package com.chrynan.time)

##### [java.time.LocalDateTime](../com.chrynan.time/java.time.-local-date-time/index.md)


|(JVM, COMMON)  (extensions in package com.chrynan.time)

##### [java.time.LocalTime](../com.chrynan.time/java.time.-local-time/index.md)


|(JVM, COMMON)

##### [com.chrynan.time.MeridiemPeriod](../com.chrynan.time/-meridiem-period/index.md)

An enum representing the two periods of a 24 hour day for the 12-hour clock time convention. Those two periods are
a.m. (from Latin "ante meridiem", translating to before midday), or AM, and p.m. (from Latin "post meridiem"
translating to after midday), or PM.


|(JVM, COMMON)

##### [com.chrynan.time.MillisecondInSecond](../com.chrynan.time/-millisecond-in-second/index.md)

Represents the millisecond within a second for a Calendar day. This is an inline class wrapper around a numerical
representation of a millisecond. This could be a value starting from, and including, 0, up to, and excluding, 1,000.
Note that no check is performed to assert that the provided value is valid when instantiating an instance of this
class.


|(JVM, COMMON)

##### [com.chrynan.time.MinuteInHour](../com.chrynan.time/-minute-in-hour/index.md)

Represents the minute within an hour for a Calendar day. This is an inline class wrapper around a numerical
representation of a hour. This could be a value starting from, and including, 0, up to, and excluding, 60. Note that
no check is performed to assert that the provided value is valid. Also, note that this class is different from the
[Minutes](../com.chrynan.time/-minutes/index.md) class. Where the [Minutes](../com.chrynan.time/-minutes/index.md) class denotes an amount of time or duration, this class denotes an exact minute
within an hour.


|(JVM, COMMON)

##### [com.chrynan.time.Minutes](../com.chrynan.time/-minutes/index.md)

Represents an amount of minutes as in a duration.


|(JVM, COMMON)

##### [com.chrynan.time.Moment](../com.chrynan.time/-moment/index.md)

Represents an exact moment of time. This uses the unix epoch as a reference and the amount of time from the epoch
can be obtained using the [durationSinceTheEpoch](../com.chrynan.time/-moment/duration-since-the-epoch.md) property.


|(JVM, COMMON)

##### [com.chrynan.time.MomentFormatPattern](../com.chrynan.time/-moment-format-pattern/index.md)

An inline class that contains the format used by [MomentFormatter](../com.chrynan.time/-moment-formatter/index.md) and [MomentParser](../com.chrynan.time/-moment-parser/index.md) for formatting and parsing.


|(JVM, COMMON)

##### [com.chrynan.time.MomentFormatter](../com.chrynan.time/-moment-formatter/index.md)

This interface represents a utility that can convert a [Moment](../com.chrynan.time/-moment/index.md) into a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) representation. The format for the
[Moment](../com.chrynan.time/-moment/index.md) to be converted to is defined by the [pattern](../com.chrynan.time/-moment-formatter/pattern.md) property.


|(JVM, COMMON)

##### [com.chrynan.time.MomentParser](../com.chrynan.time/-moment-parser/index.md)

This interface represents a utility that can convert a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) into a [Moment](../com.chrynan.time/-moment/index.md). The format for the input is defined
by the [pattern](../com.chrynan.time/-moment-parser/pattern.md) property.


|(JVM, COMMON)

##### [com.chrynan.time.Month](../com.chrynan.time/-month/index.md)

An enum class representing the different months in a year. This enum consists of January, February, March, April,
May, June, July, August, September, October, November, and December. This enum class has no reference to a
particular time or [Moment](../com.chrynan.time/-moment/index.md), instead it is just an indicator of the named month.


|(JVM, COMMON)  (extensions in package com.chrynan.time)

##### [java.time.Month](../com.chrynan.time/java.time.-month/index.md)


|(JVM, COMMON)  (extensions in package com.chrynan.time)

##### [java.time.OffsetDateTime](../com.chrynan.time/java.time.-offset-date-time/index.md)


|(JVM, COMMON)

##### [com.chrynan.time.SecondInMinute](../com.chrynan.time/-second-in-minute/index.md)

Represents the second within a minute for a Calendar day. This is an inline class wrapper around a numerical
representation of a second. This could be a value starting from, and including, 0, up to, and excluding, 60. Note
that no check is performed to assert that the provided value is valid when instantiating an instance of this class.


|(JVM, COMMON)

##### [com.chrynan.time.Seconds](../com.chrynan.time/-seconds/index.md)

Represents an amount of seconds as in a duration.


|(JVM, COMMON)

##### [com.chrynan.time.TimeOfDay](../com.chrynan.time/-time-of-day/index.md)

A class that represents the exact time within a Calendar date. This represents a moment of time and not an elapsed
time value like a duration. This class has properties that represent the exact time down to millisecond precision
within a calendar day. Note that this class has no reference to the calendar date or region.


|(JVM, COMMON)

##### [com.chrynan.time.TimeOffset](../com.chrynan.time/-time-offset/index.md)

A class representing an offset of time in hours and minutes. This class is useful for representing a time offset
with respect to UTC time for a particular [Moment](../com.chrynan.time/-moment/index.md) in time. This allows specifying a UTC [Moment](../com.chrynan.time/-moment/index.md) in terms to a more
local time. Note that regions of the world don't necessarily have static [TimeOffset](../com.chrynan.time/-time-offset/index.md)s from UTC time. An example of
a non-static time offset is in regions that observe daylight savings time, where their time offsets from UTC change
multiple times a year.


|(JVM, COMMON)

##### [com.chrynan.time.TimeProvider](../com.chrynan.time/-time-provider/index.md)


|(JVM, COMMON)

##### [com.chrynan.time.TimeUtils](../com.chrynan.time/-time-utils/index.md)

Convenience utilities for converting between different time intervals.


|(JVM, COMMON)

##### [com.chrynan.time.TimeZoneOffsetProvider](../com.chrynan.time/-time-zone-offset-provider/index.md)


|(JVM, COMMON)

##### [com.chrynan.time.TimeZoneRegionId](../com.chrynan.time/-time-zone-region-id/index.md)

A class representing a time zone region identifier, such as "America/Phoenix". Note that this class does not contain
any information about UTC offsets or time. Also, note that no checks are performed to assert a valid input when
constructing an instance of this class.


|(JVM, COMMON)

##### [com.chrynan.time.UtcTimeOffset](../com.chrynan.time/-utc-time-offset/index.md)

An enum class representing a group of common UTC [TimeOffset](../com.chrynan.time/-time-offset/index.md)s. The [offset](../com.chrynan.time/-utc-time-offset/offset.md) value returns the actual [TimeOffset](../com.chrynan.time/-time-offset/index.md).
Note that this may not be a comprehensive list and for offsets that are not provided by this enum class, use the
[TimeOffset](../com.chrynan.time/-time-offset/index.md) class directly.


|(JVM, COMMON)

##### [com.chrynan.time.Year](../com.chrynan.time/-year/index.md)

Represents a Calendar Year. This is an inline class wrapper around a numerical representation of a year. A negative
value denotes a year within the Before Common Era period. A value of zero is not a valid year with respect to the
Common Era but can be used if using with a different calendar era. Note that this is not a duration, this does not
represent an amount of years, but rather, represents an exact year within a calendar.


|(JVM, COMMON)  (extensions in package com.chrynan.time)

##### [java.time.ZonedDateTime](../com.chrynan.time/java.time.-zoned-date-time/index.md)


|(JVM, COMMON)  (extensions in package com.chrynan.time)

##### [java.time.ZoneId](../com.chrynan.time/java.time.-zone-id/index.md)


|(JVM, COMMON)  (extensions in package com.chrynan.time)

##### [java.time.ZoneOffset](../com.chrynan.time/java.time.-zone-offset/index.md)


