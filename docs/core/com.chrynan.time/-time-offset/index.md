[core](../../index.md) / [com.chrynan.time](../index.md) / [TimeOffset](./index.md)

# TimeOffset

(JVM, COMMON) `@ExperimentalTime data class TimeOffset`

A class representing an offset of time in hours and minutes. This class is useful for representing a time offset
with respect to UTC time for a particular [Moment](../-moment/index.md) in time. This allows specifying a UTC [Moment](../-moment/index.md) in terms to a more
local time. Note that regions of the world don't necessarily have static [TimeOffset](./index.md)s from UTC time. An example of
a non-static time offset is in regions that observe daylight savings time, where their time offsets from UTC change
multiple times a year.

**Author**
chRyNaN

### Constructors

| Name | Summary |
|---|---|
| (JVM, COMMON) [&lt;init&gt;](-init-.md) | A class representing an offset of time in hours and minutes. This class is useful for representing a time offset with respect to UTC time for a particular [Moment](../-moment/index.md) in time. This allows specifying a UTC [Moment](../-moment/index.md) in terms to a more local time. Note that regions of the world don't necessarily have static [TimeOffset](./index.md)s from UTC time. An example of a non-static time offset is in regions that observe daylight savings time, where their time offsets from UTC change multiple times a year.`TimeOffset(hours: `[`Hours`](../-hours/index.md)`, minutes: `[`Minutes`](../-minutes/index.md)` = Minutes(0), seconds: `[`Seconds`](../-seconds/index.md)` = Seconds(0))` |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [duration](duration.md) | A [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) representing this [TimeOffset](./index.md). This a [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) of the [hours](hours.md) and [minutes](minutes.md) of this time offset.`val duration: `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| (JVM, COMMON) [hours](hours.md) | `val hours: `[`Hours`](../-hours/index.md) |
| (JVM, COMMON) [minutes](minutes.md) | `val minutes: `[`Minutes`](../-minutes/index.md) |
| (JVM, COMMON) [seconds](seconds.md) | `val seconds: `[`Seconds`](../-seconds/index.md) |

### Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [minus](minus.md) | `operator fun minus(other: `[`TimeOffset`](./index.md)`): `[`TimeOffset`](./index.md) |
| (JVM, COMMON) [plus](plus.md) | `operator fun plus(other: `[`TimeOffset`](./index.md)`): `[`TimeOffset`](./index.md) |

### Companion Object Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [ZERO](-z-e-r-o.md) | `val ZERO: `[`TimeOffset`](./index.md) |

### Extension Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [toZoneOffset](../to-zone-offset.md) | Converts this [TimeOffset](./index.md) to a Java Time [ZoneOffset](https://docs.oracle.com/javase/8/docs/api/java/time/ZoneOffset.html).`fun `[`TimeOffset`](./index.md)`.toZoneOffset(): `[`ZoneOffset`](https://docs.oracle.com/javase/8/docs/api/java/time/ZoneOffset.html) |
