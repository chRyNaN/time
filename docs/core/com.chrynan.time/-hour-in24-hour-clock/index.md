[core](../../index.md) / [com.chrynan.time](../index.md) / [HourIn24HourClock](./index.md)

# HourIn24HourClock

(JVM, COMMON) `data class HourIn24HourClock : `[`HourInDay`](../-hour-in-day/index.md)

Represents a [HourInDay](../-hour-in-day/index.md) for a twenty four hour clock.

### Constructors

| Name | Summary |
|---|---|
| (JVM, COMMON) [&lt;init&gt;](-init-.md) | Represents a [HourInDay](../-hour-in-day/index.md) for a twenty four hour clock.`HourIn24HourClock(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [value](value.md) | An [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) indicating the hour, 0 to 23.`val value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Extension Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [convertTo12HourClock](../convert-to12-hour-clock.md) | Converts this [HourInDay](../-hour-in-day/index.md) instance to a [HourIn12HourClock](../-hour-in12-hour-clock/index.md). If this [HourInDay](../-hour-in-day/index.md) is already a [HourIn12HourClock](../-hour-in12-hour-clock/index.md), then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn24HourClock](./index.md) to [HourIn12HourClock](../-hour-in12-hour-clock/index.md).`fun `[`HourInDay`](../-hour-in-day/index.md)`.convertTo12HourClock(): `[`HourIn12HourClock`](../-hour-in12-hour-clock/index.md) |
| (JVM, COMMON) [convertTo24HourClock](../convert-to24-hour-clock.md) | Converts this [HourInDay](../-hour-in-day/index.md) instance to a [HourIn24HourClock](./index.md). If this [HourInDay](../-hour-in-day/index.md) is already a [HourIn24HourClock](./index.md), then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn12HourClock](../-hour-in12-hour-clock/index.md) to [HourIn24HourClock](./index.md).`fun `[`HourInDay`](../-hour-in-day/index.md)`.convertTo24HourClock(): `[`HourIn24HourClock`](./index.md) |
