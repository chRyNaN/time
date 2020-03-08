[core](../index.md) / [com.chrynan.time](index.md) / [epoch](./epoch.md)

# epoch

(JVM, COMMON) `@ExperimentalTime fun `[`TimeProvider`](-time-provider/index.md)`.epoch(regionId: `[`TimeZoneRegionId`](-time-zone-region-id/index.md)` = DefaultTimeZoneRegionId.UTC.regionId): `[`Moment`](-moment/index.md)

Retrieves the [Moment](-moment/index.md) that represents the epoch at UTC/GMT (January 1, 1970 [midnight UTC/GMT](midnight UTC/GMT), not counting
leap seconds [in ISO 8601:1970-01-01T00:00:00Z](#)). This is a static value. This is different from the [utc](utc.md)
function which retrieves the current [Moment](-moment/index.md) at UTC/GMT. This [epoch](./epoch.md) function retrieves the static [Moment](-moment/index.md)
representing the epoch. The value returned is offset by the provided [regionId](epoch.md#com.chrynan.time$epoch(com.chrynan.time.TimeProvider, com.chrynan.time.TimeZoneRegionId)/regionId). If no [regionId](epoch.md#com.chrynan.time$epoch(com.chrynan.time.TimeProvider, com.chrynan.time.TimeZoneRegionId)/regionId) is provided
then the [DefaultTimeZoneRegionId.UTC.regionId](-default-time-zone-region-id/region-id.md) is used.

**Author**
chRyNaN

