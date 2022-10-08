//[time-core](../../index.md)/[com.chrynan.time](index.md)/[weekOfYear](week-of-year.md)

# weekOfYear

[common, android, ios, js, jvm]\
[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun LocalDateTime.[weekOfYear](week-of-year.md)(weekFormat: [WeekFormat](-week-format/index.md) = WeekFormat()): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

expect fun LocalDate.[weekOfYear](week-of-year.md)(weekFormat: [WeekFormat](-week-format/index.md) = WeekFormat()): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

[android, ios, js, jvm]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

actual fun LocalDate.[weekOfYear](week-of-year.md)(weekFormat: [WeekFormat](../../../time-core/time-core/com.chrynan.time/-week-format/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)
