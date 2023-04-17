# Kommander [version]

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

## Nullability
```kotlin
val name: String? = null
expect(name).toBeNull()

val age: Int = 0
expect(age).toBeNonNull()
```

## Custom Assertions
You can create your custom assertions easily in kotlin as well

[inject](../core/src/commonTest/kotlin/samples/CustomAssertionsTest.kt)

## Support

There are multiple ways you can support this project

### Star It

If you found it useful, just give it a star

### Contribute

You can help by submitting pull request to available open tickets on the issues section

### Report Issues

This makes it easier to catch bugs and offer enhancements required

## Credits

- [andylamax](https://github.com/andylamax) - The author