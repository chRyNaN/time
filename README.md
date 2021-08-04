# time

A Kotlin multi-platform time library. <br/>

<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/time">

This library expands on the experimental
Kotlin [Duration](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.time/-duration/)
and [kotlinx.datetime](https://github.com/Kotlin/kotlinx-datetime) library.

An early look into the development of this library is discussed in [this article](https://chrynan.codes/its-about-time/)
which was featured in Android Weekly issue [#401](https://androidweekly.net/issues/issue-401).
<a href="https://androidweekly.net/issues/issue-401" title="Android Weekly Issue 401">
<img alt="Badge" src="https://androidweekly.net/issues/issue-401/badge" height="20px"></img>
</a>

Note that this library has changed focus since [this article](https://chrynan.codes/its-about-time/) was written,
because the [kotlinx.datetime](https://github.com/Kotlin/kotlinx-datetime) library has been introduced since then.

## Using the Library

This library expands on the kotlinx datetime library by providing additional components and utilities, including:

* `UtcMillisSinceEpoch`
* `TimeStamp`
* `TimeProvider`
* `TimeFormatter`

### TimeProvider

A `TimeProvider` extends from `kotlin.time.TimeSource` and `kotlinx.datetime.Clock`. This may
provide additional functionality in the future. A `TimeProvider` can be obtained
via the `TimeProvider` function:

```kotlin
val timeProvider = TimeProvider()
```

### TimeFormatter

The `TimeFormatter` interface provides a way to format time values:

```kotlin
val formatter = TimeFormatter("EEEE, MMM d, yyyy")

formatter.invoke(instant, timeZone)
```

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

The library is provided through [repsy](https://repsy.io). Refer to
the [releases page](https://github.com/chRyNaN/time/releases) for the latest version. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/time">

### Repository

```groovy
repositories {
    maven { url = "https://repo.repsy.io/mvn/chrynan/public" }
}
```

### Dependencies

#### Core

```groovy
implementation "com.chrynan.time:time-core:$VERSION"
```

#### Coroutines

```groovy
implementation "com.chrynan.time:time-coroutines:$VERSION"
```

## Documentation

Refer to the [docs](docs) folder for documentation and more information about the library.

## License

```
Copyright 2021 chRyNaN

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
