//[time-core](../../../index.md)/[com.chrynan.time](../index.md)/[TimeFormatter](index.md)



# TimeFormatter  
 [common] @[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)()  
  
interface [TimeFormatter](index.md)

A Utility interface to format [DateTimeString](../-date-time-string/index.md)s to UI text.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/TimeFormatter.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.time/TimeFormatter.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.time/TimeFormatter/formatElapsedTime/#kotlin.time.Duration/PointingToDeclaration/"></a>[formatElapsedTime](format-elapsed-time.md)| <a name="com.chrynan.time/TimeFormatter/formatElapsedTime/#kotlin.time.Duration/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [formatElapsedTime](format-elapsed-time.md)(duration: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  <br><br><br>|
| <a name="com.chrynan.time/TimeFormatter/formatFutureDurationRelativeToNow/#kotlin.time.Duration/PointingToDeclaration/"></a>[formatFutureDurationRelativeToNow](format-future-duration-relative-to-now.md)| <a name="com.chrynan.time/TimeFormatter/formatFutureDurationRelativeToNow/#kotlin.time.Duration/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [formatFutureDurationRelativeToNow](format-future-duration-relative-to-now.md)(futureDuration: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  <br><br><br>|
| <a name="com.chrynan.time/TimeFormatter/formatFutureRelativeToNow/#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[formatFutureRelativeToNow](format-future-relative-to-now.md)| <a name="com.chrynan.time/TimeFormatter/formatFutureRelativeToNow/#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [formatFutureRelativeToNow](format-future-relative-to-now.md)(futureTime: [DateTimeString](../-date-time-string/index.md)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  <br><br><br>|
| <a name="com.chrynan.time/TimeFormatter/formatPastDurationRelativeToNow/#kotlin.time.Duration/PointingToDeclaration/"></a>[formatPastDurationRelativeToNow](format-past-duration-relative-to-now.md)| <a name="com.chrynan.time/TimeFormatter/formatPastDurationRelativeToNow/#kotlin.time.Duration/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [formatPastDurationRelativeToNow](format-past-duration-relative-to-now.md)(pastDuration: [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  <br><br><br>|
| <a name="com.chrynan.time/TimeFormatter/formatPastRelativeToNow/#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[formatPastRelativeToNow](format-past-relative-to-now.md)| <a name="com.chrynan.time/TimeFormatter/formatPastRelativeToNow/#com.chrynan.time.DateTimeString/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [formatPastRelativeToNow](format-past-relative-to-now.md)(pastTime: [DateTimeString](../-date-time-string/index.md)): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)  <br><br><br>|

