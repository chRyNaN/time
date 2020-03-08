[core](../../index.md) / [com.chrynan.time](../index.md) / [TimeZoneRegionId](./index.md)

# TimeZoneRegionId

(JVM, COMMON) `inline class TimeZoneRegionId`

A class representing a time zone region identifier, such as "America/Phoenix". Note that this class does not contain
any information about UTC offsets or time. Also, note that no checks are performed to assert a valid input when
constructing an instance of this class.

### Constructors

| Name | Summary |
|---|---|
| (JVM, COMMON) [&lt;init&gt;](-init-.md) | A class representing a time zone region identifier, such as "America/Phoenix". Note that this class does not contain any information about UTC offsets or time. Also, note that no checks are performed to assert a valid input when constructing an instance of this class.`TimeZoneRegionId(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| (JVM, COMMON) [city](city.md) | Retrieves the city part of the time zone id. For example, for the id "America/Argentina/Buenos_Aires", the city would be "Buenos_Aires". For an id of "America/Anchorage", the city would be "Anchorage". Note that the returned value might not be an actual city name. Also note that not all time zone ids have a city because some may represent a UTC offset. For example, for an id of "-5:00", null would be returned.`val city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| (JVM, COMMON) [id](id.md) | The identifier of the time zone. For example, "America/Phoenix".`val id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| (JVM, COMMON) [region](region.md) | Retrieves the region part of the time zone id. For example, for the id "America/Argentina/Buenos_Aires", the region would be "America/Argentina". For an id of "America/Anchorage", the region would be "America". Note that not all time zone ids have a region because some may represent a UTC offset. For example, for an id of "-05:00", null would be returned.`val region: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Extension Functions

| Name | Summary |
|---|---|
| (JVM, COMMON) [toZoneId](../to-zone-id.md) | Converts this [TimeZoneRegionId](./index.md) to a Java Time [ZoneId](https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html).`fun `[`TimeZoneRegionId`](./index.md)`.toZoneId(): `[`ZoneId`](https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html) |
