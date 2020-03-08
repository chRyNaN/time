[core](../../index.md) / [com.chrynan.time](../index.md) / [TimeZoneRegionId](index.md) / [city](./city.md)

# city

(JVM, COMMON) `val city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`

Retrieves the city part of the time zone id. For example, for the id "America/Argentina/Buenos_Aires", the city
would be "Buenos_Aires". For an id of "America/Anchorage", the city would be "Anchorage". Note that the returned
value might not be an actual city name. Also note that not all time zone ids have a city because some may
represent a UTC offset. For example, for an id of "-5:00", null would be returned.

**Author**
chRyNaN

