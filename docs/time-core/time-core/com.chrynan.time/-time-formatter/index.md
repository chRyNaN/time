//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[TimeFormatter](index.md)

# TimeFormatter

[common]\
interface [TimeFormatter](index.md)

A utility that formats a provided time value, such as an Instant, to a formatted [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) dependent on the [format](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value.

Note that each target platform may have their own [format](format.md) structures. So it might be better to use expect/actual for [format](format.md) values.

## See also

common

| | |
|---|---|
| [com.chrynan.time.TimeFormatter](index.md) | For creating an instance of this interface. |
|  | [Javascript Date Formatter Library](https://blog.stevenlevithan.com/archives/date-time-format) |

## Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | [common]<br>open fun [invoke](invoke.md)(value: [TimeStamp](../-time-stamp/index.md), timeZone: TimeZone): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>open fun [invoke](invoke.md)(value: [UtcMillisSinceEpoch](../-utc-millis-since-epoch/index.md), timeZone: TimeZone): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>abstract operator fun [invoke](invoke.md)(value: Instant, timeZone: TimeZone): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>open fun [invoke](invoke.md)(value: LocalDate, timeZone: TimeZone): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>open fun [invoke](invoke.md)(value: LocalDateTime, timeZone: TimeZone): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [format](format.md) | [common]<br>abstract val [format](format.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Inheritors

| Name |
|---|
| [AndroidTimeFormatter](../-android-time-formatter/index.md) |
| [IosTimeFormatter](../-ios-time-formatter/index.md) |
| [JsTimeFormatter](../-js-time-formatter/index.md) |
| [JvmTimeFormatter](../-jvm-time-formatter/index.md) |
