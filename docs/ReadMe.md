# Kommander

A highly interoperable kotlin multiplatform assertion library

[badges]

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
    implementation("tz.co.asoft:kommander-core:[version]")
    // - - - - - or - - - - - 
    implementation("tz.co.asoft:kommander-coroutines:[version]")
}
```