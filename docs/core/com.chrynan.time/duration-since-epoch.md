[core](../index.md) / [com.chrynan.time](index.md) / [durationSinceEpoch](./duration-since-epoch.md)

# durationSinceEpoch

(JVM, COMMON) `@ExperimentalTime fun `[`TimeProvider`](-time-provider/index.md)`.durationSinceEpoch(): `[`Duration`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/index.html)

A convenience function for obtaining the duration since the epoch by calling [TimeProvider.unix](unix.md) and then
[Moment.durationSinceTheEpoch](-moment/duration-since-the-epoch.md).

**Author**
chRyNaN

