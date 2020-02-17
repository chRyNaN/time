# time
A Kotlin multi-platform time library.

This library expands on the experimental Kotlin `Duration` in the stdlib by providing a `Moment` class. This class represents an instance on the timeline which may or may not be localized with a `TimeZoneRegionId` and a calculated `TimeOffset` from UTC/GMT time.

**Note:** This library is in the very early stages of development and currently only has implementations for the JVM target.

An early look into the development of this library is discussed in [this article](https://chrynan.codes/its-about-time/) which was featured in Android Weekly issue [#401](https://androidweekly.net/issues/issue-401).
<a href="https://androidweekly.net/issues/issue-401" title="Android Weekly Issue 401">
<img alt="Badge" src="https://androidweekly.net/issues/issue-401/badge" height="20px"></img>
</a>

## Library
The entry point to getting a `Moment` is through the `TimeProvider` interface. There are different implementations depending on the target platform (ex: JVM) and implementation library used (ex: Java Time).

When an instance of the `TimeProvider` is created, `Moment`s can be obtained:
```kotlin
// Moment representing the current time instance
timeProvider.now()

// Moment for 2,000 days after the epoch
timeProvider.moment(durationSinceTheEpoch = 2000.days)

// Moment for the start of the current day
timeProvider.today()

// Moment for the start of the previous day
timeProvider.yesterday()

// Moment for the start of the next day
timeProvider.tomorrow()

// Retrieves the static epoch value at UTC/GMT
timeProvider.epoch()

// Retrieves the current time instance at UTC/GMT
timeProvider.utc()
```

Specific regions can be supplied to get a localized time `Moment`:
```kotlin
// Moment representing the current time instance at the specified region
timeProvider.now(TimeZoneRegionId("America/New_York"))

// Moment for 2,000 days after the epoch at the specified region
timeProvider.moment(durationSinceTheEpoch = 2000.days, regionId = TimeZoneRegionId("America/New_York"))
```