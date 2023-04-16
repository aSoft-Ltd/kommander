# Kommander

A highly interoperable kotlin multiplatform assertion library

[badges]

## Usage
Simple usage is to just let your commander `expect` something and let your IDE guide you in
prompting what assertion you need to do with your expected assumption

[inject](../core/src/commonTest/kotlin/samples/PersonTest.kt)

## Setup: Gradle

```kotlin
dependencies {
    implementation("tz.co.asoft:kommander-core:[version]")
    // - - - - - or - - - - - 
    implementation("tz.co.asoft:kommander-coroutines:[version]")
}
```

## Usage
### To be documented
## Nullability
```kotlin
val name: String? = null
expect(name).toBeNull()

val age: Int = 0
expect(age).toBeNonNull()
```