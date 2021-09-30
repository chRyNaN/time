//[time-core](../../index.md)/[com.chrynan.time](index.md)/[TimeStamp](-time-stamp.md)

# TimeStamp

[common]\
fun [TimeStamp](-time-stamp.md)(instant: Instant): [TimeStamp.Utc](-time-stamp/-utc/index.md)

Creates an instance of a [TimeStamp](-time-stamp/index.md) with the provided [instant](-time-stamp.md).

#### Return

The [TimeStamp.Utc](-time-stamp/-utc/index.md) value created using the provided [instant](-time-stamp.md).

[common]\
fun [TimeStamp](-time-stamp.md)(localDateTime: LocalDateTime, timeZone: TimeZone): [TimeStamp.Local](-time-stamp/-local/index.md)

Creates an instance of a [TimeStamp](-time-stamp/index.md) with the provided [localDateTime](-time-stamp.md) and [timeZone](-time-stamp.md) values.

#### Return

The [TimeStamp.Local](-time-stamp/-local/index.md) value created using the provided [localDateTime](-time-stamp.md) and [timeZone](-time-stamp.md) values.
