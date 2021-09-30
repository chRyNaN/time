//[time-core](../../../../index.md)/[com.chrynan.time](../../index.md)/[TimeStamp](../index.md)/[Local](index.md)

# Local

[common]\
data class [Local](index.md) : [TimeStamp](../index.md)

A [TimeStamp](../index.md) whose [value](value.md) is represented as a LocalDateTime along with its associated [timeZone](time-zone.md). This is particularly useful for representing future time values. Since there can be changes in time zones, such as daylight savings time and when it is observed, it's best to store future time values as a LocalDateTime along with its associated TimeZone value. This way it can easily be converted to an Instant when it needs to be displayed in a UI and at that moment it will be correct. And if the observed daylight savings time changed, for instance, the Instant can still be properly obtained via the LocalDateTime and TimeZone when it is next loaded to be displayed in the UI.

Note that there must be a [timeZone](time-zone.md) value stored for this class, so the [timeZone](time-zone.md) value will never be null.

## Properties

| Name | Summary |
|---|---|
| [timeZone](time-zone.md) | [common]<br>open override val [timeZone](time-zone.md): TimeZone |
| [value](value.md) | [common]<br>open override val [value](value.md): LocalDateTime |
