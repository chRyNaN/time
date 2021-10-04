//[time-coroutines](../../index.md)/[com.chrynan.time](index.md)/[intervalFlow](interval-flow.md)

# intervalFlow

[common]\

@ExperimentalCoroutinesApi

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [intervalFlow](interval-flow.md)(initialDelay: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) = 0.milliseconds, period: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): Flow&lt;[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)&gt;

Retrieves a Flow of [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) values starting with 0L after [initialDelay](interval-flow.md) followed by ever-increasing values, incrementing by 1L, after each [period](interval-flow.md).

#### Author

chRyNaN

## Parameters

common

| | |
|---|---|
| initialDelay | The initial delay [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) before emitting the first value of 0L. |
| period | The [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) period to wait before emitting values after the first value is emitted. |
