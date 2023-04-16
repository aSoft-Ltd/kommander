package samples

import kommander.expect
import kotlin.test.Test

class BasicSyntax {

    @Test
    fun should_make_simple_arithmetics_assertions() {
        expect(1+1).toBe(2)
    }

}