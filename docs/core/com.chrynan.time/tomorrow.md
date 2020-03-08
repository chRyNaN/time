[core](../index.md) / [com.chrynan.time](index.md) / [tomorrow](./tomorrow.md)

# tomorrow

(JVM, COMMON) `@ExperimentalTime fun `[`TimeProvider`](-time-provider/index.md)`.tomorrow(regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)` = timeZoneOffsetProvider.defaultTimeZoneRegionId): `[`Moment`](-moment/index.md)

Retrieves the [Moment](-moment/index.md) representing the start of the day after today. This is a convenience function for calling
[TimeProvider.now](-time-provider/now.md) followed by [Moment.startOfDay](-moment/start-of-day.md) and then adding a one day [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html).

**Author**
chRyNaN

