//[time-core](../../index.md)/[com.chrynan.time](index.md)/[daysIn](days-in.md)

# daysIn

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Month.[daysIn](days-in.md)(year: [Year](-year/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Retrieves the number of days in this month. The provided [year](days-in.md) parameter is used to determine the amount of days in the month of February by determining whether the provided [year](days-in.md) is a leap year or not.

February has 28 days in a standard year and 29 days in a leap year. April, June, September and November have 30 days. All other months have 31 days.

## See also

common

| | |
|---|---|
| [days](days.md) |  |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Month.[daysIn](days-in.md)(year: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Retrieves the number of days in this month. The provided [year](days-in.md) parameter is used to determine the amount of days in the month of February by determining whether the provided [year](days-in.md) is a leap year or not.

February has 28 days in a standard year and 29 days in a leap year. April, June, September and November have 30 days. All other months have 31 days.

## See also

common

| | |
|---|---|
| [daysIn](days-in.md) |  |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [Year](-year/index.md).[daysIn](days-in.md)(month: Month): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Retrieves the number of days in the provided [month](days-in.md) for this [Year](-year/index.md).

## See also

common

| | |
|---|---|
| [Month.daysIn](days-in.md) |  |
