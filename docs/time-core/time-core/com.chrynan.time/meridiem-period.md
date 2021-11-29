//[time-core](../../index.md)/[com.chrynan.time](index.md)/[meridiemPeriod](meridiem-period.md)

# meridiemPeriod

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [LocalTime](-local-time/index.md).[meridiemPeriod](meridiem-period.md)(isMidnightAM: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [MeridiemPeriod](-meridiem-period/index.md)

Retrieves the [MeridiemPeriod](-meridiem-period/index.md) of this [LocalTime](-local-time/index.md).

Note that different conventions treat midnight and noon differently. Typically, midnight is considered [MeridiemPeriod.AM](-meridiem-period/-a-m/index.md) and noon is considered [MeridiemPeriod.PM](-meridiem-period/-p-m/index.md), which is the default behavior of this function. However, this is not always the case as sometimes they can be inverted. This function supports inverting the midnight and noon [MeridiemPeriod](-meridiem-period/index.md) values by provided the [isMidnightAM](meridiem-period.md) parameter value.

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun LocalDateTime.[meridiemPeriod](meridiem-period.md)(isMidnightAM: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [MeridiemPeriod](-meridiem-period/index.md)

Retrieves the [MeridiemPeriod](-meridiem-period/index.md) of this LocalDateTime.

Note that different conventions treat midnight and noon differently. Typically, midnight is considered [MeridiemPeriod.AM](-meridiem-period/-a-m/index.md) and noon is considered [MeridiemPeriod.PM](-meridiem-period/-p-m/index.md), which is the default behavior of this function. However, this is not always the case as sometimes they can be inverted. This function supports inverting the midnight and noon [MeridiemPeriod](-meridiem-period/index.md) values by provided the [isMidnightAM](meridiem-period.md) parameter value.
