[core](../../index.md) / [com.chrynan.time](../index.md) / [CalendarDate](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

(JVM, COMMON) `CalendarDate(year: `[`Year`](../-year/index.md)`, month: `[`Month`](../-month/index.md)`, dayInYear: `[`DayInYear`](../-day-in-year/index.md)`, dayInMonth: `[`DayInMonth`](../-day-in-month/index.md)`, dayOfWeek: `[`DayOfWeek`](../-day-of-week/index.md)`)`

A class that represents a Date within a Calendar with no reference to exact time, such as, minutes or hours, or a
region. Note multiple [CalendarDate](index.md)s may be considered equal if their values are the same, even though the
[Moment](../-moment/index.md)s they came from may be in different regions, so technically they do not represent the same time. This is
because a [CalendarDate](index.md) has no reference to a region.

**Author**
chRyNaN

