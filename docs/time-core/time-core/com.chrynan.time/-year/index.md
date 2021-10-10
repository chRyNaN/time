//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[Year](index.md)

# Year

[common]\
@[JvmInline](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-inline/index.html)

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

value class [Year](index.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)&lt;[Year](index.md)&gt; 

Represents a year in a light-weight and type safe value class.

Note: This class contains no information about what type of calendar it belongs to. For example, this class provides no notion of whether the year value represents a year in the Gregorian Calendar or another calendar system, such as the Thai Calendar. However, most functions and properties operate on this class as if it were part of the Gregorian Calendar. For instance, the [isBCE](../is-b-c-e.md) property uses years before the [value](value.md) of zero as BCE.

Note that this is not a duration, this does not represent an amount of years, but rather, represents an exact year within a calendar.

The reason for creating this wrapper value class was to provided type safety for operations that required a year, such as the [isLeap](../is-leap.md) and [days](../days.md) properties. Since the kotlinx datetime library doesn't provide a "Year" concept, this was created in this library. Note however that this is an [ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html) component and may be removed or updated in the future.

Note that for functions that take a [Year](index.md) as a parameter, there may be duplicates of those functions that take an [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) that represents a [Year](index.md). This is done for convenience.

## Constructors

| | |
|---|---|
| [Year](-year.md) | [common]<br>fun [Year](-year.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [compareTo](compare-to.md) | [common]<br>open operator override fun [compareTo](compare-to.md)(other: [Year](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [common]<br>val [value](value.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) value representing the year. |

## Extensions

| Name | Summary |
|---|---|
| [dateAt](../date-at.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [Year](index.md).[dateAt](../date-at.md)(month: Month, dayOfMonth: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): LocalDate<br>Retrieves the LocalDate within this [Year](index.md) at the provided [month](../date-at.md) and [dayOfMonth](../date-at.md). |
| [dates](../dates.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [Year](index.md).[dates](../dates.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;LocalDate&gt;<br>Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of LocalDates representing the days within this [Year](index.md). |
| [datesIn](../dates-in.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [Year](index.md).[datesIn](../dates-in.md)(month: Month): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;LocalDate&gt;<br>Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of LocalDates representing the days within the provided [month](../dates-in.md) in this [Year](index.md). |
| [days](../days.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [Year](index.md).[days](../days.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves the amount of days in this [Year](index.md). |
| [daysIn](../days-in.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [Year](index.md).[daysIn](../days-in.md)(month: Month): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves the number of days in the provided [month](../days-in.md) for this [Year](index.md). |
| [duration](../duration.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [Year](index.md).[duration](../duration.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)<br>Retrieves the [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) of this [Year](index.md) with day precision. |
| [firstDate](../first-date.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [Year](index.md).[firstDate](../first-date.md): LocalDate<br>Retrieves the first LocalDate of the [Year](index.md), January 1st. |
| [firstDateInMonth](../first-date-in-month.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [Year](index.md).[firstDateInMonth](../first-date-in-month.md)(month: Month): LocalDate<br>Retrieves the first LocalDate within the provided Month in this [Year](index.md). |
| [firstYearWeek](../first-year-week.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [Year](index.md).[firstYearWeek](../first-year-week.md)(weekFormat: [WeekFormat](../-week-format/index.md) = WeekFormat()): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves the first year week number of this [Year](index.md) using the provided [weekFormat](../first-year-week.md). |
| [isAD](../is-a-d.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [Year](index.md).[isAD](../is-a-d.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Year](index.md) is within the Anno Domini Era, or any year equal to one or greater. This is equivalent to [isCE](../is-c-e.md). Both properties are provided for convenience for usage depending on locality and personal preference. |
| [isBC](../is-b-c.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [Year](index.md).[isBC](../is-b-c.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Year](index.md) is within the Before Christ Era, or any year less than zero. This is equivalent to [isBCE](../is-b-c-e.md). Both properties are provided for convenience for usage depending on locality and personal preference. |
| [isBCE](../is-b-c-e.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [Year](index.md).[isBCE](../is-b-c-e.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Year](index.md) is within the Before Common Era, or any year less than zero. This is equivalent to [isBC](../is-b-c.md). Both properties are provided for convenience for usage depending on locality and personal preference. |
| [isCE](../is-c-e.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [Year](index.md).[isCE](../is-c-e.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Year](index.md) is within the Common Era, or any year equal to one or greater. This is equivalent to [isAD](../is-a-d.md). Both properties are provided for convenience for usage depending on locality and personal preference. |
| [isLeap](../is-leap.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [Year](index.md).[isLeap](../is-leap.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Checks if the year is a leap year, according to the ISO proleptic calendar system rules. |
| [lastDate](../last-date.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>val [Year](index.md).[lastDate](../last-date.md): LocalDate<br>Retrieves the last LocalDate of the [Year](index.md), December 31st. |
| [lastDateInMonth](../last-date-in-month.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [Year](index.md).[lastDateInMonth](../last-date-in-month.md)(month: Month): LocalDate<br>Retrieves the last LocalDate within the provided Month in this [Year](index.md). |
| [lastYearWeek](../last-year-week.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [Year](index.md).[lastYearWeek](../last-year-week.md)(weekFormat: [WeekFormat](../-week-format/index.md) = WeekFormat()): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves the last year week number of this [Year](index.md) using the provided [weekFormat](../last-year-week.md). |
| [minus](../minus.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>operator fun [Year](index.md).[minus](../minus.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Year](index.md)<br>Returns the [Year](index.md) that is the specified number of years before this one. |
| [plus](../plus.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>operator fun [Year](index.md).[plus](../plus.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Year](index.md)<br>Returns the [Year](index.md) that is the specified number of years after this one. |
| [rangeTo](../range-to.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>operator fun [Year](index.md).[rangeTo](../range-to.md)(other: [Year](index.md)): [YearRange](../-year-range/index.md) |
| [until](../until.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>infix fun [Year](index.md).[until](../until.md)(to: [Year](index.md)): [YearRange](../-year-range/index.md)<br>Returns a range from this [Year](index.md) up to but excluding the provided [to](index.md) value. Each item in the resulting [YearRange](../-year-range/index.md) is incremented by one year. |
| [weeks](../weeks.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [Year](index.md).[weeks](../weeks.md)(weekFormat: [WeekFormat](../-week-format/index.md) = WeekFormat()): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves the number of weeks within this [Year](index.md) using the provided [weekFormat](../weeks.md). |
| [weeksIn](../weeks-in.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [Year](index.md).[weeksIn](../weeks-in.md)(month: Month, weekFormat: [WeekFormat](../-week-format/index.md) = WeekFormat()): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Retrieves the number of weeks within this [Year](index.md) in the provided [month](../weeks-in.md) using the provided [weekFormat](../weeks-in.md). |
