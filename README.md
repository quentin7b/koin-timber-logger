Koin Timber Logger
===

![Version 1.0.0](https://img.shields.io/badge/version-1.0.0-green.svg) ![Hosted on Jitpack.io](https://img.shields.io/badge/hosting-jitpack-blue.svg)

_TL;DR A simple logger for [Koin](https://insert-koin.io/) that uses [Timber](https://github.com/JakeWharton/timber)_

## Usage

Use it as the optional `logger` parameter of `startKoin`

For example

```Kotlin
startKoin(
    ...
    logger = TimberLogger()
)
```

## Install

Add it over [jitpack.io](https://jitpack.io/docs/ANDROID/)


In the *project* `build.gradle`

```gradle
allprojects {
    repositories {
        jcenter()
        // Maybe google()
        maven { url "https://jitpack.io" }
    }
}
```

In the *module* `build.gradle`

```gradle
dependencies {
    implementation 'com.github.quentin7b:koin-timber-logger:1.0.0'
}
```

## License

Project is under [Apache 2](LICENSE)
Feel free to improve by opening an issue or a pull request