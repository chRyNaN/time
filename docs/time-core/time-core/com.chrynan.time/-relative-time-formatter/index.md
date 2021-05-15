//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[RelativeTimeFormatter](index.md)



# RelativeTimeFormatter  
 [common] @[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
  
interface [RelativeTimeFormatter](index.md)

A Utility interface to format time values to UI text relative to the current time.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/RelativeTimeFormatter.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.time/RelativeTimeFormatter.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/RelativeTimeFormatter/formatElapsedTime/#kotlin.time.Duration/PointingToDeclaration/"></a>[formatElapsedTime](format-elapsed-time.md)| <a name="com.chrynan.time/RelativeTimeFormatter/formatElapsedTime/#kotlin.time.Duration/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [formatElapsedTime](format-elapsed-time.md)(duration: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  <br><br><br>|
| <a name="com.chrynan.time/RelativeTimeFormatter/formatFutureDurationRelativeToNow/#kotlin.time.Duration/PointingToDeclaration/"></a>[formatFutureDurationRelativeToNow](format-future-duration-relative-to-now.md)| <a name="com.chrynan.time/RelativeTimeFormatter/formatFutureDurationRelativeToNow/#kotlin.time.Duration/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [formatFutureDurationRelativeToNow](format-future-duration-relative-to-now.md)(futureDuration: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  <br><br><br>|
| <a name="com.chrynan.time/RelativeTimeFormatter/formatFutureRelativeToNow/#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[formatFutureRelativeToNow](format-future-relative-to-now.md)| <a name="com.chrynan.time/RelativeTimeFormatter/formatFutureRelativeToNow/#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [formatFutureRelativeToNow](format-future-relative-to-now.md)(futureTime: [DateTimeString](../-date-time-string/index.md)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  <br><br><br>|
| <a name="com.chrynan.time/RelativeTimeFormatter/formatPastDurationRelativeToNow/#kotlin.time.Duration/PointingToDeclaration/"></a>[formatPastDurationRelativeToNow](format-past-duration-relative-to-now.md)| <a name="com.chrynan.time/RelativeTimeFormatter/formatPastDurationRelativeToNow/#kotlin.time.Duration/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [formatPastDurationRelativeToNow](format-past-duration-relative-to-now.md)(pastDuration: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  <br><br><br>|
| <a name="com.chrynan.time/RelativeTimeFormatter/formatPastRelativeToNow/#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[formatPastRelativeToNow](format-past-relative-to-now.md)| <a name="com.chrynan.time/RelativeTimeFormatter/formatPastRelativeToNow/#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [formatPastRelativeToNow](format-past-relative-to-now.md)(pastTime: [DateTimeString](../-date-time-string/index.md)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  <br><br><br>|

