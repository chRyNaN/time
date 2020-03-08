[core](../index.md) / [com.chrynan.time](index.md) / [parser](./parser.md)

# parser

(JVM, COMMON) `@ExperimentalTime fun `[`TimeProvider`](-time-provider/index.md)`.parser(pattern: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`MomentParser`](-moment-parser/index.md)

Retrieves a [MomentParser](-moment-parser/index.md) for the provided [pattern](parser.md#com.chrynan.time$parser(com.chrynan.time.TimeProvider, kotlin.String)/pattern) for converting [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)s into [Moment](-moment/index.md)s. This is a
convenience function that converts the provided [pattern](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) to a [MomentFormatPattern](-moment-format-pattern/index.md), and then calls the
[TimeProvider.parser](-time-provider/parser.md) function.

**Author**
chRyNaN

