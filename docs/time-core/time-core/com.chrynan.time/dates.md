//[time-core](../../index.md)/[com.chrynan.time](index.md)/[dates](dates.md)

# dates

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

val [Year](-year/index.md).[dates](dates.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;LocalDate&gt;

Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of LocalDates representing the days within this [Year](-year/index.md).

The resulting [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) should be ordered from first day of the year to the last day of the year. That is the LocalDates in the resulting [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) should be in ascending order based on their LocalDate.dayOfYear value.

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

val [YearMonth](-year-month/index.md).[dates](dates.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;LocalDate&gt;

Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of LocalDates representing the days within this [YearMonth.month](-year-month/month.md) and [YearMonth.year](-year-month/year.md).

## See also

common

| | |
|---|---|
| [Year.datesIn](dates-in.md) |  |
