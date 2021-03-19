//[time-coroutines](../../index.md)/[com.chrynan.time](index.md)/[scheduleFlow](schedule-flow.md)



# scheduleFlow  
[common]  
Content  
@ExperimentalCoroutinesApi()  
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
  
fun [scheduleFlow](schedule-flow.md)(dateTime: [DateTimeString](../../../time-core/time-core/com.chrynan.time/-date-time-string/index.md), clock: Clock = Clock.System): Flow<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>  
More info  


Retrieves a Flow of [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) that emits at the provided [dateTime](schedule-flow.md) and then finishes.



#### Author  


chRyNaN



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeString#kotlinx.datetime.Clock/PointingToDeclaration/"></a>dateTime| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeString#kotlinx.datetime.Clock/PointingToDeclaration/"></a><br><br>The [DateTimeString](../../../time-core/time-core/com.chrynan.time/-date-time-string/index.md) when the returned Flow should emit a [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) value then finish.<br><br>|
| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeString#kotlinx.datetime.Clock/PointingToDeclaration/"></a>clock| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeString#kotlinx.datetime.Clock/PointingToDeclaration/"></a><br><br>The Clock used to obtain the current [DateTimeString](../../../time-core/time-core/com.chrynan.time/-date-time-string/index.md).<br><br>|
  
  


[common]  
Content  
@ExperimentalCoroutinesApi()  
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
  
fun [scheduleFlow](schedule-flow.md)(dateTime: [DateTimeLong](../../../time-core/time-core/com.chrynan.time/-date-time-long/index.md), clock: Clock = Clock.System): Flow<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>  
More info  


Retrieves a Flow of [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) that emits at the provided [dateTime](schedule-flow.md) and then finishes.



#### Author  


chRyNaN



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeLong#kotlinx.datetime.Clock/PointingToDeclaration/"></a>dateTime| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeLong#kotlinx.datetime.Clock/PointingToDeclaration/"></a><br><br>The [DateTimeLong](../../../time-core/time-core/com.chrynan.time/-date-time-long/index.md) when the returned Flow should emit a [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) value then finish.<br><br>|
| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeLong#kotlinx.datetime.Clock/PointingToDeclaration/"></a>clock| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeLong#kotlinx.datetime.Clock/PointingToDeclaration/"></a><br><br>The Clock used to obtain the current [DateTimeLong](../../../time-core/time-core/com.chrynan.time/-date-time-long/index.md).<br><br>|
  
  


[common]  
Content  
@ExperimentalCoroutinesApi()  
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
  
fun [scheduleFlow](schedule-flow.md)(dateTime: [DateTimeString](../../../time-core/time-core/com.chrynan.time/-date-time-string/index.md), timeProvider: [TimeProvider](../../../time-core/time-core/com.chrynan.time/-time-provider/index.md)): Flow<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>  
More info  


A convenience function for calling [scheduleFlow](schedule-flow.md) with a [TimeProvider](../../../time-core/time-core/com.chrynan.time/-time-provider/index.md).



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeString#com.chrynan.time.TimeProvider/PointingToDeclaration/"></a>[scheduleFlow](schedule-flow.md)| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeString#com.chrynan.time.TimeProvider/PointingToDeclaration/"></a>|
  
  


[common]  
Content  
@ExperimentalCoroutinesApi()  
@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
  
fun [scheduleFlow](schedule-flow.md)(dateTime: [DateTimeLong](../../../time-core/time-core/com.chrynan.time/-date-time-long/index.md), timeProvider: [TimeProvider](../../../time-core/time-core/com.chrynan.time/-time-provider/index.md)): Flow<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>  
More info  


A convenience function for calling [scheduleFlow](schedule-flow.md) with a [TimeProvider](../../../time-core/time-core/com.chrynan.time/-time-provider/index.md).



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeLong#com.chrynan.time.TimeProvider/PointingToDeclaration/"></a>[scheduleFlow](schedule-flow.md)| <a name="com.chrynan.time//scheduleFlow/#com.chrynan.time.DateTimeLong#com.chrynan.time.TimeProvider/PointingToDeclaration/"></a>|
  
  



