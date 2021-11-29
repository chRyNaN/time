//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[MeridiemPeriod](index.md)

# MeridiemPeriod

[common]\
enum [MeridiemPeriod](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[MeridiemPeriod](index.md)&gt; 

An enum representing the two periods of a 24-hour day for [ClockConvention.TWELVE_HOUR](../-clock-convention/-t-w-e-l-v-e_-h-o-u-r/index.md) clocks. Those two periods are a.m. (from Latin "ante meridiem", translating to "before midday"), a.k.a. AM, and p.m. (from Latin "post meridiem" translating to "after midday"), a.k.a. PM.

An hour within the day can easily be converted to a 12-hour time with the associated [MeridiemPeriod](index.md). Likewise, an hour within the 12-hour time and its [MeridiemPeriod](index.md) can be converted to a 24-hour time.

## Entries

| | |
|---|---|
| [PM](-p-m/index.md) | [common]<br>[PM](-p-m/index.md)() |
| [AM](-a-m/index.md) | [common]<br>[AM](-a-m/index.md)() |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [name](-a-m/index.md#-372974862%2FProperties%2F-2124218425) | [common]<br>val [name](-a-m/index.md#-372974862%2FProperties%2F-2124218425): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](-a-m/index.md#-739389684%2FProperties%2F-2124218425) | [common]<br>val [ordinal](-a-m/index.md#-739389684%2FProperties%2F-2124218425): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Extensions

| Name | Summary |
|---|---|
| [isAm](../is-am.md) | [common]<br>val [MeridiemPeriod](index.md).[isAm](../is-am.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isPm](../is-pm.md) | [common]<br>val [MeridiemPeriod](index.md).[isPm](../is-pm.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
