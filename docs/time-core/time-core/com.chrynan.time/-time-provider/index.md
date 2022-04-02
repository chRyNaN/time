//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[TimeProvider](index.md)

# TimeProvider

[common]\
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

interface [TimeProvider](index.md) : [TimeSource](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-source/index.html), Clock

An extension interface of the [TimeSource](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-source/index.html) and Clock interfaces. This merges those interfaces into one and provides the ability for additional functions to be added.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [markNow](index.md#338029542%2FFunctions%2F-2124218425) | [common]<br>abstract fun [markNow](index.md#338029542%2FFunctions%2F-2124218425)(): [TimeMark](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-mark/index.html) |
| [now](index.md#-912716955%2FFunctions%2F-2124218425) | [common]<br>abstract fun [now](index.md#-912716955%2FFunctions%2F-2124218425)(): Instant |

## Extensions

| Name | Summary |
|---|---|
| [currentMonthAt](../current-month-at.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[currentMonthAt](../current-month-at.md)(timeZone: TimeZone): Month |
| [currentYearAt](../current-year-at.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[currentYearAt](../current-year-at.md)(timeZone: TimeZone): [Year](../-year/index.md) |
| [currentYearMonthAt](../current-year-month-at.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[currentYearMonthAt](../current-year-month-at.md)(timeZone: TimeZone): [YearMonth](../-year-month/index.md) |
| [elapsedSystemTime](../elapsed-system-time.md) | [common, android, ios, js, jvm]<br>[common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>expect val [TimeProvider](index.md).[elapsedSystemTime](../elapsed-system-time.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)<br>[android]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>actual val [TimeProvider](index.md#311984861%2FExtensions%2F219598131).[elapsedSystemTime](../elapsed-system-time.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)<br>[ios]<br>actual val [TimeProvider](index.md#311984861%2FExtensions%2F74489539).[elapsedSystemTime](../elapsed-system-time.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)<br>[js]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>actual val [TimeProvider](index.md#311984861%2FExtensions%2F1894250985).[elapsedSystemTime](../elapsed-system-time.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)<br>[jvm]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>actual val [TimeProvider](index.md#311984861%2FExtensions%2F-1191170225).[elapsedSystemTime](../elapsed-system-time.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) |
| [isToday](../is-today.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[isToday](../is-today.md)(dateStamp: [DateStamp](../-date-stamp/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isTodayAt](../is-today-at.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[isTodayAt](../is-today-at.md)(timeZone: TimeZone, localDate: LocalDate): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isTomorrow](../is-tomorrow.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[isTomorrow](../is-tomorrow.md)(dateStamp: [DateStamp](../-date-stamp/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isTomorrowAt](../is-tomorrow-at.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[isTomorrowAt](../is-tomorrow-at.md)(timeZone: TimeZone, localDate: LocalDate): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isYesterday](../is-yesterday.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[isYesterday](../is-yesterday.md)(dateStamp: [DateStamp](../-date-stamp/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isYesterdayAt](../is-yesterday-at.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[isYesterdayAt](../is-yesterday-at.md)(timeZone: TimeZone, localDate: LocalDate): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [tomorrowAt](../tomorrow-at.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[tomorrowAt](../tomorrow-at.md)(timeZone: TimeZone): LocalDate |
| [yesterdayAt](../yesterday-at.md) | [common]<br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)<br>fun [TimeProvider](index.md).[yesterdayAt](../yesterday-at.md)(timeZone: TimeZone): LocalDate |
