[core](../../index.md) / [com.chrynan.time](../index.md) / [Moment](index.md) / [toUtc](./to-utc.md)

# toUtc

(JVM, COMMON) `abstract fun toUtc(): `[`Moment`](index.md)

Retrieves a new [Moment](index.md) representing the same time as this [Moment](index.md) but in the UTC/GMT region. This is similar
to subtracting the [offsetFromUtc](offset-from-utc.md) from this [Moment](index.md) and updating the [timeZoneRegionId](time-zone-region-id.md) to be
[DefaultTimeZoneRegionId.UTC](../-default-time-zone-region-id/-u-t-c.md).

**Author**
chRyNaN

