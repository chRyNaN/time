[core](../../index.md) / [com.chrynan.time](../index.md) / [TimeZoneOffsetProvider](./index.md)

# TimeZoneOffsetProvider

(JVM, COMMON) `@ExperimentalTime interface TimeZoneOffsetProvider`

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [defaultTimeZoneRegionId](default-time-zone-region-id.md) | `abstract val defaultTimeZoneRegionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md) |

### Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [offsetFor](offset-for.md) | `abstract fun offsetFor(durationSinceTheEpoch: `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)`, regionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md)`): `[`TimeOffset`](../-time-offset/index.md)<br>`abstract fun offsetFor(calendarDate: `[`CalendarDate`](../-calendar-date/index.md)`, timeOfDay: `[`TimeOfDay`](../-time-of-day/index.md)`, regionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md)`): `[`TimeOffset`](../-time-offset/index.md)<br>`open fun offsetFor(moment: `[`Moment`](../-moment/index.md)`, regionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md)`): `[`TimeOffset`](../-time-offset/index.md) |

### Inheritors

| Name | Summary |
|---|---|
| (JVM, COMMON) [JavaTimeZoneOffsetProvider](../-java-time-zone-offset-provider/index.md) | `class JavaTimeZoneOffsetProvider : `[`TimeZoneOffsetProvider`](./index.md) |
