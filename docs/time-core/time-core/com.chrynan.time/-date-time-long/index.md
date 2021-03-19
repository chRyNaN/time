//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[DateTimeLong](index.md)



# DateTimeLong  
 [common] data class [DateTimeLong](index.md)(**value**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))

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
| <a name="com.chrynan.time/DateTimeLong/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.chrynan.time/DateTimeLong/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/DateTimeLong/value/#/PointingToDeclaration/"></a>[value](value.md)| <a name="com.chrynan.time/DateTimeLong/value/#/PointingToDeclaration/"></a> [common] val [value](value.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)   <br>|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time//compareTo/com.chrynan.time.DateTimeLong#com.chrynan.time.DateTimeLong/PointingToDeclaration/"></a>[compareTo](../compare-to.md)| <a name="com.chrynan.time//compareTo/com.chrynan.time.DateTimeLong#com.chrynan.time.DateTimeLong/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>operator fun [DateTimeLong](index.md).[compareTo](../compare-to.md)(other: [DateTimeLong](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.chrynan.time//durationSinceEpoch/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[durationSinceEpoch](../duration-since-epoch.md)| <a name="com.chrynan.time//durationSinceEpoch/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>val [DateTimeLong](index.md).[durationSinceEpoch](../duration-since-epoch.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)  <br><br><br>|
| <a name="com.chrynan.time//durationTo/com.chrynan.time.DateTimeLong#com.chrynan.time.DateTimeLong/PointingToDeclaration/"></a>[durationTo](../duration-to.md)| <a name="com.chrynan.time//durationTo/com.chrynan.time.DateTimeLong#com.chrynan.time.DateTimeLong/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>infix fun [DateTimeLong](index.md).[durationTo](../duration-to.md)(other: [DateTimeLong](index.md)): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)  <br><br><br>|
| <a name="com.chrynan.time//millisecondsSinceEpoch/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[millisecondsSinceEpoch](../milliseconds-since-epoch.md)| <a name="com.chrynan.time//millisecondsSinceEpoch/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>val [DateTimeLong](index.md).[millisecondsSinceEpoch](../milliseconds-since-epoch.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  <br><br><br>|
| <a name="com.chrynan.time//toCalendar/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[toCalendar](../to-calendar.md)| <a name="com.chrynan.time//toCalendar/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [DateTimeLong](index.md#%5Bcom.chrynan.time%2FDateTimeLong%2F%2F%2FPointingToDeclaration%2F%5D%2FExtensions%2F-1506734136).[toCalendar](../to-calendar.md)(): [Calendar](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html)  <br><br><br>|
| <a name="com.chrynan.time//toDate/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[toDate](../to-date.md)| <a name="com.chrynan.time//toDate/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [DateTimeLong](index.md#%5Bcom.chrynan.time%2FDateTimeLong%2F%2F%2FPointingToDeclaration%2F%5D%2FExtensions%2F-1506734136).[toDate](../to-date.md)(): [Date](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)  <br><br><br>|
| <a name="com.chrynan.time//toDateTimeString/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[toDateTimeString](../to-date-time-string.md)| <a name="com.chrynan.time//toDateTimeString/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [DateTimeLong](index.md).[toDateTimeString](../to-date-time-string.md)(): [DateTimeString](../-date-time-string/index.md)  <br><br><br>|
| <a name="com.chrynan.time//toInstant/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[toInstant](../to-instant.md)| <a name="com.chrynan.time//toInstant/com.chrynan.time.DateTimeLong#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [DateTimeLong](index.md).[toInstant](../to-instant.md)(): Instant  <br><br><br>|
| <a name="com.chrynan.time//toLocalDate/com.chrynan.time.DateTimeLong#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[toLocalDate](../to-local-date.md)| <a name="com.chrynan.time//toLocalDate/com.chrynan.time.DateTimeLong#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [DateTimeLong](index.md).[toLocalDate](../to-local-date.md)(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDate  <br><br><br>|
| <a name="com.chrynan.time//toLocalDateTime/com.chrynan.time.DateTimeLong#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[toLocalDateTime](../to-local-date-time.md)| <a name="com.chrynan.time//toLocalDateTime/com.chrynan.time.DateTimeLong#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [DateTimeLong](index.md).[toLocalDateTime](../to-local-date-time.md)(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDateTime  <br><br><br>|

