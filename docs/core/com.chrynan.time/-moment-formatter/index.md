[core](../../index.md) / [com.chrynan.time](../index.md) / [MomentFormatter](./index.md)

# MomentFormatter

(JVM, COMMON) `@ExperimentalTime interface MomentFormatter`

This interface represents a utility that can convert a [Moment](../-moment/index.md) into a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) representation. The format for the
[Moment](../-moment/index.md) to be converted to is defined by the [pattern](pattern.md) property.

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [pattern](pattern.md) | The [MomentFormatPattern](../-moment-format-pattern/index.md) that represents the formatted output from converting a [Moment](../-moment/index.md).`abstract val pattern: `[`MomentFormatPattern`](../-moment-format-pattern/index.md) |

### Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [format](format.md) | Converts the provided [Moment](../-moment/index.md) into a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) using the [pattern](pattern.md). Throws a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) if there was an error in the conversion process.`abstract fun format(moment: `[`Moment`](../-moment/index.md)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| (JVM, COMMON) [formatOrNull](format-or-null.md) | Converts the provided [Moment](../-moment/index.md) into a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) using the [pattern](pattern.md). Returns null if there was an error in the conversion process.`abstract fun formatOrNull(moment: `[`Moment`](../-moment/index.md)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Inheritors

| Name | Summary |
|---|---|
| (JVM, COMMON) [JavaMomentFormatterAndParser](../-java-moment-formatter-and-parser/index.md) | `class JavaMomentFormatterAndParser : `[`MomentFormatter`](./index.md)`, `[`MomentParser`](../-moment-parser/index.md) |
