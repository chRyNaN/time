[core](../../index.md) / [com.chrynan.time](../index.md) / [JavaTimeProvider](index.md) / [now](./now.md)

# now

(JVM, COMMON) `fun now(regionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md)`): `[`Moment`](../-moment/index.md)

Retrieves a [Moment](../-moment/index.md) representing the current moment in time for the provided [regionId](../-time-provider/now.md#com.chrynan.time.TimeProvider$now(com.chrynan.time.TimeZoneRegionId)/regionId). If no [regionId](../-time-provider/now.md#com.chrynan.time.TimeProvider$now(com.chrynan.time.TimeZoneRegionId)/regionId) is
provided then the default obtained by the [TimeZoneOffsetProvider.defaultTimeZoneRegionId](../-time-zone-offset-provider/default-time-zone-region-id.md) is used. The
resulting [Moment](../-moment/index.md) is relative to the provided [regionId](../-time-provider/now.md#com.chrynan.time.TimeProvider$now(com.chrynan.time.TimeZoneRegionId)/regionId).

**Author**
chRyNaN

