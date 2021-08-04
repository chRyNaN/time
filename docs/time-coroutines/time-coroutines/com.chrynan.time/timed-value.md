//[time-coroutines](../../index.md)/[com.chrynan.time](index.md)/[timedValue](timed-value.md)

# timedValue

[common]\

@ExperimentalCoroutinesApi()

@FlowPreview()

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()

fun <[T](timed-value.md)> Flow<[T](timed-value.md)>.[timedValue](timed-value.md)(): Flow<[TimedValue](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-timed-value/index.html)<[T](timed-value.md)>>

Retrieves a Flow that emits the items of the source Flow wrapped in a [TimedValue](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-timed-value/index.html) containing the elapsed time interval duration between items being emitted.

#### Author

chRyNaN
