//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[LocalTime](index.md)

# LocalTime

[common]\
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

data class [LocalTime](index.md)(hour: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), minute: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), second: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), nanosecond: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

Represents the time components of the LocalDateTime class.

## See also

common

| | |
|---|---|
| kotlinx.datetime.LocalDateTime |  |
| [LocalDate](../-local-date.md) |  |

## Constructors

| | |
|---|---|
| [LocalTime](-local-time.md) | [common]<br>fun [LocalTime](-local-time.md)(hour: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), minute: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), second: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), nanosecond: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [hour](hour.md) | [common]<br>val [hour](hour.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [minute](minute.md) | [common]<br>val [minute](minute.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [nanosecond](nanosecond.md) | [common]<br>val [nanosecond](nanosecond.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [second](second.md) | [common]<br>val [second](second.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Extensions

| Name | Summary |
|---|---|
| [hourInTwelveHourClock](../hour-in-twelve-hour-clock.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>@[UnstableTimeApi](../-unstable-time-api/index.md)<br>val [LocalTime](index.md).[hourInTwelveHourClock](../hour-in-twelve-hour-clock.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves the [LocalTime.hour](hour.md) value within a [ClockConvention.TWELVE_HOUR](../-clock-convention/-t-w-e-l-v-e_-h-o-u-r/index.md) clock. This will return a value between 1 and 12. |
| [isAm](../is-am.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [LocalTime](index.md).[isAm](../is-am.md)(isMidnightAM: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>A convenience function for testing whether this [LocalTime.meridiemPeriod](../meridiem-period.md) is [MeridiemPeriod.AM](../-meridiem-period/-a-m/index.md). |
| [isPm](../is-pm.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [LocalTime](index.md).[isPm](../is-pm.md)(isMidnightAM: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>A convenience function for testing whether this [LocalTime.meridiemPeriod](../meridiem-period.md) is [MeridiemPeriod.PM](../-meridiem-period/-p-m/index.md). |
| [meridiemPeriod](../meridiem-period.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [LocalTime](index.md).[meridiemPeriod](../meridiem-period.md)(isMidnightAM: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [MeridiemPeriod](../-meridiem-period/index.md)<br>Retrieves the [MeridiemPeriod](../-meridiem-period/index.md) of this [LocalTime](index.md). |
| [millisecond](../millisecond.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [LocalTime](index.md).[millisecond](../millisecond.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [twelveBasedHourOfDay](../twelve-based-hour-of-day.md) | [common]<br>@[UnstableTimeApi](../-unstable-time-api/index.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [LocalTime](index.md).[twelveBasedHourOfDay](../twelve-based-hour-of-day.md)(): [HourOfDay.TwelveBased](../-hour-of-day/-twelve-based/index.md)<br>Retrieves the [HourOfDay.TwelveBased](../-hour-of-day/-twelve-based/index.md) value from this LocalDateTime instance. |
| [twentyFourBasedHourOfDay](../twenty-four-based-hour-of-day.md) | [common]<br>@[UnstableTimeApi](../-unstable-time-api/index.md)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [LocalTime](index.md).[twentyFourBasedHourOfDay](../twenty-four-based-hour-of-day.md)(): [HourOfDay.TwentyFourBased](../-hour-of-day/-twenty-four-based/index.md)<br>Retrieves the [HourOfDay.TwentyFourBased](../-hour-of-day/-twenty-four-based/index.md) value from this LocalDateTime instance. |
