//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[MonthDay](index.md)

# MonthDay

[common]\
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

data class [MonthDay](index.md)(month: Month, dayOfMonth: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)&lt;[MonthDay](index.md)&gt; 

A class representing an association between a [month](month.md) and a [dayOfMonth](day-of-month.md).

## Constructors

| | |
|---|---|
| [MonthDay](-month-day.md) | [common]<br>fun [MonthDay](-month-day.md)(month: Month, dayOfMonth: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [compareTo](compare-to.md) | [common]<br>open operator override fun [compareTo](compare-to.md)(other: [MonthDay](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Properties

| Name | Summary |
|---|---|
| [dayOfMonth](day-of-month.md) | [common]<br>val [dayOfMonth](day-of-month.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [month](month.md) | [common]<br>val [month](month.md): Month |

## Extensions

| Name | Summary |
|---|---|
| [atYear](../at-year.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [MonthDay](index.md).[atYear](../at-year.md)(year: [Year](../-year/index.md)): LocalDate<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [MonthDay](index.md).[atYear](../at-year.md)(year: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): LocalDate<br>Retrieves the LocalDate within the provided [year](../at-year.md) and this [MonthDay.month](month.md) and [MonthDay.dayOfMonth](day-of-month.md). |
| [isValidYear](../is-valid-year.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [MonthDay](index.md).[isValidYear](../is-valid-year.md)(year: [Year](../-year/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [MonthDay](index.md).[isValidYear](../is-valid-year.md)(year: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Checks if the year is valid for this month-day. |
