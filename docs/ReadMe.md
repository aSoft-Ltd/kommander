# Kommander

A highly interoperable kotlin multiplatform assertion library

[badges]

## Usage
### 1. Simple assertions
[inject](../core/src/commonTest/kotlin/samples/BasicSyntax.kt)

### 2. Compound assertions
[inject](../core/src/commonTest/kotlin/samples/CompoundSyntax.kt)

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