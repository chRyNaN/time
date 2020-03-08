[core](../../index.md) / [com.chrynan.time](../index.md) / [TimeZoneRegionId](index.md) / [region](./region.md)

# region

(JVM, COMMON) `val region: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`

Retrieves the region part of the time zone id. For example, for the id "America/Argentina/Buenos_Aires", the
region would be "America/Argentina". For an id of "America/Anchorage", the region would be "America". Note that
not all time zone ids have a region because some may represent a UTC offset. For example, for an id of "-05:00",
null would be returned.

**Author**

