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

data class Person(val name: String, val age: Int)

class PersonTest {
    val person = Person("John Doe", 30)

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
You can easily test nullability on your assertions like shown bellow
```kotlin
val name: String? = null
expect(name).toBeNull()

val age: Int = 0
expect(age).toBeNonNull()
```

## Custom Expectations
