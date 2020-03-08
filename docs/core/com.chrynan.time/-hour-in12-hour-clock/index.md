[core](../../index.md) / [com.chrynan.time](../index.md) / [HourIn12HourClock](./index.md)

# HourIn12HourClock

(JVM, COMMON) `data class HourIn12HourClock : `[`HourInDay`](../-hour-in-day/index.md)

Represents a [HourInDay](../-hour-in-day/index.md) for a twelve hour clock.

### Constructors

| Name | Summary |
|---|---|
| (JVM, COMMON) [&lt;init&gt;](-init-.md) | Represents a [HourInDay](../-hour-in-day/index.md) for a twelve hour clock.`HourIn12HourClock(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, period: `[`MeridiemPeriod`](../-meridiem-period/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [period](period.md) | A [MeridiemPeriod](../-meridiem-period/index.md) indicating whether this hour is in AM or PM.`val period: `[`MeridiemPeriod`](../-meridiem-period/index.md) |
| (JVM, COMMON) [value](value.md) | An [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) indicating the hour, 1 to 12.`val value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Extension Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [convertTo12HourClock](../convert-to12-hour-clock.md) | Converts this [HourInDay](../-hour-in-day/index.md) instance to a [HourIn12HourClock](./index.md). If this [HourInDay](../-hour-in-day/index.md) is already a [HourIn12HourClock](./index.md), then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn24HourClock](../-hour-in24-hour-clock/index.md) to [HourIn12HourClock](./index.md).`fun `[`HourInDay`](../-hour-in-day/index.md)`.convertTo12HourClock(): `[`HourIn12HourClock`](./index.md) |
| (JVM, COMMON) [convertTo24HourClock](../convert-to24-hour-clock.md) | Converts this [HourInDay](../-hour-in-day/index.md) instance to a [HourIn24HourClock](../-hour-in24-hour-clock/index.md). If this [HourInDay](../-hour-in-day/index.md) is already a [HourIn24HourClock](../-hour-in24-hour-clock/index.md), then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn12HourClock](./index.md) to [HourIn24HourClock](../-hour-in24-hour-clock/index.md).`fun `[`HourInDay`](../-hour-in-day/index.md)`.convertTo24HourClock(): `[`HourIn24HourClock`](../-hour-in24-hour-clock/index.md) |
