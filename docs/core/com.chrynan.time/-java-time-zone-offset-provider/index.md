[core](../../index.md) / [com.chrynan.time](../index.md) / [JavaTimeZoneOffsetProvider](./index.md)

# JavaTimeZoneOffsetProvider

(JVM, COMMON) `@ExperimentalTime class JavaTimeZoneOffsetProvider : `[`TimeZoneOffsetProvider`](../-time-zone-offset-provider/index.md)

### Constructors

| Name | Summary |
|---|---|
| (JVM, COMMON) [&lt;init&gt;](-init-.md) | `JavaTimeZoneOffsetProvider()` |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [defaultTimeZoneRegionId](default-time-zone-region-id.md) | `val defaultTimeZoneRegionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md) |

### Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [offsetFor](offset-for.md) | `fun offsetFor(calendarDate: `[`CalendarDate`](../-calendar-date/index.md)`, timeOfDay: `[`TimeOfDay`](../-time-of-day/index.md)`, regionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md)`): `[`TimeOffset`](../-time-offset/index.md)<br>`fun offsetFor(durationSinceTheEpoch: `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)`, regionId: `[`TimeZoneRegionId`](../-time-zone-region-id/index.md)`): `[`TimeOffset`](../-time-offset/index.md) |
