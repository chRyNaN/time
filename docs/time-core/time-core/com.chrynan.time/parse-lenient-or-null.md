//[time-core](../../index.md)/[com.chrynan.time](index.md)/[parseLenientOrNull](parse-lenient-or-null.md)

# parseLenientOrNull

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- --->.[parseLenientOrNull](parse-lenient-or-null.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeZone: TimeZone = TimeZone.UTC): [DateStamp](-date-stamp/index.md)?

A convenience function for invoking the DateStamp.Companion.parseLenient function but returning `null` instead of throwing an exception in the case of a parsing error.

## See also

common

| | |
|---|---|
| DateStamp.Companion.parseLenient |  |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun [DateTimeStamp.Companion](-date-time-stamp/-companion/index.md).[parseLenientOrNull](parse-lenient-or-null.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeZone: TimeZone = TimeZone.UTC): [DateTimeStamp](-date-time-stamp/index.md)?

A convenience function for invoking the [DateTimeStamp.Companion.parseLenient](parse-lenient.md) function but returning `null` instead of throwing an exception in the case of a parsing error.

## See also

common

| | |
|---|---|
| [DateTimeStamp.Companion.parseLenient](parse-lenient.md) |  |

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

fun Instant.Companion.[parseLenientOrNull](parse-lenient-or-null.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): Instant?

Parses the provided [isoString](parse-lenient-or-null.md) to an Instant or null if it can not be parsed.

## See also

common

| | |
|---|---|
| [parseLenient](parse-lenient.md) |  |
