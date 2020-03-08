[core](../index.md) / [com.chrynan.time](index.md) / [formatter](./formatter.md)

# formatter

(JVM, COMMON) `@ExperimentalTime fun `[`TimeProvider`](-time-provider/index.md)`.formatter(pattern: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`MomentFormatter`](-moment-formatter/index.md)

Retrieves a [MomentFormatter](-moment-formatter/index.md) for the provided [pattern](formatter.md#com.chrynan.time$formatter(com.chrynan.time.TimeProvider, kotlin.String)/pattern) for converting [Moment](-moment/index.md)s into [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)s. This is a
convenience function that converts the provided [pattern](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) to a [MomentFormatPattern](-moment-format-pattern/index.md), and then calls the
[TimeProvider.formatter](-time-provider/formatter.md) function.

**Author**
chRyNaN

