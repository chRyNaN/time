[core](../../index.md) / [com.chrynan.time](../index.md) / [Year](./index.md)

# Year

(JVM, COMMON) `inline class Year`

Represents a Calendar Year. This is an inline class wrapper around a numerical representation of a year. A negative
value denotes a year within the Before Common Era period. A value of zero is not a valid year with respect to the
Common Era but can be used if using with a different calendar era. Note that this is not a duration, this does not
represent an amount of years, but rather, represents an exact year within a calendar.

**Author**
chRyNaN

### Constructors

| Name | Summary |
|---|---|
| (JVM, COMMON) [&lt;init&gt;](-init-.md) | Represents a Calendar Year. This is an inline class wrapper around a numerical representation of a year. A negative value denotes a year within the Before Common Era period. A value of zero is not a valid year with respect to the Common Era but can be used if using with a different calendar era. Note that this is not a duration, this does not represent an amount of years, but rather, represents an exact year within a calendar.`Year(value: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [isAD](is-a-d.md) | Determines whether this [Year](./index.md) is within the Anno Domini Era, or any year equal to one or greater. This is equivalent to [isCE](is-c-e.md). Both properties are provided for convenience for usage depending on locality and personal preference.`val isAD: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isBC](is-b-c.md) | Determines whether this [Year](./index.md) is within the Before Christ Era, or any year less than zero. This is equivalent to [isBCE](is-b-c-e.md). Both properties are provided for convenience for usage depending on locality and personal preference.`val isBC: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isBCE](is-b-c-e.md) | Determines whether this [Year](./index.md) is within the Before Common Era, or any year less than zero. This is equivalent to [isBC](is-b-c.md). Both properties are provided for convenience for usage depending on locality and personal preference.`val isBCE: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isCE](is-c-e.md) | Determines whether this [Year](./index.md) is within the Common Era, or any year equal to one or greater. This is equivalent to [isAD](is-a-d.md). Both properties are provided for convenience for usage depending on locality and personal preference.`val isCE: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isGregorianLeapYear](is-gregorian-leap-year.md) | Determines whether this [Year](./index.md) is a leap year according to the Gregorian Calendar. According to this system, the average year is about 365.2425 days long and spaces leap years every four years. The rules for determining this value are:`val isGregorianLeapYear: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [isValidGregorianYear](is-valid-gregorian-year.md) | Determines whether this [Year](./index.md) is a valid year in the Gregorian Calendar according to the Common Era years notation. For instance, the year 1 BCE is immediately followed by the year 1 CE. This means there is no year with a value of zero. So this condition determines if the year is not zero.`val isValidGregorianYear: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM, COMMON) [value](value.md) | `val value: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
