//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[YearMonth](index.md)

# YearMonth

[common]\
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

data class [YearMonth](index.md)(val year: [Year](../-year/index.md), val month: Month) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)&lt;[YearMonth](index.md)&gt; 

A class representing an association between a [year](year.md) and a [month](month.md).

## Constructors

| | |
|---|---|
| [YearMonth](-year-month.md) | [common]<br>fun [YearMonth](-year-month.md)(year: [Year](../-year/index.md), month: Month) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [compareTo](compare-to.md) | [common]<br>open operator override fun [compareTo](compare-to.md)(other: [YearMonth](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Properties

| Name | Summary |
|---|---|
| [month](month.md) | [common]<br>val [month](month.md): Month |
| [year](year.md) | [common]<br>val [year](year.md): [Year](../-year/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [atDay](../at-day.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [YearMonth](index.md).[atDay](../at-day.md)(dayOfMonth: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): LocalDate<br>Retrieves the LocalDate within this [YearMonth.year](year.md) and [YearMonth.month](month.md) and the provided [dayOfMonth](../at-day.md). |
| [dates](../dates.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [YearMonth](index.md).[dates](../dates.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;LocalDate&gt;<br>Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of LocalDates representing the days within this [YearMonth.month](month.md) and [YearMonth.year](year.md). |
| [days](../days.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [YearMonth](index.md).[days](../days.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves the number of days in this [YearMonth.month](month.md) for this [YearMonth.year](year.md). |
| [duration](../duration.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [YearMonth](index.md).[duration](../duration.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)<br>Retrieves the [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) of this [YearMonth](index.md) with day precision. |
| [firstDate](../first-date.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [YearMonth](index.md).[firstDate](../first-date.md): LocalDate<br>Retrieves the first LocalDate within this [Year](../-year/index.md) and Month. |
| [lastDate](../last-date.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [YearMonth](index.md).[lastDate](../last-date.md): LocalDate<br>Retrieves the last LocalDate within this [Year](../-year/index.md) and Month. |
| [minusMonths](../minus-months.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>infix fun [YearMonth](index.md).[minusMonths](../minus-months.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [YearMonth](index.md)<br>Subtracts the provided [amount](../minus-months.md) of months to this [YearMonth](index.md), incrementing (or decrementing if the [amount](../minus-months.md) is negative) the year and month value as necessary. |
| [minusYears](../minus-years.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>infix fun [YearMonth](index.md).[minusYears](../minus-years.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [YearMonth](index.md)<br>Subtracts the provided [amount](../minus-years.md) of years to this [YearMonth](index.md), incrementing (or decrementing if the [amount](../minus-years.md) is negative) the year and month value as necessary. |
| [plusMonths](../plus-months.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>infix fun [YearMonth](index.md).[plusMonths](../plus-months.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [YearMonth](index.md)<br>Adds the provided [amount](../plus-months.md) of months to this [YearMonth](index.md), incrementing (or decrementing if the [amount](../plus-months.md) is negative) the year and month value as necessary. |
| [plusYears](../plus-years.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>infix fun [YearMonth](index.md).[plusYears](../plus-years.md)(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [YearMonth](index.md)<br>Adds the provided [amount](../plus-years.md) of year to this [YearMonth](index.md), incrementing (or decrementing if the [amount](../plus-years.md) is negative) the year and month value as necessary. |
| [rangeTo](../range-to.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>operator fun [YearMonth](index.md).[rangeTo](../range-to.md)(other: [YearMonth](index.md)): [YearMonthRange](../-year-month-range/index.md) |
| [until](../until.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>infix fun [YearMonth](index.md).[until](../until.md)(to: [YearMonth](index.md)): [YearMonthRange](../-year-month-range/index.md)<br>Returns a range from this [YearMonth](index.md) up to but excluding the provided [to](index.md) value. Each item in the resulting [YearMonthRange](../-year-month-range/index.md) is incremented by one month. |
| [weeks](../weeks.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [YearMonth](index.md).[weeks](../weeks.md)(weekFormat: [WeekFormat](../-week-format/index.md) = WeekFormat()): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves the number of weeks within this [YearMonth.year](year.md) and [YearMonth.month](month.md) using the provided [weekFormat](../weeks.md). |
