[core](../../index.md) / [com.chrynan.time](../index.md) / [CalendarDate](./index.md)

# CalendarDate

(JVM, COMMON) `data class CalendarDate`

A class that represents a Date within a Calendar with no reference to exact time, such as, minutes or hours, or a
region. Note multiple [CalendarDate](./index.md)s may be considered equal if their values are the same, even though the
[Moment](../-moment/index.md)s they came from may be in different regions, so technically they do not represent the same time. This is
because a [CalendarDate](./index.md) has no reference to a region.

**Author**
chRyNaN

### Constructors

| Name | Summary |
|---|---|
| (JVM, COMMON) [&lt;init&gt;](-init-.md) | A class that represents a Date within a Calendar with no reference to exact time, such as, minutes or hours, or a region. Note multiple [CalendarDate](./index.md)s may be considered equal if their values are the same, even though the [Moment](../-moment/index.md)s they came from may be in different regions, so technically they do not represent the same time. This is because a [CalendarDate](./index.md) has no reference to a region.`CalendarDate(year: `[`Year`](../-year/index.md)`, month: `[`Month`](../-month/index.md)`, dayInYear: `[`DayInYear`](../-day-in-year/index.md)`, dayInMonth: `[`DayInMonth`](../-day-in-month/index.md)`, dayOfWeek: `[`DayOfWeek`](../-day-of-week/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [dayInMonth](day-in-month.md) | `val dayInMonth: `[`DayInMonth`](../-day-in-month/index.md) |
| (JVM, COMMON) [dayInYear](day-in-year.md) | `val dayInYear: `[`DayInYear`](../-day-in-year/index.md) |
| (JVM, COMMON) [dayOfWeek](day-of-week.md) | `val dayOfWeek: `[`DayOfWeek`](../-day-of-week/index.md) |
| (JVM, COMMON) [month](month.md) | `val month: `[`Month`](../-month/index.md) |
| (JVM, COMMON) [year](year.md) | `val year: `[`Year`](../-year/index.md) |

### Extension Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [toLocalDate](../to-local-date.md) | Converts this [CalendarDate](./index.md) to a Java Time [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html).`fun `[`CalendarDate`](./index.md)`.toLocalDate(): `[`LocalDate`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) |
