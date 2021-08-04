//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[TimeProvider](index.md)

# TimeProvider

[common]\
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()

interface [TimeProvider](index.md) : [TimeSource](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-source/index.html), Clock

An extension interface of the [TimeSource](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-source/index.html) and Clock interfaces. This merges those interfaces into one and provides the ability for additional functions to be added.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [markNow](index.md#338029542%2FFunctions%2F-2124218425) | [common]<br>abstract fun [markNow](index.md#338029542%2FFunctions%2F-2124218425)(): [TimeMark](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-mark/index.html) |
| [now](index.md#-912716955%2FFunctions%2F-2124218425) | [common]<br>abstract fun [now](index.md#-912716955%2FFunctions%2F-2124218425)(): Instant |
