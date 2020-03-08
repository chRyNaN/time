[core](../../index.md) / [com.chrynan.time](../index.md) / [TimeOffset](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

(JVM, COMMON) `TimeOffset(hours: `[`Hours`](../-hours/index.md)`, minutes: `[`Minutes`](../-minutes/index.md)` = Minutes(0), seconds: `[`Seconds`](../-seconds/index.md)` = Seconds(0))`

A class representing an offset of time in hours and minutes. This class is useful for representing a time offset
with respect to UTC time for a particular [Moment](../-moment/index.md) in time. This allows specifying a UTC [Moment](../-moment/index.md) in terms to a more
local time. Note that regions of the world don't necessarily have static [TimeOffset](index.md)s from UTC time. An example of
a non-static time offset is in regions that observe daylight savings time, where their time offsets from UTC change
multiple times a year.

**Author**
chRyNaN

