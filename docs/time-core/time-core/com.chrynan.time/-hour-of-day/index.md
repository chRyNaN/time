//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[HourOfDay](index.md)

# HourOfDay

[common]\
@[UnstableTimeApi](../-unstable-time-api/index.md)

interface [HourOfDay](index.md)

Represents the hour within a single day. The [value](value.md) is an integer representation of the hour within a single day, this could be either a value between 0-23 or 0-11 depending on the [clockConvention](clock-convention.md) used.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |
| [TwelveBased](-twelve-based/index.md) | [common]<br>@[UnstableTimeApi](../-unstable-time-api/index.md)<br>data class [TwelveBased](-twelve-based/index.md) : [HourOfDay](index.md)<br>An [HourOfDay](index.md) for a [ClockConvention.TWELVE_HOUR](../-clock-convention/-t-w-e-l-v-e_-h-o-u-r/index.md) clock. |
| [TwentyFourBased](-twenty-four-based/index.md) | [common]<br>@[UnstableTimeApi](../-unstable-time-api/index.md)<br>@[JvmInline](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-inline/index.html)<br>value class [TwentyFourBased](-twenty-four-based/index.md) : [HourOfDay](index.md)<br>An [HourOfDay](index.md) for a [ClockConvention.TWENTY_FOUR_HOUR](../-clock-convention/-t-w-e-n-t-y_-f-o-u-r_-h-o-u-r/index.md) clock. |

## Properties

| Name | Summary |
|---|---|
| [clockConvention](clock-convention.md) | [common]<br>abstract val [clockConvention](clock-convention.md): [ClockConvention](../-clock-convention/index.md) |
| [value](value.md) | [common]<br>abstract val [value](value.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Inheritors

| Name |
|---|
| [TwelveBased](-twelve-based/index.md) |
| [TwentyFourBased](-twenty-four-based/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [isTwelveBased](../is-twelve-based.md) | [common]<br>@[UnstableTimeApi](../-unstable-time-api/index.md)<br>fun [HourOfDay](index.md).[isTwelveBased](../is-twelve-based.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this [HourOfDay](index.md) instance is [HourOfDay.TwelveBased](-twelve-based/index.md), `false` otherwise. |
| [isTwentyFourBased](../is-twenty-four-based.md) | [common]<br>@[UnstableTimeApi](../-unstable-time-api/index.md)<br>fun [HourOfDay](index.md).[isTwentyFourBased](../is-twenty-four-based.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this [HourOfDay](index.md) instance is [HourOfDay.TwentyFourBased](-twenty-four-based/index.md), `false` otherwise. |
