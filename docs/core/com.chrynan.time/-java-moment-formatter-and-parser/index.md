[core](../../index.md) / [com.chrynan.time](../index.md) / [JavaMomentFormatterAndParser](./index.md)

# JavaMomentFormatterAndParser

(JVM, COMMON) `@ExperimentalTime class JavaMomentFormatterAndParser : `[`MomentFormatter`](../-moment-formatter/index.md)`, `[`MomentParser`](../-moment-parser/index.md)

### Constructors

| Name | Summary |
|---|---|
| (JVM, COMMON) [&lt;init&gt;](-init-.md) | `JavaMomentFormatterAndParser(pattern: `[`MomentFormatPattern`](../-moment-format-pattern/index.md)`, locale: `[`Locale`](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)` = Locale.getDefault())` |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [pattern](pattern.md) | The [MomentFormatPattern](../-moment-format-pattern/index.md) that represents the formatted output from converting a [Moment](../-moment/index.md).`val pattern: `[`MomentFormatPattern`](../-moment-format-pattern/index.md) |

### Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [format](format.md) | Converts the provided [Moment](../-moment/index.md) into a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) using the [pattern](../-moment-formatter/pattern.md). Throws a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) if there was an error in the conversion process.`fun format(moment: `[`Moment`](../-moment/index.md)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| (JVM, COMMON) [formatOrNull](format-or-null.md) | Converts the provided [Moment](../-moment/index.md) into a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) using the [pattern](../-moment-formatter/pattern.md). Returns null if there was an error in the conversion process.`fun formatOrNull(moment: `[`Moment`](../-moment/index.md)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| (JVM, COMMON) [parse](parse.md) | Converts the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) into a [Moment](../-moment/index.md) using the [pattern](../-moment-parser/pattern.md). Throws a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) if there was an error in the conversion process.`fun parse(input: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Moment`](../-moment/index.md) |
| (JVM, COMMON) [parseOrNull](parse-or-null.md) | Converts the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) into a [Moment](../-moment/index.md) using the [pattern](../-moment-parser/pattern.md). Returns null if there was an error in the conversion process.`fun parseOrNull(input: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Moment`](../-moment/index.md)`?` |
