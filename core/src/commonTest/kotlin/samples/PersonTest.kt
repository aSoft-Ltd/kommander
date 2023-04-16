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