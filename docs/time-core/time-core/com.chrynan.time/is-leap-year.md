//[time-core](../../index.md)/[com.chrynan.time](index.md)/[isLeapYear](is-leap-year.md)

# isLeapYear

[common]\
fun [isLeapYear](is-leap-year.md)(year: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Checks if the year is a leap year, according to the ISO proleptic calendar system rules.

<p>
This method applies the current rules for leap years across the whole time-line.
In general, a year is a leap year if it is divisible by four without
remainder. However, years divisible by 100, are not leap years, with
the exception of years divisible by 400 which are.
<p>
For example, 1904 is a leap year it is divisible by 4.
1900 was not a leap year as it is divisible by 100, however 2000 was a
leap year as it is divisible by 400.
<p>
The calculation is proleptic - applying the same rules into the far future and far past.
This is historically inaccurate, but is correct for the ISO-8601 standard.

#### Return

true if the year is leap, false otherwise
