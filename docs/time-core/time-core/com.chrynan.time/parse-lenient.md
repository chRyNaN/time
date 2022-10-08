//[time-core](../../index.md)/[com.chrynan.time](index.md)/[parseLenient](parse-lenient.md)

# parseLenient

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- --->.[parseLenient](parse-lenient.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeZone: TimeZone = TimeZone.UTC): [DateStamp](-date-stamp/index.md)

Similar to the DateStamp.Companion.parse function but uses the [Instant.Companion.parseLenient](parse-lenient.md) function instead of Instant.parse.

## See also

common

| | |
|---|---|
| DateStamp.Companion.parse |  |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [DateTimeStamp.Companion](-date-time-stamp/-companion/index.md).[parseLenient](parse-lenient.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeZone: TimeZone = TimeZone.UTC): [DateTimeStamp](-date-time-stamp/index.md)

Similar to the [DateTimeStamp.Companion.parse](parse.md) function but uses the [Instant.Companion.parseLenient](parse-lenient.md) function instead of Instant.parse.

## See also

common

| | |
|---|---|
| [DateTimeStamp.Companion.parse](parse.md) |  |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Instant.Companion.[parseLenient](parse-lenient.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): Instant

Parses the provided [isoString](parse-lenient.md) to an Instant and allowing leniency with the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), for example a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) without some time values.
