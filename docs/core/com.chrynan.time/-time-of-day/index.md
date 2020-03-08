[core](../../index.md) / [com.chrynan.time](../index.md) / [TimeOfDay](./index.md)

# TimeOfDay

(JVM, COMMON) `@ExperimentalTime data class TimeOfDay`

A class that represents the exact time within a Calendar date. This represents a moment of time and not an elapsed
time value like a duration. This class has properties that represent the exact time down to millisecond precision
within a calendar day. Note that this class has no reference to the calendar date or region.

**Author**
chRyNaN

### Constructors

| Name | Summary |
|---|---|
| (JVM, COMMON) [&lt;init&gt;](-init-.md) | A class that represents the exact time within a Calendar date. This represents a moment of time and not an elapsed time value like a duration. This class has properties that represent the exact time down to millisecond precision within a calendar day. Note that this class has no reference to the calendar date or region.`TimeOfDay(elapsedDurationInDay: `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [elapsedDurationInDay](elapsed-duration-in-day.md) | `val elapsedDurationInDay: `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| (JVM, COMMON) [millisecondInSecond](millisecond-in-second.md) | `val millisecondInSecond: `[`MillisecondInSecond`](../-millisecond-in-second/index.md) |
| (JVM, COMMON) [minuteInHour](minute-in-hour.md) | `val minuteInHour: `[`MinuteInHour`](../-minute-in-hour/index.md) |
| (JVM, COMMON) [secondInMinute](second-in-minute.md) | `val secondInMinute: `[`SecondInMinute`](../-second-in-minute/index.md) |

### Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [hourInDay](hour-in-day.md) | `fun hourInDay(clockConvention: `[`ClockConvention`](../-clock-convention/index.md)`): `[`HourInDay`](../-hour-in-day/index.md) |

### Companion Object Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [MIDNIGHT](-m-i-d-n-i-g-h-t.md) | Midnight, or start of day, representation for [TimeOfDay](./index.md). This value is set to 00:00 in twenty four hour clock time. Note that the [TimeOfDay](./index.md) has no reference to what day it is, only the time of a day.`val MIDNIGHT: `[`TimeOfDay`](./index.md) |
| (JVM, COMMON) [START_OF_DAY](-s-t-a-r-t_-o-f_-d-a-y.md) | Alias for [MIDNIGHT](-m-i-d-n-i-g-h-t.md).`val START_OF_DAY: `[`TimeOfDay`](./index.md) |

### Extension Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [toLocalTime](../to-local-time.md) | Converts this [TimeOfDay](./index.md) to a Java Time [LocalTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html).`fun `[`TimeOfDay`](./index.md)`.toLocalTime(): `[`LocalTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html) |
