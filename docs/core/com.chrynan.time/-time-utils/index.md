[core](../../index.md) / [com.chrynan.time](../index.md) / [TimeUtils](./index.md)

# TimeUtils

(JVM, COMMON) `object TimeUtils`

Convenience utilities for converting between different time intervals.

**Author**
chRyNaN

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [DAYS_IN_WEEK](-d-a-y-s_-i-n_-w-e-e-k.md) | `const val DAYS_IN_WEEK: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [HOURS_IN_DAY](-h-o-u-r-s_-i-n_-d-a-y.md) | `const val HOURS_IN_DAY: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [HOURS_IN_WEEK](-h-o-u-r-s_-i-n_-w-e-e-k.md) | `const val HOURS_IN_WEEK: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MICROSECONDS_IN_DAY](-m-i-c-r-o-s-e-c-o-n-d-s_-i-n_-d-a-y.md) | `const val MICROSECONDS_IN_DAY: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MICROSECONDS_IN_HOUR](-m-i-c-r-o-s-e-c-o-n-d-s_-i-n_-h-o-u-r.md) | `const val MICROSECONDS_IN_HOUR: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MICROSECONDS_IN_MILLISECOND](-m-i-c-r-o-s-e-c-o-n-d-s_-i-n_-m-i-l-l-i-s-e-c-o-n-d.md) | `const val MICROSECONDS_IN_MILLISECOND: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MICROSECONDS_IN_MINUTE](-m-i-c-r-o-s-e-c-o-n-d-s_-i-n_-m-i-n-u-t-e.md) | `const val MICROSECONDS_IN_MINUTE: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MICROSECONDS_IN_SECOND](-m-i-c-r-o-s-e-c-o-n-d-s_-i-n_-s-e-c-o-n-d.md) | `const val MICROSECONDS_IN_SECOND: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MICROSECONDS_IN_WEEK](-m-i-c-r-o-s-e-c-o-n-d-s_-i-n_-w-e-e-k.md) | `const val MICROSECONDS_IN_WEEK: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MILLISECONDS_IN_DAY](-m-i-l-l-i-s-e-c-o-n-d-s_-i-n_-d-a-y.md) | `const val MILLISECONDS_IN_DAY: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MILLISECONDS_IN_HOUR](-m-i-l-l-i-s-e-c-o-n-d-s_-i-n_-h-o-u-r.md) | `const val MILLISECONDS_IN_HOUR: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MILLISECONDS_IN_MINUTE](-m-i-l-l-i-s-e-c-o-n-d-s_-i-n_-m-i-n-u-t-e.md) | `const val MILLISECONDS_IN_MINUTE: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MILLISECONDS_IN_SECOND](-m-i-l-l-i-s-e-c-o-n-d-s_-i-n_-s-e-c-o-n-d.md) | `const val MILLISECONDS_IN_SECOND: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MILLISECONDS_IN_WEEK](-m-i-l-l-i-s-e-c-o-n-d-s_-i-n_-w-e-e-k.md) | `const val MILLISECONDS_IN_WEEK: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MINUTES_IN_DAY](-m-i-n-u-t-e-s_-i-n_-d-a-y.md) | `const val MINUTES_IN_DAY: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MINUTES_IN_HOUR](-m-i-n-u-t-e-s_-i-n_-h-o-u-r.md) | `const val MINUTES_IN_HOUR: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [MINUTES_IN_WEEK](-m-i-n-u-t-e-s_-i-n_-w-e-e-k.md) | `const val MINUTES_IN_WEEK: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [NANOSECONDS_IN_DAY](-n-a-n-o-s-e-c-o-n-d-s_-i-n_-d-a-y.md) | `const val NANOSECONDS_IN_DAY: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [NANOSECONDS_IN_HOUR](-n-a-n-o-s-e-c-o-n-d-s_-i-n_-h-o-u-r.md) | `const val NANOSECONDS_IN_HOUR: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [NANOSECONDS_IN_MICROSECOND](-n-a-n-o-s-e-c-o-n-d-s_-i-n_-m-i-c-r-o-s-e-c-o-n-d.md) | `const val NANOSECONDS_IN_MICROSECOND: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [NANOSECONDS_IN_MILLISECOND](-n-a-n-o-s-e-c-o-n-d-s_-i-n_-m-i-l-l-i-s-e-c-o-n-d.md) | `const val NANOSECONDS_IN_MILLISECOND: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [NANOSECONDS_IN_MINUTE](-n-a-n-o-s-e-c-o-n-d-s_-i-n_-m-i-n-u-t-e.md) | `const val NANOSECONDS_IN_MINUTE: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [NANOSECONDS_IN_SECOND](-n-a-n-o-s-e-c-o-n-d-s_-i-n_-s-e-c-o-n-d.md) | `const val NANOSECONDS_IN_SECOND: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [NANOSECONDS_IN_WEEK](-n-a-n-o-s-e-c-o-n-d-s_-i-n_-w-e-e-k.md) | `const val NANOSECONDS_IN_WEEK: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [SECONDS_IN_DAY](-s-e-c-o-n-d-s_-i-n_-d-a-y.md) | `const val SECONDS_IN_DAY: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [SECONDS_IN_HOUR](-s-e-c-o-n-d-s_-i-n_-h-o-u-r.md) | `const val SECONDS_IN_HOUR: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [SECONDS_IN_MINUTE](-s-e-c-o-n-d-s_-i-n_-m-i-n-u-t-e.md) | `const val SECONDS_IN_MINUTE: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM, COMMON) [SECONDS_IN_WEEK](-s-e-c-o-n-d-s_-i-n_-w-e-e-k.md) | `const val SECONDS_IN_WEEK: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
