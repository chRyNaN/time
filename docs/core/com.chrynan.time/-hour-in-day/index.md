[core](../../index.md) / [com.chrynan.time](../index.md) / [HourInDay](./index.md)

# HourInDay

(JVM, COMMON) `sealed class HourInDay`

Represents an hour within a Calendar Day. This is an class wrapper around a numerical representation of a
hour. This could represent an hour within a 12-hour clock period, in which case it would be in the range of 1 to 12
with both 1 and 12 being inclusive, or this could represent an hour within a 24-hour clock period, in which case it
would be in the range of 0 to 24 with 0 being inclusive and 24 being exclusive. Note that no check is performed to
assert that the provided value is valid. Also, note that this class is different from the [Hours](../-hours/index.md) class. Where the
[Hours](../-hours/index.md) class denotes an amount of time or duration, this class denotes an exact hour within a day.

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [value](value.md) | An [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) value indicating the hour number within the day.`abstract val value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Extension Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [convertTo12HourClock](../convert-to12-hour-clock.md) | Converts this [HourInDay](./index.md) instance to a [HourIn12HourClock](../-hour-in12-hour-clock/index.md). If this [HourInDay](./index.md) is already a [HourIn12HourClock](../-hour-in12-hour-clock/index.md), then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn24HourClock](../-hour-in24-hour-clock/index.md) to [HourIn12HourClock](../-hour-in12-hour-clock/index.md).`fun `[`HourInDay`](./index.md)`.convertTo12HourClock(): `[`HourIn12HourClock`](../-hour-in12-hour-clock/index.md) |
| (JVM, COMMON) [convertTo24HourClock](../convert-to24-hour-clock.md) | Converts this [HourInDay](./index.md) instance to a [HourIn24HourClock](../-hour-in24-hour-clock/index.md). If this [HourInDay](./index.md) is already a [HourIn24HourClock](../-hour-in24-hour-clock/index.md), then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn12HourClock](../-hour-in12-hour-clock/index.md) to [HourIn24HourClock](../-hour-in24-hour-clock/index.md).`fun `[`HourInDay`](./index.md)`.convertTo24HourClock(): `[`HourIn24HourClock`](../-hour-in24-hour-clock/index.md) |

### Inheritors

| Name | Summary |
|---|---|
| (JVM, COMMON) [HourIn12HourClock](../-hour-in12-hour-clock/index.md) | Represents a [HourInDay](./index.md) for a twelve hour clock.`data class HourIn12HourClock : `[`HourInDay`](./index.md) |
| (JVM, COMMON) [HourIn24HourClock](../-hour-in24-hour-clock/index.md) | Represents a [HourInDay](./index.md) for a twenty four hour clock.`data class HourIn24HourClock : `[`HourInDay`](./index.md) |
