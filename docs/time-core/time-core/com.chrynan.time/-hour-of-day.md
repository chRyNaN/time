//[time-core](../../index.md)/[com.chrynan.time](index.md)/[HourOfDay](-hour-of-day.md)

# HourOfDay

[common]\

@[UnstableTimeApi](-unstable-time-api/index.md)

fun [HourOfDay](-hour-of-day.md)(twentyFourHourValue: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [HourOfDay.TwentyFourBased](-hour-of-day/-twenty-four-based/index.md)

Constructs a [HourOfDay](-hour-of-day/index.md) from the provided [twentyFourHourValue](-hour-of-day.md). The provided value must be between 0-23.

[common]\

@[UnstableTimeApi](-unstable-time-api/index.md)

fun [HourOfDay](-hour-of-day.md)(twelveHourValue: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), meridiemPeriod: [MeridiemPeriod](-meridiem-period/index.md)): [HourOfDay.TwelveBased](-hour-of-day/-twelve-based/index.md)

Constructs a [HourOfDay](-hour-of-day/index.md) from the provided [twelveHourValue](-hour-of-day.md) and [meridiemPeriod](-hour-of-day.md). The provided value must be between 0-11.
