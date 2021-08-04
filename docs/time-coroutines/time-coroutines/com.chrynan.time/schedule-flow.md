//[time-coroutines](../../index.md)/[com.chrynan.time](index.md)/[scheduleFlow](schedule-flow.md)

# scheduleFlow

[common]\

@ExperimentalCoroutinesApi()

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()

fun [scheduleFlow](schedule-flow.md)(dateTime: [UtcMillisSinceEpoch](../../../time-core/time-core/com.chrynan.time/-utc-millis-since-epoch/index.md), clock: Clock = Clock.System): Flow<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>

Retrieves a Flow of [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) that emits at the provided [dateTime](schedule-flow.md) and then finishes.

#### Author

chRyNaN

## Parameters

common

| | |
|---|---|
| dateTime | The [UtcMillisSinceEpoch](../../../time-core/time-core/com.chrynan.time/-utc-millis-since-epoch/index.md) when the returned Flow should emit a [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) value then finish. |
| clock | The Clock used to obtain the current [UtcMillisSinceEpoch](../../../time-core/time-core/com.chrynan.time/-utc-millis-since-epoch/index.md). |

[common]\

@ExperimentalCoroutinesApi()

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()

fun [scheduleFlow](schedule-flow.md)(dateTime: [UtcMillisSinceEpoch](../../../time-core/time-core/com.chrynan.time/-utc-millis-since-epoch/index.md), timeProvider: [TimeProvider](../../../time-core/time-core/com.chrynan.time/-time-provider/index.md)): Flow<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>

A convenience function for calling [scheduleFlow](schedule-flow.md) with a [TimeProvider](../../../time-core/time-core/com.chrynan.time/-time-provider/index.md).

## See also

common

| | |
|---|---|
| [scheduleFlow](schedule-flow.md) |  |
