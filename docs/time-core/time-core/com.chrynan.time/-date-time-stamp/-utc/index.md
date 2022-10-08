//[time-core](../../../../index.md)/[com.chrynan.time](../../index.md)/[DateTimeStamp](../index.md)/[Utc](index.md)

# Utc

[common]\
data class [Utc](index.md) : [DateTimeStamp](../index.md)

A [DateTimeStamp](../index.md) whose [value](value.md) is represented as an Instant. This is particularly useful for representing past or near-future time values.

Note that the [timeZone](time-zone.md) for this class will always be TimeZone.UTC.

Use the [DateTimeStamp](../index.md) function to create an instance or this class.

## Properties

| Name | Summary |
|---|---|
| [timeZone](time-zone.md) | [common]<br>open override val [timeZone](time-zone.md): TimeZone |
| [value](value.md) | [common]<br>open override val [value](value.md): Instant |
