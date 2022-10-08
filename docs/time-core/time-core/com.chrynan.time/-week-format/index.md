//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[WeekFormat](index.md)

# WeekFormat

[common]\
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

data class [WeekFormat](index.md)(val minimalDaysInFirstWeek: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 4, val firstDayOfWeek: DayOfWeek = DayOfWeek.MONDAY)

Represents the formatting for the counting of weeks within a month or year.

## Constructors

| | |
|---|---|
| [WeekFormat](-week-format.md) | [common]<br>fun [WeekFormat](-week-format.md)(minimalDaysInFirstWeek: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 4, firstDayOfWeek: DayOfWeek = DayOfWeek.MONDAY) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [firstDayOfWeek](first-day-of-week.md) | [common]<br>val [firstDayOfWeek](first-day-of-week.md): DayOfWeek<br>Gets the first day-of-week. The first day-of-week varies by culture. For example, the US uses Sunday, while France and the ISO-8601 standard use Monday. This method returns the first day using the standard DayOfWeek enum. |
| [minimalDaysInFirstWeek](minimal-days-in-first-week.md) | [common]<br>val [minimalDaysInFirstWeek](minimal-days-in-first-week.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 4<br>Gets the minimal number of days in the first week. The number of days considered defining the first week of a month or year varies by culture. For example, the ISO-8601 requires 4 days (more than half a week) to be present before counting the first week. |
