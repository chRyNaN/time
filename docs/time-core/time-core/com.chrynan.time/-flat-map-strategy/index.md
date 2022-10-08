//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[FlatMapStrategy](index.md)

# FlatMapStrategy

[common]\
@FlowPreview

sealed class [FlatMapStrategy](index.md)

A sealed class that indicates an approach to polling. Each approach determines how the upstream and downstream behaves. The available strategies are [Latest](-latest/index.md), [Merge](-merge/index.md), and [Concat](-concat/index.md).

## Types

| Name | Summary |
|---|---|
| [Concat](-concat/index.md) | [common]<br>object [Concat](-concat/index.md) : [FlatMapStrategy](index.md)<br>Equivalent to the Flow.flatMapConcat function. |
| [Latest](-latest/index.md) | [common]<br>object [Latest](-latest/index.md) : [FlatMapStrategy](index.md)<br>Equivalent to the Flow.flatMapLatest function. |
| [Merge](-merge/index.md) | [common]<br>data class [Merge](-merge/index.md)(val limit: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = DEFAULT_CONCURRENCY) : [FlatMapStrategy](index.md)<br>Equivalent to the Flow.flatMapMerge function. |

## Inheritors

| Name |
|---|
| [Latest](-latest/index.md) |
| [Merge](-merge/index.md) |
| [Concat](-concat/index.md) |
