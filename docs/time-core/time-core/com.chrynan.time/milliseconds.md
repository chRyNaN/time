//[time-core](../../index.md)/[com.chrynan.time](index.md)/[milliseconds](milliseconds.md)

# milliseconds

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

val [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html).[milliseconds](milliseconds.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Returns a [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) equal to this [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) number of milliseconds.

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

val [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html).[milliseconds](milliseconds.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Returns a [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) equal to this [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) number of milliseconds.

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

val [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html).[milliseconds](milliseconds.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Returns a [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) equal to this [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) number of milliseconds.

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if this Double value is NaN. |
