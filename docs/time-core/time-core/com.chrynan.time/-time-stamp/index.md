//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[TimeStamp](index.md)

# TimeStamp

[common]\
sealed class [TimeStamp](index.md)

An instant in time. This can be either a UTC time Instant or a LocalDateTime for a particular TimeZone. This sealed class encapsulates both possibilities.

Events in the past are typically stored as Instants which would correspond to the [Utc](index.md), while events in the future (especially the far future) are typically stored as LocalDateTime values along with their respective TimeZones. This allows for properly handling any volatile time changes (ex: daylight savings time).

## Types

| Name | Summary |
|---|---|
| [Local](-local/index.md) | [common]<br>data class [Local](-local/index.md)(**value**: LocalDateTime, **timeZone**: TimeZone) : [TimeStamp](index.md) |
| [Utc](-utc/index.md) | [common]<br>data class [Utc](-utc/index.md)(**value**: Instant) : [TimeStamp](index.md) |

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [common]<br>abstract val [value](value.md): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |

## Inheritors

| Name |
|---|
| [TimeStamp](-utc/index.md) |
| [TimeStamp](-local/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [compareTo](../compare-to.md) | [common]<br>operator fun [TimeStamp](index.md).[compareTo](../compare-to.md)(other: [TimeStamp](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>operator fun [TimeStamp](index.md).[compareTo](../compare-to.md)(other: Instant): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [TimeStamp](index.md).[compareTo](../compare-to.md)(other: [UtcMillisSinceEpoch](../-utc-millis-since-epoch/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [durationSinceEpoch](../duration-since-epoch.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>val [TimeStamp](index.md).[durationSinceEpoch](../duration-since-epoch.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| [durationTo](../duration-to.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>infix fun [TimeStamp](index.md).[durationTo](../duration-to.md)(other: [TimeStamp](index.md)): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| [minus](../minus.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [TimeStamp](index.md).[minus](../minus.md)(other: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): [TimeStamp](index.md) |
| [plus](../plus.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [TimeStamp](index.md).[plus](../plus.md)(other: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): [TimeStamp](index.md) |
| [toEpochMilliseconds](../to-epoch-milliseconds.md) | [common]<br>fun [TimeStamp](index.md).[toEpochMilliseconds](../to-epoch-milliseconds.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [toInstant](../to-instant.md) | [common]<br>fun [TimeStamp](index.md).[toInstant](../to-instant.md)(): Instant |
| [toUtcMillisSinceEpoch](../to-utc-millis-since-epoch.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>fun [TimeStamp](index.md).[toUtcMillisSinceEpoch](../to-utc-millis-since-epoch.md)(): [UtcMillisSinceEpoch](../-utc-millis-since-epoch/index.md) |
