package samples

import kommander.*
import kotlin.test.Test

class CompoundSyntax {

    @Test
    fun should_make_compound_arithmetics_assertions() {
        expect(2 + 2) {
            toBeEqualTo(4)
            toBeLessThan(5)
            toBeGreaterThan(1)
            toBeNonNull()
            toBe<Int>()
            toBe<Number>()
            toBe<Comparable<*>>()
        }
    }
    
}