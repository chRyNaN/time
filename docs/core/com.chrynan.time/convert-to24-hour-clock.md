[core](../index.md) / [com.chrynan.time](index.md) / [convertTo24HourClock](./convert-to24-hour-clock.md)

# convertTo24HourClock

(JVM, COMMON) `fun `[`HourInDay`](-hour-in-day/index.md)`.convertTo24HourClock(): `[`HourIn24HourClock`](-hour-in24-hour-clock/index.md)

Converts this [HourInDay](-hour-in-day/index.md) instance to a [HourIn24HourClock](-hour-in24-hour-clock/index.md). If this [HourInDay](-hour-in-day/index.md) is already a [HourIn24HourClock](-hour-in24-hour-clock/index.md),
then this is returned but scoped appropriately. Otherwise a conversion is performed from [HourIn12HourClock](-hour-in12-hour-clock/index.md) to
[HourIn24HourClock](-hour-in24-hour-clock/index.md).

**Author**
chRyNaN

