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