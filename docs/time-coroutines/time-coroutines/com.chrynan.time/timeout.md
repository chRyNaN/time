//[time-coroutines](../../index.md)/[com.chrynan.time](index.md)/[timeout](timeout.md)



# timeout  
[common]  
Content  
@ExperimentalCoroutinesApi()  
@FlowPreview()  
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
  
fun <[T](timeout.md)> Flow<[T](timeout.md)>.[timeout](timeout.md)(duration: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): Flow<[T](timeout.md)>  
More info  


Retrieves a Flow that emits the items of the source Flow but applies a timeout policy for each emitted item. If the next item isn't emitted within the provided timeout [duration](timeout.md) starting from its predecessor, then the resulting Flow terminates with a TimeoutCancellationException by throwing it as an error.



#### Author  


chRyNaN



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.time//timeout/kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]#kotlin.time.Duration/PointingToDeclaration/"></a>duration| <a name="com.chrynan.time//timeout/kotlinx.coroutines.flow.Flow[TypeParam(bounds=[kotlin.Any?])]#kotlin.time.Duration/PointingToDeclaration/"></a><br><br>The timeout [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html).<br><br>|
  
  



