//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[Converter](index.md)

# Converter

[common]\
fun interface [Converter](index.md)&lt;[T](index.md)&gt;

An interface that converts an Instant and its related TimeZone to a value of type [T](index.md).

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | [common]<br>abstract operator fun [invoke](invoke.md)(value: Instant, timeZone: TimeZone): [T](index.md)<br>Converts the provided [Instant](invoke.md) and corresponding [timeZone](invoke.md) to a value of [T](index.md). |

## Inheritors

| Name |
|---|
| [DateTimeFormatter](../-date-time-formatter/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [invoke](../invoke.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>inline operator fun &lt;[T](../invoke.md)&gt; [Converter](index.md)&lt;[T](../invoke.md)&gt;.[invoke](../invoke.md)(value: [UtcMillisSinceEpoch](../-utc-millis-since-epoch/index.md), timeZone: TimeZone): [T](../invoke.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>inline operator fun &lt;[T](../invoke.md)&gt; [Converter](index.md)&lt;[T](../invoke.md)&gt;.[invoke](../invoke.md)(value: [DateTimeStamp](../-date-time-stamp/index.md), timeZone: TimeZone): [T](../invoke.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>inline operator fun &lt;[T](../invoke.md)&gt; [Converter](index.md)&lt;[T](../invoke.md)&gt;.[invoke](../invoke.md)(value: [DateTimeStamp.Local](../-date-time-stamp/-local/index.md)): [T](../invoke.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>inline operator fun &lt;[T](../invoke.md)&gt; [Converter](index.md)&lt;[T](../invoke.md)&gt;.[invoke](../invoke.md)(value: LocalDateTime, timeZone: TimeZone): [T](../invoke.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>inline operator fun &lt;[T](../invoke.md)&gt; [Converter](index.md)&lt;[T](../invoke.md)&gt;.[invoke](../invoke.md)(value: LocalDate, timeZone: TimeZone): [T](../invoke.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>inline operator fun &lt;[T](../invoke.md)&gt; [Converter](index.md)&lt;[T](../invoke.md)&gt;.[invoke](../invoke.md)(value: [DateStamp](../-date-stamp/index.md)): [T](../invoke.md) |
