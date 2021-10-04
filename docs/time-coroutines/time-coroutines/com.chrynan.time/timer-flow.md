//[time-coroutines](../../index.md)/[com.chrynan.time](index.md)/[timerFlow](timer-flow.md)

# timerFlow

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

@ExperimentalCoroutinesApi

fun [timerFlow](timer-flow.md)(delay: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): Flow&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;

Retrieves a Flow of [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) that emits after the provided [delay](timer-flow.md) and then finishes.

#### Author

chRyNaN

## Parameters

common

| | |
|---|---|
| delay | The [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) to wait before emitting a [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) and then completing. |
