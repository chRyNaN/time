//[time-core](../../index.md)/[com.chrynan.time](index.md)/[weekOfMonth](week-of-month.md)

# weekOfMonth

[common, android, ios, js, jvm]\
[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun LocalDateTime.[weekOfMonth](week-of-month.md)(weekFormat: [WeekFormat](-week-format/index.md) = WeekFormat()): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

expect fun LocalDate.[weekOfMonth](week-of-month.md)(weekFormat: [WeekFormat](-week-format/index.md) = WeekFormat()): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

[android, ios, js, jvm]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

actual fun LocalDate.[weekOfMonth](week-of-month.md)(weekFormat: [WeekFormat](../../../time-core/time-core/com.chrynan.time/-week-format/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)
