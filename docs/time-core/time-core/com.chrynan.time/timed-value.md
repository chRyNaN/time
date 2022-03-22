//[time-core](../../index.md)/[com.chrynan.time](index.md)/[timedValue](timed-value.md)

# timedValue

[common]\

@ExperimentalCoroutinesApi

@FlowPreview

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun &lt;[T](timed-value.md)&gt; Flow&lt;[T](timed-value.md)&gt;.[timedValue](timed-value.md)(): Flow&lt;[TimedValue](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-timed-value/index.html)&lt;[T](timed-value.md)&gt;&gt;

Retrieves a Flow that emits the items of the source Flow wrapped in a [TimedValue](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-timed-value/index.html) containing the elapsed time interval duration between items being emitted.

#### Author

chRyNaN
