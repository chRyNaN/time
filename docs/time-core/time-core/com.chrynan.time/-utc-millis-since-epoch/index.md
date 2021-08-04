//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[UtcMillisSinceEpoch](index.md)

# UtcMillisSinceEpoch

[common]\
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()

@[JvmInline](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-inline/index.html)()

value class [UtcMillisSinceEpoch](index.md)(**value**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)<[UtcMillisSinceEpoch](index.md)> 

A wrapper class for a [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) value that represents milliseconds since the UTC Epoch.

## Constructors

| | |
|---|---|
| [UtcMillisSinceEpoch](-utc-millis-since-epoch.md) | [common]<br>fun [UtcMillisSinceEpoch](-utc-millis-since-epoch.md)(value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [compareTo](compare-to.md) | [common]<br>open operator override fun [compareTo](compare-to.md)(other: [UtcMillisSinceEpoch](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toInstant](to-instant.md) | [common]<br>fun [toInstant](to-instant.md)(): Instant |
| [toLocalDate](to-local-date.md) | [common]<br>fun [toLocalDate](to-local-date.md)(timeZone: TimeZone): LocalDate |
| [toLocalDateTime](to-local-date-time.md) | [common]<br>fun [toLocalDateTime](to-local-date-time.md)(timeZone: TimeZone): LocalDateTime |

## Properties

| Name | Summary |
|---|---|
| [duration](duration.md) | [common]<br>val [duration](duration.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| [value](value.md) | [common]<br>val [value](value.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

## Extensions

| Name | Summary |
|---|---|
| [compareTo](../compare-to.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [UtcMillisSinceEpoch](index.md).[compareTo](../compare-to.md)(other: [TimeStamp](../-time-stamp/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [UtcMillisSinceEpoch](index.md).[compareTo](../compare-to.md)(other: Instant): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [durationTo](../duration-to.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>infix fun [UtcMillisSinceEpoch](index.md).[durationTo](../duration-to.md)(other: [UtcMillisSinceEpoch](index.md)): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| [minus](../minus.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [UtcMillisSinceEpoch](index.md).[minus](../minus.md)(other: [UtcMillisSinceEpoch](index.md)): [UtcMillisSinceEpoch](index.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [UtcMillisSinceEpoch](index.md).[minus](../minus.md)(other: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [UtcMillisSinceEpoch](index.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [UtcMillisSinceEpoch](index.md).[minus](../minus.md)(other: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): [UtcMillisSinceEpoch](index.md) |
| [plus](../plus.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [UtcMillisSinceEpoch](index.md).[plus](../plus.md)(other: [UtcMillisSinceEpoch](index.md)): [UtcMillisSinceEpoch](index.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [UtcMillisSinceEpoch](index.md).[plus](../plus.md)(other: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [UtcMillisSinceEpoch](index.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>operator fun [UtcMillisSinceEpoch](index.md).[plus](../plus.md)(other: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): [UtcMillisSinceEpoch](index.md) |
| [toCalendar](../../../../time-core/time-core/com.chrynan.time/[jvm]to-calendar.md) | [android, jvm]<br>[android]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>fun [UtcMillisSinceEpoch](index.md#1361117230%2FExtensions%2F219598131).[toCalendar](../[android]to-calendar.md)(): [Calendar](https://developer.android.com/reference/kotlin/java/util/Calendar.html)<br>[jvm]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>fun [UtcMillisSinceEpoch](index.md#1361117230%2FExtensions%2F-1191170225).[toCalendar](../[jvm]to-calendar.md)(): [Calendar](https://developer.android.com/reference/kotlin/java/util/Calendar.html) |
| [toDate](../../../../time-core/time-core/com.chrynan.time/[jvm]to-date.md) | [android, jvm]<br>[android]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>fun [UtcMillisSinceEpoch](index.md#1361117230%2FExtensions%2F219598131).[toDate](../[android]to-date.md)(): [Date](https://developer.android.com/reference/kotlin/java/util/Date.html)<br>[jvm]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>fun [UtcMillisSinceEpoch](index.md#1361117230%2FExtensions%2F-1191170225).[toDate](../[jvm]to-date.md)(): [Date](https://developer.android.com/reference/kotlin/java/util/Date.html) |
| [toTimeStamp](../to-time-stamp.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()<br>fun [UtcMillisSinceEpoch](index.md).[toTimeStamp](../to-time-stamp.md)(): [TimeStamp.Utc](../-time-stamp/-utc/index.md) |
