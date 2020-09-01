# time
A Kotlin multi-platform time library.

This library expands on the experimental Kotlin [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/) by providing a `Moment` class. This class represents an instance on the timeline which may or may not be localized with a `TimeZoneRegionId` and a calculated `TimeOffset` from UTC/GMT time.

**Note:** This library is in the very early stages of development and currently only has implementations for the JVM target.

An early look into the development of this library is discussed in [this article](https://chrynan.codes/its-about-time/) which was featured in Android Weekly issue [#401](https://androidweekly.net/issues/issue-401).
<a href="https://androidweekly.net/issues/issue-401" title="Android Weekly Issue 401">
<img alt="Badge" src="https://androidweekly.net/issues/issue-401/badge" height="20px"></img>
</a>

## Status of the Project
This project is no longer going to be maintained since there's a new [kotlinx-datetime](https://github.com/Kotlin/kotlinx-datetime) library which handles much of this functionality.
Since the kotlinx-datetime library is an official Kotlin extension library, it should be more stable when it is officially released.

## Using the Library
The entry point to getting a `Moment` is through the `TimeProvider` interface. There are different implementations depending on the target platform (ex: JVM) and implementation library used (ex: Java Time).

### TimeProvider
Creating a Java Time instance of the `TimeProvider` interface can be done like so:
```kotlin
val timeProvider = JavaTimeProvider()
```

The `JavaTimeProvider` defaults to using `Locale.getDefault()`, but another `Locale` can be provided. The `Locale` is important for formatting and parsing.
```kotlin
val timeProvider = JavaTimeProvider(locale = Locale.US)
``` 

### TimeZoneOffsetProvider
The `JavaTimeProvider` takes a `TimeZoneOffsetProvider` as a constructor parameter. This defaults to the `JavaTimeZoneOffsetProvider` which delegates to the Java Time library.

The `TimeZoneOffsetProvider` is responsible for retrieving `TimeOffset` from UTC for a particular time and region. The `TimeOffset` is dependent on both time and region due to factors, such as, Daylight Savings Time.

A custom `TimeZoneOffsetProvider` can be provided to the `JavaTimeProvider` constructor.
```kotlin
val timeProvider = JavaTimeProvider(timeZoneOffsetProvider = myTimeZoneOffsetProvider, locale = Locale.US)
```

### Moment
The `Moment` interface represents an instance of time on the timeline with respect to UTC. A `Moment` has a `TimeOffset` (which is zero for UTC) and may contain a `TimeZoneRegionId`. A `TimeProvider` instance is used to retrieve `Moment`s in time.

Retrieve the current `Moment` in time for the default `TimeZoneRegionId`:
```kotlin
timeProvider.now()
``` 

Retrieve the current `Moment` in time for UTC/GMT:
```kotlin
timeProvider.utc()
```

Retrieve a particular `Moment`:
```kotlin
val momentInDefaultRegion = timeProvider.moment(durationSinceTheEpoch = 2_000.days)
val momentInNY = timeProvider.moment(durationSinceTheEpoch = 2_000.days, regionId = TimeZoneRegionId("America/New_York"))
```

Using `TimeProvider` extension functions:
```kotlin
// Moment for the start of the current day
timeProvider.today()

// Moment for the start of the previous day
timeProvider.yesterday()

// Moment for the start of the next day
timeProvider.tomorrow()

// Retrieves the static epoch value at UTC/GMT
timeProvider.epoch()
```

Retrieving a `Duration` between two `Moment`s:
```kotlin
now to tomorrow
```

Retrieving a new `Moment` by adding or subtracting a `Duration`:
```kotlin
val now = timeProvider.now()

val twentyMinutesLater = now + 20.minutes
val oneHourBefore = now - 1.hour
```
