//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[DateTimeString](index.md)



# DateTimeString  
 [common] data class [DateTimeString](index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

A wrapper class for a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value that indicates that this [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value is in ISO-8601 format.



For more information refer to the following: https://en.wikipedia.org/wiki/ISO_8601



Note that this should probably be an inline class but the kotlinx.serialization library doesn't currently support inline classes.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.time/DateTimeString/DateTimeString/#kotlin.String/PointingToDeclaration/"></a>[DateTimeString](-date-time-string.md)| <a name="com.chrynan.time/DateTimeString/DateTimeString/#kotlin.String/PointingToDeclaration/"></a> [common] fun [DateTimeString](-date-time-string.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/DateTimeString.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.time/DateTimeString.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/DateTimeString/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.chrynan.time/DateTimeString/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/DateTimeString/value/#/PointingToDeclaration/"></a>[value](value.md)| <a name="com.chrynan.time/DateTimeString/value/#/PointingToDeclaration/"></a> [common] val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time//compareTo/com.chrynan.time.DateTimeString#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[compareTo](../compare-to.md)| <a name="com.chrynan.time//compareTo/com.chrynan.time.DateTimeString#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>operator fun [DateTimeString](index.md).[compareTo](../compare-to.md)(other: [DateTimeString](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.chrynan.time//durationSinceEpoch/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[durationSinceEpoch](../duration-since-epoch.md)| <a name="com.chrynan.time//durationSinceEpoch/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>val [DateTimeString](index.md).[durationSinceEpoch](../duration-since-epoch.md): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)  <br><br><br>|
| <a name="com.chrynan.time//durationTo/com.chrynan.time.DateTimeString#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[durationTo](../duration-to.md)| <a name="com.chrynan.time//durationTo/com.chrynan.time.DateTimeString#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>infix fun [DateTimeString](index.md).[durationTo](../duration-to.md)(other: [DateTimeString](index.md)): [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)  <br><br><br>|
| <a name="com.chrynan.time//millisecondsSinceEpoch/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[millisecondsSinceEpoch](../milliseconds-since-epoch.md)| <a name="com.chrynan.time//millisecondsSinceEpoch/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  <br>  <br>val [DateTimeString](index.md).[millisecondsSinceEpoch](../milliseconds-since-epoch.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  <br><br><br>|
| <a name="com.chrynan.time//toCalendar/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[toCalendar](../to-calendar.md)| <a name="com.chrynan.time//toCalendar/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [DateTimeString](index.md#%5Bcom.chrynan.time%2FDateTimeString%2F%2F%2FPointingToDeclaration%2F%5D%2FExtensions%2F-1506734136).[toCalendar](../to-calendar.md)(): [Calendar](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html)  <br><br><br>|
| <a name="com.chrynan.time//toDate/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[toDate](../to-date.md)| <a name="com.chrynan.time//toDate/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [DateTimeString](index.md#%5Bcom.chrynan.time%2FDateTimeString%2F%2F%2FPointingToDeclaration%2F%5D%2FExtensions%2F-1506734136).[toDate](../to-date.md)(): [Date](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)  <br><br><br>|
| <a name="com.chrynan.time//toDateTimeLong/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[toDateTimeLong](../to-date-time-long.md)| <a name="com.chrynan.time//toDateTimeLong/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [DateTimeString](index.md).[toDateTimeLong](../to-date-time-long.md)(): [DateTimeLong](../-date-time-long/index.md)  <br><br><br>|
| <a name="com.chrynan.time//toInstant/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[toInstant](../../../../time-core/time-core/com.chrynan.time/to-instant.md)| <a name="com.chrynan.time//toInstant/com.chrynan.time.DateTimeString#/PointingToDeclaration/"></a>[common, ios, js, jvm]  <br>Content  <br>[common]  <br>fun [DateTimeString](index.md).[toInstant](../to-instant.md)(): Instant  <br>[ios]  <br>fun [DateTimeString](index.md#%5Bcom.chrynan.time%2FDateTimeString%2F%2F%2FPointingToDeclaration%2F%5D%2FExtensions%2F-2008944961).[toInstant](index.md#%5Bcom.chrynan.time%2F%2FtoInstant%2Fcom.chrynan.time.DateTimeString%23%2FPointingToDeclaration%2F%5D%2FExtensions%2F-2008944961)(): Instant  <br>[js]  <br>fun [DateTimeString](index.md#%5Bcom.chrynan.time%2FDateTimeString%2F%2F%2FPointingToDeclaration%2F%5D%2FExtensions%2F-1190311339).[toInstant](index.md#%5Bcom.chrynan.time%2F%2FtoInstant%2Fcom.chrynan.time.DateTimeString%23%2FPointingToDeclaration%2F%5D%2FExtensions%2F-1190311339)(): Instant  <br>[jvm]  <br>fun [DateTimeString](index.md#%5Bcom.chrynan.time%2FDateTimeString%2F%2F%2FPointingToDeclaration%2F%5D%2FExtensions%2F-1506734136).[toInstant](index.md#%5Bcom.chrynan.time%2F%2FtoInstant%2Fcom.chrynan.time.DateTimeString%23%2FPointingToDeclaration%2F%5D%2FExtensions%2F-1506734136)(): Instant  <br>More info  <br>Known issues: https://github.com/Kotlin/kotlinx-datetime/issues/67 https://github.  <br><br><br>|
| <a name="com.chrynan.time//toLocalDate/com.chrynan.time.DateTimeString#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[toLocalDate](../to-local-date.md)| <a name="com.chrynan.time//toLocalDate/com.chrynan.time.DateTimeString#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [DateTimeString](index.md).[toLocalDate](../to-local-date.md)(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDate  <br><br><br>|
| <a name="com.chrynan.time//toLocalDateTime/com.chrynan.time.DateTimeString#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[toLocalDateTime](../to-local-date-time.md)| <a name="com.chrynan.time//toLocalDateTime/com.chrynan.time.DateTimeString#kotlinx.datetime.TimeZone/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [DateTimeString](index.md).[toLocalDateTime](../to-local-date-time.md)(timeZone: TimeZone = TimeZone.currentSystemDefault()): LocalDateTime  <br><br><br>|

