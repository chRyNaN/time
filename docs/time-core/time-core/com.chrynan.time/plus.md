//[time-core](../../index.md)/[com.chrynan.time](index.md)/[plus](plus.md)

# plus

[common]\
operator fun Month.[plus](plus.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Month

Returns the Month that is the specified number of months after this one.

The calculation rolls around the end of the year from December to January. The specified period may be negative.

[common]\

@[ExperimentalTime](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-experimental-time/index.html)

operator fun [Year](-year/index.md).[plus](plus.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Year](-year/index.md)

Returns the [Year](-year/index.md) that is the specified number of years after this one.
