[core](../index.md) / [com.chrynan.time](index.md) / [isSameDateAs](./is-same-date-as.md)

# isSameDateAs

(JVM, COMMON) `@ExperimentalTime fun `[`Moment`](-moment/index.md)`.isSameDateAs(other: `[`Moment`](-moment/index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Determines whether this [Moment](-moment/index.md) and the provided [other](is-same-date-as.md#com.chrynan.time$isSameDateAs(com.chrynan.time.Moment, com.chrynan.time.Moment)/other) are the same [CalendarDate](-calendar-date/index.md). This is a convenience
function for comparing the [Moment.calendarDate](-moment/calendar-date.md) fields of both of the [Moment](-moment/index.md)s.
TODO consider the offset because two calendar dates may be the same but at different regions, so technically not the same

**Author**
chRyNaN

