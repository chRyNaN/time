//[time-core](../../index.md)/[com.chrynan.time](index.md)/[daysIn](days-in.md)

# daysIn

[common]\
fun Month.[daysIn](days-in.md)(year: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Retrieves the number of days in this month. The provided [year](days-in.md) parameter is used to determine the amount of days in the month of February by determining whether the provided [year](days-in.md) is a leap year or not.

February has 28 days in a standard year and 29 days in a leap year. April, June, September and November have 30 days. All other months have 31 days.
