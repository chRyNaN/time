//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[DateTimeFormatter](index.md)

# DateTimeFormatter

[common]\
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

interface [DateTimeFormatter](index.md) : [Converter](../-converter/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; 

A utility that formats a provided time value, such as an Instant, to a formatted [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) dependent on the [format](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value.

Note that each target platform may have their own [format](format.md) structures. So it might be better to use expect/actual for [format](format.md) values.

## See also

common

| | |
|---|---|
| [com.chrynan.time.DateTimeFormatter](index.md) | For creating an instance of this interface. |
|  | [Javascript Date Formatter Library](https://blog.stevenlevithan.com/archives/date-time-format) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | [common]<br>abstract operator override fun [invoke](invoke.md)(value: Instant, timeZone: TimeZone): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Converts the provided [Instant](invoke.md) and corresponding [timeZone](invoke.md) to a value of T. |

## Properties

| Name | Summary |
|---|---|
| [format](format.md) | [common]<br>abstract val [format](format.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Inheritors

| Name |
|---|
| [AndroidDateTimeFormatter](../-android-date-time-formatter/index.md) |
| [IosDateTimeFormatter](../-ios-date-time-formatter/index.md) |
| [JsDateTimeFormatter](../-js-date-time-formatter/index.md) |
| [JvmDateTimeFormatter](../-jvm-date-time-formatter/index.md) |
