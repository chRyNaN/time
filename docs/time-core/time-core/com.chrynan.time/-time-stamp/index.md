//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[TimeStamp](index.md)

# TimeStamp

[common]\
sealed class [TimeStamp](index.md)

An instant in time. This can be either a UTC time Instant or a LocalDateTime for a particular TimeZone. This sealed class encapsulates both possibilities.

To create an instance of this [TimeStamp](index.md) class, use either one of the [TimeStamp](index.md) or [TimeStamp](index.md) functions.

Events in the past are typically stored as Instants which would correspond to the [Utc](index.md), while events in the future (especially the far future) are typically stored as LocalDateTime values along with their respective TimeZones. This allows for properly handling any volatile time changes (ex: daylight savings time). So this [TimeStamp](index.md) class is useful when you need to represent both past and future events.

To perform any operations on the [TimeStamp](index.md) class, first convert it to an Instant using the [toInstant](../to-instant.md) function. Then it is trivial to convert it back into a [TimeStamp](index.md). This avoids the needs of having duplicate functionality for both types and reduces the possibility of errors.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |
| [Local](-local/index.md) | [common]<br>data class [Local](-local/index.md) : [TimeStamp](index.md)<br>A [TimeStamp](index.md) whose [value](-local/value.md) is represented as a LocalDateTime along with its associated [timeZone](-local/time-zone.md). This is particularly useful for representing future time values. Since there can be changes in time zones, such as daylight savings time and when it is observed, it's best to store future time values as a LocalDateTime along with its associated TimeZone value. This way it can easily be converted to an Instant when it needs to be displayed in a UI and at that moment it will be correct. And if the observed daylight savings time changed, for instance, the Instant can still be properly obtained via the LocalDateTime and TimeZone when it is next loaded to be displayed in the UI. |
| [Utc](-utc/index.md) | [common]<br>data class [Utc](-utc/index.md) : [TimeStamp](index.md)<br>A [TimeStamp](index.md) whose [value](-utc/value.md) is represented as an Instant. This is particularly useful for representing past or near-future time values. |

## Properties

| Name | Summary |
|---|---|
| [timeZone](time-zone.md) | [common]<br>abstract val [timeZone](time-zone.md): TimeZone? |
| [value](value.md) | [common]<br>abstract val [value](value.md): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |

## Inheritors

| Name |
|---|
| [Utc](-utc/index.md) |
| [Local](-local/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [toInstant](../to-instant.md) | [common]<br>fun [TimeStamp](index.md).[toInstant](../to-instant.md)(): Instant<br>Converts this [TimeStamp](index.md) into an Instant. This is useful for manipulation of the time value or displaying within a UI. |
