[core](../../index.md) / [com.chrynan.time](../index.md) / [CalendarDateAndTime](./index.md)

# CalendarDateAndTime

(JVM, COMMON) `@ExperimentalTime data class CalendarDateAndTime`

A convenience data wrapper class around [CalendarDate](../-calendar-date/index.md) and [TimeOfDay](../-time-of-day/index.md).

**Author**
chRyNaN

### Constructors

| Name | Summary |
|---|---|
| (JVM, COMMON) [&lt;init&gt;](-init-.md) | A convenience data wrapper class around [CalendarDate](../-calendar-date/index.md) and [TimeOfDay](../-time-of-day/index.md).`CalendarDateAndTime(calendarDate: `[`CalendarDate`](../-calendar-date/index.md)`, timeOfDay: `[`TimeOfDay`](../-time-of-day/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [calendarDate](calendar-date.md) | `val calendarDate: `[`CalendarDate`](../-calendar-date/index.md) |
| (JVM, COMMON) [timeOfDay](time-of-day.md) | `val timeOfDay: `[`TimeOfDay`](../-time-of-day/index.md) |

### Extension Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [toLocalDate](../to-local-date.md) | Converts this [CalendarDateAndTime](./index.md) to a Java Time [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html).`fun `[`CalendarDateAndTime`](./index.md)`.toLocalDate(): `[`LocalDate`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) |
| (JVM, COMMON) [toLocalDateTime](../to-local-date-time.md) | Converts this [CalendarDateAndTime](./index.md) to a Java Time [LocalDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html).`fun `[`CalendarDateAndTime`](./index.md)`.toLocalDateTime(): `[`LocalDateTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) |
| (JVM, COMMON) [toLocalTime](../to-local-time.md) | Converts this [CalendarDateAndTime](./index.md) to a Java Time [LocalTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html).`fun `[`CalendarDateAndTime`](./index.md)`.toLocalTime(): `[`LocalTime`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html) |
