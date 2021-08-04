//[time-coroutines](../../index.md)/[com.chrynan.time](index.md)/[poll](poll.md)

# poll

[common]\

@FlowPreview()

@ExperimentalCoroutinesApi()

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()

fun <[T](poll.md)> [poll](poll.md)(initialDelay: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) = 0.seconds, period: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html), strategy: [PollingStrategy](-polling-strategy/index.md) = PollingStrategy.Latest, flowGetter: suspend ([Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) -> Flow<[T](poll.md)>): Flow<[T](poll.md)>

Polls the Flow retrieved via the provided [flowGetter](poll.md) function, by invoking the [flowGetter](poll.md) function after the provided [initialDelay](poll.md) and then consistently after the provided [period](poll.md), and using the provided polling [strategy](poll.md).
