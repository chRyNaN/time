[core](../../index.md) / [com.chrynan.time](../index.md) / [JavaTimeProvider](index.md) / [moment](./moment.md)

# moment

(JVM, COMMON) `fun moment(durationSinceEpoch: `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)`, regionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md)`): `[`Moment`](../-moment/index.md)

Retrieves a [Moment](../-moment/index.md) for the provided [durationSinceEpoch](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(kotlin.time.Duration, com.chrynan.time.TimeZoneRegionId)/durationSinceEpoch) and [regionId](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(kotlin.time.Duration, com.chrynan.time.TimeZoneRegionId)/regionId). If no [regionId](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(kotlin.time.Duration, com.chrynan.time.TimeZoneRegionId)/regionId) is provided the
default obtained by the [TimeZoneOffsetProvider.defaultTimeZoneRegionId](../-time-zone-offset-provider/default-time-zone-region-id.md) is used. The resulting [Moment](../-moment/index.md) is
relative to the provided [regionId](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(kotlin.time.Duration, com.chrynan.time.TimeZoneRegionId)/regionId). This is the same as obtaining the [Moment](../-moment/index.md) at UTC/GMT for the
[durationSinceEpoch](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(kotlin.time.Duration, com.chrynan.time.TimeZoneRegionId)/durationSinceEpoch) and then offsetting it with the [regionId](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(kotlin.time.Duration, com.chrynan.time.TimeZoneRegionId)/regionId).

**Author**
chRyNaN

(JVM, COMMON) `fun moment(calendarDate: `[`CalendarDate`](../-calendar-date/index.md)`, timeOfDay: `[`TimeOfDay`](../-time-of-day/index.md)`, regionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md)`): `[`Moment`](../-moment/index.md)

Retrieves a [Moment](../-moment/index.md) for the provided [calendarDate](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(com.chrynan.time.CalendarDate, com.chrynan.time.TimeOfDay, com.chrynan.time.TimeZoneRegionId)/calendarDate), [timeOfDay](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(com.chrynan.time.CalendarDate, com.chrynan.time.TimeOfDay, com.chrynan.time.TimeZoneRegionId)/timeOfDay), and [regionId](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(com.chrynan.time.CalendarDate, com.chrynan.time.TimeOfDay, com.chrynan.time.TimeZoneRegionId)/regionId). If no [regionId](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(com.chrynan.time.CalendarDate, com.chrynan.time.TimeOfDay, com.chrynan.time.TimeZoneRegionId)/regionId) is provided
the default obtained by the [TimeZoneOffsetProvider.defaultTimeZoneRegionId](../-time-zone-offset-provider/default-time-zone-region-id.md) is used. The resulting [Moment](../-moment/index.md) is
relative to the provided [regionId](../-time-provider/moment.md#com.chrynan.time.TimeProvider$moment(com.chrynan.time.CalendarDate, com.chrynan.time.TimeOfDay, com.chrynan.time.TimeZoneRegionId)/regionId).

**Author**
chRyNaN

