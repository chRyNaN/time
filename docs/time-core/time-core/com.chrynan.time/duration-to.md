//[time-core](../../index.md)/[com.chrynan.time](index.md)/[durationTo](duration-to.md)

# durationTo

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

infix fun Instant.[durationTo](duration-to.md)(other: Instant): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Retrieves the [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) between this Instant and the provided other.

If the other is later in time than this Instant, the returned [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) will be positive.
