# Kommander

A highly interoperable kotlin multiplatform assertion library

![Maven](https://img.shields.io/maven-central/v/tz.co.asoft/asoft/2.0.13?style=for-the-badge)
![Kotlin](https://img.shields.io/badge/kotlin-multiplatform-blue?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=&logoColor=white)
![Swift](https://img.shields.io/badge/swift-F54A2A?style=for-the-badge&logo=swift&logoColor=white)
![iOS](https://img.shields.io/badge/iOS-000000?style=for-the-badge&logo=ios&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)

## Samples

```kotlin
expect(1 + 1).toBe(2)
```

```kotlin
expect(2 + 2) {
    toBeEqualTo(4)
    toBeLessThan(5)
    toBeGreaterThan(1)
    toBeNonNull()
    toBe<Int>()
    toBe<Number>()
    toBe<Comparable<*>>()
}
```

## Setup: Gradle

```kotlin
dependencies {
    implementation("tz.co.asoft:kommander-core:2.0.13")
    // - - - - - or - - - - - 
    implementation("tz.co.asoft:kommander-coroutines:2.0.13")
}
```