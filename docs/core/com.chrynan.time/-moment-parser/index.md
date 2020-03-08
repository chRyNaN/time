[core](../../index.md) / [com.chrynan.time](../index.md) / [MomentParser](./index.md)

# MomentParser

(JVM, COMMON) `@ExperimentalTime interface MomentParser`

This interface represents a utility that can convert a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) into a [Moment](../-moment/index.md). The format for the input is defined
by the [pattern](pattern.md) property.

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [pattern](pattern.md) | The [MomentFormatPattern](../-moment-format-pattern/index.md) that represents the formatted input from converting a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) to a [Moment](../-moment/index.md).`abstract val pattern: `[`MomentFormatPattern`](../-moment-format-pattern/index.md) |

### Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [parse](parse.md) | Converts the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) into a [Moment](../-moment/index.md) using the [pattern](pattern.md). Throws a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) if there was an error in the conversion process.`abstract fun parse(input: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Moment`](../-moment/index.md) |
| (JVM, COMMON) [parseOrNull](parse-or-null.md) | Converts the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) into a [Moment](../-moment/index.md) using the [pattern](pattern.md). Returns null if there was an error in the conversion process.`abstract fun parseOrNull(input: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Moment`](../-moment/index.md)`?` |

### Inheritors

| Name | Summary |
|---|---|
| (JVM, COMMON) [JavaMomentFormatterAndParser](../-java-moment-formatter-and-parser/index.md) | `class JavaMomentFormatterAndParser : `[`MomentFormatter`](../-moment-formatter/index.md)`, `[`MomentParser`](./index.md) |
