//[time-core](../../index.md)/[com.chrynan.time](index.md)/[timeout](timeout.md)

# timeout

[common]\

@ExperimentalCoroutinesApi

@FlowPreview

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun &lt;[T](timeout.md)&gt; Flow&lt;[T](timeout.md)&gt;.[timeout](timeout.md)(duration: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): Flow&lt;[T](timeout.md)&gt;

Retrieves a Flow that emits the items of the source Flow but applies a timeout policy for each emitted item. If the next item isn't emitted within the provided timeout [duration](timeout.md) starting from its predecessor, then the resulting Flow terminates with a TimeoutCancellationException by throwing it as an error.

#### Author

chRyNaN

## Parameters

common

| | |
|---|---|
| duration | The timeout [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html). |
