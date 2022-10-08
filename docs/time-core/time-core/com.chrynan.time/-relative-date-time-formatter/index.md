//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[RelativeDateTimeFormatter](index.md)

# RelativeDateTimeFormatter

[common]\
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

interface [RelativeDateTimeFormatter](index.md)

A Utility interface to format time values relative to each other, into a formatted [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).

This component differs from the [DateTimeFormatter](../-date-time-formatter/index.md) in that it compares two sets of time values and outputs a formatted [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) describing the relationship between those values (ex: &quot;15 mins ago&quot;).

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | [common]<br>abstract operator fun [invoke](invoke.md)(fromInstant: Instant, fromTimeZone: TimeZone, toInstant: Instant, toTimeZone: TimeZone): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
