//[time-coroutines](../../index.md)/[com.chrynan.time](index.md)/[intervalFlow](interval-flow.md)



# intervalFlow  
[common]  
Content  
@ExperimentalCoroutinesApi()  
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
  
fun [intervalFlow](interval-flow.md)(initialDelay: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) = 0.milliseconds, period: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): Flow<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)>  
More info  


Retrieves a Flow of [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) values starting with 0L after [initialDelay](interval-flow.md) followed by ever-increasing values, incrementing by 1L, after each [period](interval-flow.md).



#### Author  


chRyNaN



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.time//intervalFlow/#kotlin.time.Duration#kotlin.time.Duration/PointingToDeclaration/"></a>initialDelay| <a name="com.chrynan.time//intervalFlow/#kotlin.time.Duration#kotlin.time.Duration/PointingToDeclaration/"></a><br><br>The initial delay [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) before emitting the first value of 0L.<br><br>|
| <a name="com.chrynan.time//intervalFlow/#kotlin.time.Duration#kotlin.time.Duration/PointingToDeclaration/"></a>period| <a name="com.chrynan.time//intervalFlow/#kotlin.time.Duration#kotlin.time.Duration/PointingToDeclaration/"></a><br><br>The [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html) period to wait before emitting values after the first value is emitted.<br><br>|
  
  



