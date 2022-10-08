//[time-core](../../index.md)/[com.chrynan.time](index.md)/[parse](parse.md)

# parse

[common]\
fun <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- --->.[parse](parse.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeZone: TimeZone = TimeZone.UTC): [DateStamp](-date-stamp/index.md)

Parses the ISO [String](parse.md) into a [DateStamp](-date-stamp/index.md) or throws an [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) if the value was not in a supported ISO format. This function first attempts to parse the [isoString](parse.md) as a LocalDate via the LocalDate.parse function, if that fails, it will attempt to parse the [isoString](parse.md) as a LocalDateTime via the LocalDateTime.parse function, and finally, if that fails, parse the [isoString](parse.md) as an Instant via the Instant.parse function. The result is then converted to a [DateStamp](-date-stamp/index.md). In the case of an Instant, this is converted to a [DateStamp](-date-stamp/index.md) via the Instant.toLocalDateTime function followed by the [LocalDateTime.toDateStamp](to-date-stamp.md) function. In the case of a LocalDateTime, this is converted to a [DateStamp](-date-stamp/index.md) via the [LocalDateTime.toDateStamp](to-date-stamp.md) function using the provided [timeZone](parse.md) value which defaults to TimeZone.UTC. In the case of a LocalDate, this is converted to a [DateStamp](-date-stamp/index.md) via the [LocalDate.toDateStamp](to-date-stamp.md) function using the provided [timeZone](parse.md) value which defaults to TimeZone.UTC. If the provided [String](parse.md) cannot be converted to a [DateStamp](-date-stamp/index.md), then an [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) is thrown.

## See also

common

| | |
|---|---|
| kotlinx.datetime.LocalDate.Companion |  |
| kotlinx.datetime.LocalDateTime.Companion |  |
| kotlinx.datetime.Instant.Companion |  |

[common]\
fun [DateTimeStamp.Companion](-date-time-stamp/-companion/index.md).[parse](parse.md)(isoString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), timeZone: TimeZone = TimeZone.UTC): [DateTimeStamp](-date-time-stamp/index.md)

Parses the ISO [String](parse.md) into a [DateTimeStamp](-date-time-stamp/index.md) or throws an [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) if the value was not in a supported ISO format. This function first attempts to parse the [isoString](parse.md) as an Instant via the Instant.parse function, if that fails, it will attempt to parse the [isoString](parse.md) as a LocalDateTime via the LocalDateTime.parse function. The result is then converted to a [DateTimeStamp](-date-time-stamp/index.md). In the case of an Instant, this is converted to a [DateTimeStamp](-date-time-stamp/index.md) via the [Instant.toDateTimeStamp](to-date-time-stamp.md) function. In the case of a LocalDateTime, this is converted to a [DateTimeStamp](-date-time-stamp/index.md) via the [LocalDateTime.toDateTimeStamp](to-date-time-stamp.md) using the provided [timeZone](parse.md) value which defaults to TimeZone.UTC. If the provided [String](parse.md) cannot be converted to a [DateTimeStamp](-date-time-stamp/index.md), then an [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) is thrown.

## See also

common

| | |
|---|---|
| kotlinx.datetime.Instant.Companion |  |
| kotlinx.datetime.LocalDateTime.Companion |  |
