# time

A Kotlin multi-platform time library.

This library expands on the experimental
Kotlin [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/)
and [kotlinx.datetime](https://github.com/Kotlin/kotlinx-datetime) library.

An early look into the development of this library is discussed in [this article](https://chrynan.codes/its-about-time/)
which was featured in Android Weekly issue [#401](https://androidweekly.net/issues/issue-401).
<a href="https://androidweekly.net/issues/issue-401" title="Android Weekly Issue 401">
<img alt="Badge" src="https://androidweekly.net/issues/issue-401/badge" height="20px"></img>
</a>

Note that this library has changed focus since [this article](https://chrynan.codes/its-about-time/) was written, since
the [kotlinx.datetime](https://github.com/Kotlin/kotlinx-datetime) library has been introduced since then.

## Using the Library

This library introduces a `DateTimeString` class which is an [ISO-8601](https://en.wikipedia.org/wiki/ISO_8601)
formatted String wrapper. The `DateTimeStringSerializer` class is used to handle serialization/deserialization of
the `DateTimeString` class for [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization). This allows the
use of `DateTimeString` in `@Serializable` models:

### DateTimeString

```kotlin
@Serializable
data class MyModel(
    val created: DateTimeString,
    val updated: DateTimeString
)
```

The `DateTimeString` can be converted to and from a Kotlin `Instant`:

```kotlin
val instant = myModel.created.toInstant()

instant.toDateTimeString()
```

The `Duration` elapsed since the epoch can be obtained from a `DateTimeString`:

```kotlin
val duration = myModel.created.durationSinceEpoch
```

The `Duration` between two `DateTimeStrings` can be obtained using the `durationTo` function:

```kotlin
val duration = myModel.created durationTo myModel.updated
```

The "now" `DateTimeString` can be obtained using the `Clock.nowDateTimeString` function:

```kotlin
val now = Clock.System.nowDateTimeString()
```

On the JVM, Java Time Components can be converted to `DateTimeStrings` and Kotlin `Instants`:

```kotlin
val instant = myDate.toKotlinInstant()
val dateTimeString = myDate.toDateTimeString()
```

### TimeProvider

This library introduces a `TimeProvider` interface which extends from `kotlin.time.TimeSource`
and `kotlinx.datetime.Clock`. This may provide additional functionality in the future. A `TimeProvider` can be obtained
via the `TimeProvider` function:

```kotlin
val timeProvider = TimeProvider()
```

### TimeFormatter

The `TimeFormatter` interface provides functions to convert `DateTimeStrings` to common output time formats:

```kotlin
timeFormatter.formatPastRelativeToNow(timeProvider.nowDateTimeString())
```

`TimeFormatter` implementations are platform specific. Currently, only one for Android exists, `AndroidTimeFormatter`,
which uses the Android `DateUtils` class:

```kotlin
val timeFormatter = AndroidTimeFormatter()
```

**Note:** That this requires the `time-core-android` dependency.

### Coroutines

The `time-coroutines` dependency provides common time based utilities, such as the following:

```kotlin
intervalFlow(period = 30.seconds)

timerFlow(duration = 2.minutes)

scheduleFlow(dateTimeString)

myFlow.timeout(30.seconds)

myFlow.timedValue()

poll(period = 10.seconds) { myFlow }
```

Refer to the `FlowUtils` Kotlin file in the `time-coroutines` package for more information on the functions.

## Building

The library is provided through [Bintray](https://bintray.com/). Refer to
the [releases page](https://github.com/chRyNaN/time/releases) for the latest version.

### Repository

```groovy
repositories {
    maven {
        url = uri("https://dl.bintray.com/chrynan/chrynan")
    }
}
```

### Dependencies

#### Core

```groovy
implementation "com.chrynan.time:time-core:$VERSION"
```

#### Android Core

```groovy
implementation "com.chrynan.time:time-core-android:$VERSION"
```

#### Coroutines

```groovy
implementation "com.chrynan.time:time-coroutines:$VERSION"
```

## License

```
Copyright 2020 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
