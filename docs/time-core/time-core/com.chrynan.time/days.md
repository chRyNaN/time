//[time-core](../../index.md)/[com.chrynan.time](index.md)/[days](days.md)

# days

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Month.[days](days.md)(isLeapYear: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Retrieves the number of days in this month. The provided [isLeapYear](days.md) parameter is used to determine the amount of days in the month of February.

February has 28 days in a standard year and 29 days in a leap year. April, June, September and November have 30 days. All other months have 31 days.

[common]\
val [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html).[days](days.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Returns a [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) equal to this [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) number of days.

[common]\
val [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html).[days](days.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Returns a [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) equal to this [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) number of days.

[common]\
val [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html).[days](days.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Returns a [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) equal to this [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) number of days.

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if this `Double` value is `NaN`. |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

val [Year](-year/index.md).[days](days.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Retrieves the amount of days in this [Year](-year/index.md).

#### Return

the length of this year in days, 365 or 366 if it is a leap year.

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

val [YearMonth](-year-month/index.md).[days](days.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Retrieves the number of days in this [YearMonth.month](-year-month/month.md) for this [YearMonth.year](-year-month/year.md).

## See also

common

| | |
|---|---|
| [Year.daysIn](days-in.md) |  |
