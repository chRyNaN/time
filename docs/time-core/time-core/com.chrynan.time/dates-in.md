//[time-core](../../index.md)/[com.chrynan.time](index.md)/[datesIn](dates-in.md)

# datesIn

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Month.[datesIn](dates-in.md)(year: [Year](-year/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;LocalDate&gt;

Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of LocalDates representing the days within this month in the provided [year](dates-in.md).

The resulting [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) should be ordered from first day of the month to the last day of the month. That is the LocalDates in the resulting [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) should be in ascending order based on their LocalDate.dayOfMonth value.

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Month.[datesIn](dates-in.md)(year: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;LocalDate&gt;

Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of LocalDates representing the days within this month in the provided [year](dates-in.md).

The resulting [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) should be ordered from first day of the month to the last day of the month. That is the LocalDates in the resulting [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) should be in ascending order based on their LocalDate.dayOfMonth value.

## See also

common

| | |
|---|---|
| [datesIn](dates-in.md) |  |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [Year](-year/index.md).[datesIn](dates-in.md)(month: Month): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;LocalDate&gt;

Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of LocalDates representing the days within the provided [month](dates-in.md) in this [Year](-year/index.md).

## See also

common

| | |
|---|---|
| [Month.datesIn](dates-in.md) |  |
