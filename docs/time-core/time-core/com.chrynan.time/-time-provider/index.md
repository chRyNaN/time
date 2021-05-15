//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[TimeProvider](index.md)



# TimeProvider  
 [common] @[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
  
interface [TimeProvider](index.md) : [TimeSource](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-source/index.html), Clock

An extension interface of the [TimeSource](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-source/index.html) and Clock interfaces. This merges those interfaces into one and provides the ability for additional functions to be added.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/TimeProvider.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.time/TimeProvider.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="kotlin.time/TimeSource/markNow/#/PointingToDeclaration/"></a>[markNow](index.md#%5Bkotlin.time%2FTimeSource%2FmarkNow%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1549409971)| <a name="kotlin.time/TimeSource/markNow/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [markNow](index.md#%5Bkotlin.time%2FTimeSource%2FmarkNow%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1549409971)(): [TimeMark](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-time-mark/index.html)  <br><br><br>|
| <a name="kotlinx.datetime/Clock/now/#/PointingToDeclaration/"></a>[now](index.md#%5Bkotlinx.datetime%2FClock%2Fnow%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1549409971)| <a name="kotlinx.datetime/Clock/now/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [now](index.md#%5Bkotlinx.datetime%2FClock%2Fnow%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1549409971)(): Instant  <br><br><br>|

