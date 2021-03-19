//[time-coroutines](../../../index.md)/[com.chrynan.time](../index.md)/[PollingStrategy](index.md)



# PollingStrategy  
 [common] @FlowPreview()  
  
sealed class [PollingStrategy](index.md)

A sealed class that indicates an approach to polling. Each approach determines how the upstream and downstream behaves. The available strategies are [Latest](-latest/index.md), [Merge](-merge/index.md), and [Concat](-concat/index.md).

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/PollingStrategy.Concat///PointingToDeclaration/"></a>[Concat](-concat/index.md)| <a name="com.chrynan.time/PollingStrategy.Concat///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Concat](-concat/index.md) : [PollingStrategy](index.md)  <br>More info  <br>Equivalent to the Flow.flatMapConcat function.  <br><br><br>|
| <a name="com.chrynan.time/PollingStrategy.Latest///PointingToDeclaration/"></a>[Latest](-latest/index.md)| <a name="com.chrynan.time/PollingStrategy.Latest///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Latest](-latest/index.md) : [PollingStrategy](index.md)  <br>More info  <br>Equivalent to the Flow.flatMapLatest function.  <br><br><br>|
| <a name="com.chrynan.time/PollingStrategy.Merge///PointingToDeclaration/"></a>[Merge](-merge/index.md)| <a name="com.chrynan.time/PollingStrategy.Merge///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Merge](-merge/index.md)(**limit**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [PollingStrategy](index.md)  <br>More info  <br>Equivalent to the Flow.flatMapMerge function.  <br><br><br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.time/PollingStrategy.Latest///PointingToDeclaration/"></a>[PollingStrategy](-latest/index.md)|
| <a name="com.chrynan.time/PollingStrategy.Merge///PointingToDeclaration/"></a>[PollingStrategy](-merge/index.md)|
| <a name="com.chrynan.time/PollingStrategy.Concat///PointingToDeclaration/"></a>[PollingStrategy](-concat/index.md)|

