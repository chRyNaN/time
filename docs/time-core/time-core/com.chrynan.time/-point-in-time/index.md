//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[PointInTime](index.md)



# PointInTime  
 [common] @[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
  
interface [PointInTime](index.md) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)<[PointInTime](index.md)> 

An interface representing a point in time, like a [DateTimeString](../-date-time-string/index.md) or [DateTimeLong](../-date-time-long/index.md), which shares common functions.

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/PointInTime/compareTo/#com.chrynan.time.PointInTime/PointingToDeclaration/"></a>[compareTo](compare-to.md)| <a name="com.chrynan.time/PointInTime/compareTo/#com.chrynan.time.PointInTime/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [compareTo](compare-to.md)(other: [PointInTime](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.chrynan.time/PointInTime/durationTo/#com.chrynan.time.PointInTime/PointingToDeclaration/"></a>[durationTo](duration-to.md)| <a name="com.chrynan.time/PointInTime/durationTo/#com.chrynan.time.PointInTime/PointingToDeclaration/"></a>[common]  <br>Content  <br>open infix fun [durationTo](duration-to.md)(other: [PointInTime](index.md)): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)  <br>open infix fun [durationTo](duration-to.md)(other: Instant): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)  <br><br><br>|
| <a name="com.chrynan.time/PointInTime/toDateTimeLong/#/PointingToDeclaration/"></a>[toDateTimeLong](to-date-time-long.md)| <a name="com.chrynan.time/PointInTime/toDateTimeLong/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [toDateTimeLong](to-date-time-long.md)(): [DateTimeLong](../-date-time-long/index.md)  <br><br><br>|
| <a name="com.chrynan.time/PointInTime/toDateTimeString/#/PointingToDeclaration/"></a>[toDateTimeString](to-date-time-string.md)| <a name="com.chrynan.time/PointInTime/toDateTimeString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [toDateTimeString](to-date-time-string.md)(): [DateTimeString](../-date-time-string/index.md)  <br><br><br>|
| <a name="com.chrynan.time/PointInTime/toInstant/#/PointingToDeclaration/"></a>[toInstant](to-instant.md)| <a name="com.chrynan.time/PointInTime/toInstant/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [toInstant](to-instant.md)(): Instant  <br><br><br>|
| <a name="com.chrynan.time/PointInTime/toLocalDateTime/#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[toLocalDateTime](to-local-date-time.md)| <a name="com.chrynan.time/PointInTime/toLocalDateTime/#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toLocalDateTime](to-local-date-time.md)(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDateTime  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/PointInTime/durationSinceEpoch/#/PointingToDeclaration/"></a>[durationSinceEpoch](duration-since-epoch.md)| <a name="com.chrynan.time/PointInTime/durationSinceEpoch/#/PointingToDeclaration/"></a> [common] open val [durationSinceEpoch](duration-since-epoch.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)   <br>|
| <a name="com.chrynan.time/PointInTime/millisecondsSinceEpoch/#/PointingToDeclaration/"></a>[millisecondsSinceEpoch](milliseconds-since-epoch.md)| <a name="com.chrynan.time/PointInTime/millisecondsSinceEpoch/#/PointingToDeclaration/"></a> [common] open val [millisecondsSinceEpoch](milliseconds-since-epoch.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.time/DateTimeLong///PointingToDeclaration/"></a>[DateTimeLong](../-date-time-long/index.md)|
| <a name="com.chrynan.time/DateTimeString///PointingToDeclaration/"></a>[DateTimeString](../-date-time-string/index.md)|
| <a name="com.chrynan.time/InstantPointInTime///PointingToDeclaration/"></a>[InstantPointInTime](../-instant-point-in-time/index.md)|

