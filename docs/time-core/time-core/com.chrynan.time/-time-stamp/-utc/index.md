//[time-core](../../../../index.md)/[com.chrynan.time](../../index.md)/[TimeStamp](../index.md)/[Utc](index.md)

# Utc

[common]\
data class [Utc](index.md) : [TimeStamp](../index.md)

A [TimeStamp](../index.md) whose [value](value.md) is represented as an Instant. This is particularly useful for representing past or near-future time values.

Note that there is no [timeZone](time-zone.md) stored for this class, so the [timeZone](time-zone.md) value will always be null.

## Properties

| Name | Summary |
|---|---|
| [timeZone](time-zone.md) | [common]<br>open override val [timeZone](time-zone.md): TimeZone? = null |
| [value](value.md) | [common]<br>open override val [value](value.md): Instant |
