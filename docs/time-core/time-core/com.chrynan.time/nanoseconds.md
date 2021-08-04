//[time-core](../../index.md)/[com.chrynan.time](index.md)/[nanoseconds](nanoseconds.md)

# nanoseconds

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()

val [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html).[nanoseconds](nanoseconds.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

The new updated Duration API is verbose and less kotlin-esque. It prefers static function calls to convert Numbers into durations instead of property accessors which are more readable. This was most likely done to not "pollute" the number namespace. But I find it less friendly. So, this brings back the properties and just delegates to the newer function calls.

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()

val [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html).[nanoseconds](nanoseconds.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Returns a [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) equal to this [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) number of nanoseconds.

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()

val [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html).[nanoseconds](nanoseconds.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

Returns a [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) equal to this [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) number of nanoseconds.

#### Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if this Double value is NaN. |
