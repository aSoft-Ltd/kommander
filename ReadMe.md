# Kommander

A highly interoperable kotlin multiplatform assertion library

![Maven](https://img.shields.io/maven-central/v/tz.co.asoft/Kommander/2.0.13?style=for-the-badge)
![Kotlin](https://img.shields.io/badge/kotlin-multiplatform-blue?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=&logoColor=white)
![Swift](https://img.shields.io/badge/swift-F54A2A?style=for-the-badge&logo=swift&logoColor=white)
![iOS](https://img.shields.io/badge/iOS-000000?style=for-the-badge&logo=ios&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)

## Usage
Simple usage is to just let your commander `expect` something and let your IDE guide you in
prompting what assertion you need to do with your expected assumption


```kotlin
package samples

import kommander.expect
import kommander.toBeGreaterThan
import kommander.toBeLessThan
import kotlin.test.Test

class PersonTest {
    val person = Person(name = "John Doe", age = 30)

    @Test
    fun should_perform_basic_assertions() {
        expect(person.name).toBe("John Doe")
        expect(person.age).toBe(30)
    }

    @Test
    fun should_perform_compound_assertion() {
        expect(person.age) {
            toBe(30)
            toBeLessThan(50)
            toBeGreaterThan(18)
            toBeNonNull()
        }
    }
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

## Nullability
```kotlin
val name: String? = null
expect(name).toBeNull()

val age: Int = 0
expect(age).toBeNonNull()
```

## Custom Assertions
You can create your custom assertions easily in kotlin as well


```kotlin
package samples

import kommander.Expect
import kommander.expect
import kommander.toBeGreaterThan
import kotlin.test.Test

class CustomAssertionsTest {
    val person = Person(name = "Jane", age = 19)

    fun Expect<Person>.toBeAnAdult() {
        expect(value.age).toBeGreaterThan(18)
    }

    @Test
    fun test_adulthood() {
        expect(person).toBeAnAdult()
    }
}
```


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