//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[DateTimeLong](index.md)



# DateTimeLong  
 [common] @[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
@[JvmInline](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-inline/index.html)()  
  
class [DateTimeLong](index.md)(**value**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) : [PointInTime](../-point-in-time/index.md)

A wrapper class for a [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) value that represents milliseconds since the UTC Epoch.



Note that this should probably be an inline class but the kotlinx.serialization library doesn't currently support inline classes.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.time/DateTimeLong/DateTimeLong/#kotlin.Long/PointingToDeclaration/"></a>[DateTimeLong](-date-time-long.md)| <a name="com.chrynan.time/DateTimeLong/DateTimeLong/#kotlin.Long/PointingToDeclaration/"></a> [common] fun [DateTimeLong](-date-time-long.md)(value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/DateTimeLong.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.time/DateTimeLong.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/PointInTime/compareTo/#com.chrynan.time.PointInTime/PointingToDeclaration/"></a>[compareTo](../-point-in-time/compare-to.md)| <a name="com.chrynan.time/PointInTime/compareTo/#com.chrynan.time.PointInTime/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [compareTo](../-point-in-time/compare-to.md)(other: [PointInTime](../-point-in-time/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.chrynan.time/PointInTime/durationTo/#com.chrynan.time.PointInTime/PointingToDeclaration/"></a>[durationTo](../-point-in-time/duration-to.md)| <a name="com.chrynan.time/PointInTime/durationTo/#com.chrynan.time.PointInTime/PointingToDeclaration/"></a>[common]  <br>Content  <br>open infix fun [durationTo](../-point-in-time/duration-to.md)(other: [PointInTime](../-point-in-time/index.md)): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)  <br>open infix fun [durationTo](../-point-in-time/duration-to.md)(other: Instant): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)  <br><br><br>|
| <a name="com.chrynan.time/DateTimeLong/toDateTimeLong/#/PointingToDeclaration/"></a>[toDateTimeLong](to-date-time-long.md)| <a name="com.chrynan.time/DateTimeLong/toDateTimeLong/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toDateTimeLong](to-date-time-long.md)(): [DateTimeLong](index.md)  <br><br><br>|
| <a name="com.chrynan.time/DateTimeLong/toDateTimeString/#/PointingToDeclaration/"></a>[toDateTimeString](to-date-time-string.md)| <a name="com.chrynan.time/DateTimeLong/toDateTimeString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toDateTimeString](to-date-time-string.md)(): [DateTimeString](../-date-time-string/index.md)  <br><br><br>|
| <a name="com.chrynan.time/DateTimeLong/toInstant/#/PointingToDeclaration/"></a>[toInstant](to-instant.md)| <a name="com.chrynan.time/DateTimeLong/toInstant/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toInstant](to-instant.md)(): Instant  <br><br><br>|
| <a name="com.chrynan.time/PointInTime/toLocalDateTime/#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[toLocalDateTime](../-point-in-time/to-local-date-time.md)| <a name="com.chrynan.time/PointInTime/toLocalDateTime/#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toLocalDateTime](../-point-in-time/to-local-date-time.md)(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDateTime  <br><br><br>|
| <a name="com.chrynan.time/DateTimeLong/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.chrynan.time/DateTimeLong/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/DateTimeLong/durationSinceEpoch/#/PointingToDeclaration/"></a>[durationSinceEpoch](index.md#%5Bcom.chrynan.time%2FDateTimeLong%2FdurationSinceEpoch%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1549409971)| <a name="com.chrynan.time/DateTimeLong/durationSinceEpoch/#/PointingToDeclaration/"></a> [common] open val [durationSinceEpoch](index.md#%5Bcom.chrynan.time%2FDateTimeLong%2FdurationSinceEpoch%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1549409971): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)   <br>|
| <a name="com.chrynan.time/DateTimeLong/millisecondsSinceEpoch/#/PointingToDeclaration/"></a>[millisecondsSinceEpoch](index.md#%5Bcom.chrynan.time%2FDateTimeLong%2FmillisecondsSinceEpoch%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1549409971)| <a name="com.chrynan.time/DateTimeLong/millisecondsSinceEpoch/#/PointingToDeclaration/"></a> [common] open val [millisecondsSinceEpoch](index.md#%5Bcom.chrynan.time%2FDateTimeLong%2FmillisecondsSinceEpoch%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1549409971): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)   <br>|
| <a name="com.chrynan.time/DateTimeLong/value/#/PointingToDeclaration/"></a>[value](value.md)| <a name="com.chrynan.time/DateTimeLong/value/#/PointingToDeclaration/"></a> [common] val [value](value.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)   <br>|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time//toCalendar/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[toCalendar](../to-calendar.md)| <a name="com.chrynan.time//toCalendar/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>fun [DateTimeLong](index.md#%5Bcom.chrynan.time%2FDateTimeLong%2F%2F%2FPointingToDeclaration%2F%5D%2FExtensions%2F-673524878).[toCalendar](../to-calendar.md)(): [Calendar](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html)  <br><br><br>|
| <a name="com.chrynan.time//toDate/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[toDate](../to-date.md)| <a name="com.chrynan.time//toDate/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>fun [DateTimeLong](index.md#%5Bcom.chrynan.time%2FDateTimeLong%2F%2F%2FPointingToDeclaration%2F%5D%2FExtensions%2F-673524878).[toDate](../to-date.md)(): [Date](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)  <br><br><br>|
| <a name="com.chrynan.time//toLocalDate/com.chrynan.time.DateTimeLong#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[toLocalDate](../to-local-date.md)| <a name="com.chrynan.time//toLocalDate/com.chrynan.time.DateTimeLong#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>fun [DateTimeLong](index.md).[toLocalDate](../to-local-date.md)(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDate  <br><br><br>|

