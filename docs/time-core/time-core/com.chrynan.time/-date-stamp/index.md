//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[DateStamp](index.md)

# DateStamp

[common]\
data class [DateStamp](index.md)(date: LocalDate, timeZone: TimeZone)

Represents a LocalDate and its associated TimeZone. This class represents a single day without time information. This is similar to the [TimeStamp](../-time-stamp/index.md) class but without any associated time data, since it represents the entire day.

## Constructors

| | |
|---|---|
| [DateStamp](-date-stamp.md) | [common]<br>fun [DateStamp](-date-stamp.md)(date: LocalDate, timeZone: TimeZone) |

## Properties

| Name | Summary |
|---|---|
| [date](date.md) | [common]<br>val [date](date.md): LocalDate |
| [timeZone](time-zone.md) | [common]<br>val [timeZone](time-zone.md): TimeZone |

## Extensions

| Name | Summary |
|---|---|
| [toInstantAtStartOfDay](../to-instant-at-start-of-day.md) | [common]<br>fun [DateStamp](index.md).[toInstantAtStartOfDay](../to-instant-at-start-of-day.md)(): Instant<br>Converts this [DateStamp](index.md) to an Instant at the start of this day. |
