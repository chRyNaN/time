//[time-core](../../index.md)/[com.chrynan.time](index.md)/[dateAt](date-at.md)

# dateAt

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Month.[dateAt](date-at.md)(year: [Year](-year/index.md), dayOfMonth: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): LocalDate

Retrieves the LocalDate within this Month at the provided [year](date-at.md) and [dayOfMonth](date-at.md).

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the provided [dayOfMonth](date-at.md) value is invalid for this Month and [year](date-at.md). |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Month.[dateAt](date-at.md)(year: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), dayOfMonth: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): LocalDate

Retrieves the LocalDate within this Month at the provided [year](date-at.md) and [dayOfMonth](date-at.md).

## See also

common

| | |
|---|---|
| [dateAt](date-at.md) |  |

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the provided [dayOfMonth](date-at.md) value is invalid for this Month and [year](date-at.md). |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [Year](-year/index.md).[dateAt](date-at.md)(month: Month, dayOfMonth: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): LocalDate

Retrieves the LocalDate within this [Year](-year/index.md) at the provided [month](date-at.md) and [dayOfMonth](date-at.md).

## See also

common

| | |
|---|---|
| [Month.dateAt](date-at.md) |  |

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the provided [dayOfMonth](date-at.md) value is invalid for this [Year](-year/index.md) and [month](date-at.md). |
