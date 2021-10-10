//[time-core](../../index.md)/[com.chrynan.time](index.md)/[atDay](at-day.md)

# atDay

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [YearMonth](-year-month/index.md).[atDay](at-day.md)(dayOfMonth: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): LocalDate

Retrieves the LocalDate within this [YearMonth.year](-year-month/year.md) and [YearMonth.month](-year-month/month.md) and the provided [dayOfMonth](at-day.md).

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the provided [dayOfMonth](at-day.md) value is invalid for this [YearMonth](-year-month/index.md). |
