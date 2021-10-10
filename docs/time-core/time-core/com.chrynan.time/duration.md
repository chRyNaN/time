//[time-core](../../index.md)/[com.chrynan.time](index.md)/[duration](duration.md)

# duration

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Month.[duration](duration.md)(year: [Year](-year/index.md)): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Month.[duration](duration.md)(year: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Retrieves the [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) of this Month within the provided [year](duration.md) with day precision.

This is equivalent to calling [Duration.days](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/days.html) with the [daysIn](days-in.md) value.

## See also

common

| | |
|---|---|
| [daysIn](days-in.md) |  |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Month.[duration](duration.md)(isLeapYear: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Retrieves the [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) of this Month considering if this [isLeapYear](duration.md) with day precision.

This is equivalent to calling [Duration.days](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/days.html) with the [daysIn](days-in.md) value.

## See also

common

| | |
|---|---|
| [days](days.md) |  |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

val [Year](-year/index.md).[duration](duration.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Retrieves the [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) of this [Year](-year/index.md) with day precision.

This is equivalent to calling [Duration.days](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/days.html) with the [days](days.md) value.

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

val [YearMonth](-year-month/index.md).[duration](duration.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Retrieves the [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) of this [YearMonth](-year-month/index.md) with day precision.

This is equivalent to calling [Duration.days](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/days.html) with the [daysIn](days-in.md) value.

## See also

common

| | |
|---|---|
| [daysIn](days-in.md) |  |
| [Month.duration](duration.md) |  |
