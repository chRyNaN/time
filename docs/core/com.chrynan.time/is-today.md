[core](../index.md) / [com.chrynan.time](index.md) / [isToday](./is-today.md)

# isToday

(JVM, COMMON) `@ExperimentalTime fun `[`TimeProvider`](-time-provider/index.md)`.isToday(moment: `[`Moment`](-moment/index.md)`, regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)` = timeZoneOffsetProvider.defaultTimeZoneRegionId): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Determines whether the provided [moment](is-today.md#com.chrynan.time$isToday(com.chrynan.time.TimeProvider, com.chrynan.time.Moment, com.chrynan.time.TimeZoneRegionId)/moment) is the same date as today. This is a convenience function for calling
[TimeProvider.now](-time-provider/now.md) and then calling [Moment.isSameDateAs](is-same-date-as.md) on that and the provided value to determine if they are
the same date.

**Author**
chRyNaN

