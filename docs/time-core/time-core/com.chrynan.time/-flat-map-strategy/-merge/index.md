//[time-core](../../../../index.md)/[com.chrynan.time](../../index.md)/[FlatMapStrategy](../index.md)/[Merge](index.md)

# Merge

[common]\
data class [Merge](index.md)(limit: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [FlatMapStrategy](../index.md)

Equivalent to the Flow.flatMapMerge function.

## See also

common

| | |
|---|---|
| flatMapMerge |  |

## Constructors

| | |
|---|---|
| [Merge](-merge.md) | [common]<br>fun [Merge](-merge.md)(limit: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = DEFAULT_CONCURRENCY) |

## Properties

| Name | Summary |
|---|---|
| [limit](limit.md) | [common]<br>val [limit](limit.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The amount of concurrently running flat-mapped Flows. The default value is set to DEFAULT_CONCURRENCY. |
