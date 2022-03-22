//[time-core](../../index.md)/[com.chrynan.time](index.md)/[scheduleFlow](schedule-flow.md)

# scheduleFlow

[common]\

@ExperimentalCoroutinesApi

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [scheduleFlow](schedule-flow.md)(utcMillisSinceEpoch: [UtcMillisSinceEpoch](-utc-millis-since-epoch/index.md), clock: Clock = Clock.System): Flow&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;

Retrieves a Flow of [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) that emits at the provided [utcMillisSinceEpoch](schedule-flow.md) and then finishes.

#### Author

chRyNaN

## Parameters

common

| | |
|---|---|
| utcMillisSinceEpoch | The [UtcMillisSinceEpoch](-utc-millis-since-epoch/index.md) when the returned Flow should emit a [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) value then finish. |
| clock | The Clock used to obtain the current [UtcMillisSinceEpoch](-utc-millis-since-epoch/index.md). |

[common]\

@ExperimentalCoroutinesApi

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [scheduleFlow](schedule-flow.md)(durationSinceEpoch: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html), clock: Clock = Clock.System): Flow&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;

Retrieves a Flow of [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) that emits at the provided [durationSinceEpoch](schedule-flow.md) and then finishes.

#### Author

chRyNaN

## Parameters

common

| | |
|---|---|
| durationSinceEpoch | The [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) when the returned Flow should emit a [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) value then finish. |
| clock | The Clock used to obtain the current [UtcMillisSinceEpoch](-utc-millis-since-epoch/index.md). |

[common]\

@ExperimentalCoroutinesApi

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [scheduleFlow](schedule-flow.md)(instant: Instant, clock: Clock = Clock.System): Flow&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;

Retrieves a Flow of [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) that emits at the provided [instant](schedule-flow.md) and then finishes.

#### Author

chRyNaN

## Parameters

common

| | |
|---|---|
| instant | The Instant when the returned Flow should emit a [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) value then finish. |
| clock | The Clock used to obtain the current Instant. |
