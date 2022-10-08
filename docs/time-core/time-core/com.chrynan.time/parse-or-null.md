//[time-core](../../index.md)/[com.chrynan.time](index.md)/[parseOrNull](parse-or-null.md)

# parseOrNull

[common]\
fun <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- --->.[parseOrNull](parse-or-null.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeZone: TimeZone = TimeZone.UTC): [DateStamp](-date-stamp/index.md)?

A convenience function for invoking the DateStamp.Companion.parse function but returning `null` instead of throwing an exception in the case of a parsing error.

## See also

common

| | |
|---|---|
| DateStamp.Companion.parse |  |

[common]\
fun [DateTimeStamp.Companion](-date-time-stamp/-companion/index.md).[parseOrNull](parse-or-null.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeZone: TimeZone = TimeZone.UTC): [DateTimeStamp](-date-time-stamp/index.md)?

A convenience function for invoking the [DateTimeStamp.Companion.parse](parse.md) function but returning `null` instead of throwing an exception in the case of a parsing error.

## See also

common

| | |
|---|---|
| [DateTimeStamp.Companion.parse](parse.md) |  |

[common]\
fun Instant.Companion.[parseOrNull](parse-or-null.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): Instant?

Parses the provided [isoString](parse-or-null.md) to an Instant or null if it cannot be parsed.

## See also

common

| | |
|---|---|
| kotlinx.datetime.Instant.Companion |  |
