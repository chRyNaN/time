[core](../index.md) / [com.chrynan.time](index.md) / [today](./today.md)

# today

(JVM, COMMON) `@ExperimentalTime fun `[`TimeProvider`](-time-provider/index.md)`.today(regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)` = timeZoneOffsetProvider.defaultTimeZoneRegionId): `[`Moment`](-moment/index.md)

Retrieves the [Moment](-moment/index.md) representing the start of today. This is a convenience function for calling
[TimeProvider.now](-time-provider/now.md) followed by [Moment.startOfDay](-moment/start-of-day.md).

**Author**
chRyNaN

