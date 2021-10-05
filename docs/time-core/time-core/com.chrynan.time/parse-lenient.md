//[time-core](../../index.md)/[com.chrynan.time](index.md)/[parseLenient](parse-lenient.md)

# parseLenient

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Instant.Companion.[parseLenient](parse-lenient.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): Instant

Parses the provided [isoString](parse-lenient.md) to an Instant and allowing leniency with the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), for example a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) without some time values.
