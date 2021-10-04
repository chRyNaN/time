//[time-core](../../index.md)/[com.chrynan.time](index.md)/[TimeProvider](-time-provider.md)

# TimeProvider

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [TimeProvider](-time-provider.md)(timeSource: [TimeSource](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-source/index.html) = TimeSource.Monotonic, clock: Clock = Clock.System): [TimeProvider](-time-provider/index.md)

Creates a [TimeProvider](-time-provider/index.md) by delegating the [TimeSource](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-source/index.html) and Clock super interfaces to the provided [timeSource](-time-provider.md) and [clock](-time-provider.md).
