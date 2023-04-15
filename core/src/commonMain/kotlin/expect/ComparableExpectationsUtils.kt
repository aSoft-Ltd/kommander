package expect

import kotlin.test.assertTrue

@Deprecated("use kommander instead")
fun <T : Comparable<T>> BasicExpectation<T>.toBeGreaterThan(expected: T) = assertTrue(
    """
        
    Expected : $value to be greater than $expected
    =============================
   
    """.trimIndent()
) {
    value > expected
}

@Deprecated("use kommander instead")
fun <T : Comparable<T>> BasicExpectation<T>.toBeGreaterThanOrEqualTo(expected: T) = assertTrue(
    """
        
    Expected : $value to be grater or equal to $expected
    ==============================
   
    """.trimIndent()
) {
    value >= expected
}

@Deprecated("use kommander instead")
fun <T : Comparable<T>> BasicExpectation<T>.toBeLessThan(expected: T) = assertTrue(
    """
        
    Expected : $value to be less than $expected
    =============================
   
    """.trimIndent()
) {
    value < expected
}

@Deprecated("use kommander instead")
fun <T : Comparable<T>> BasicExpectation<T>.toBeLessThanOrEqualTo(expected: T) = assertTrue(
    """
        
    Expected : $value to be less than or equal to $expected
    ==============================
   
    """.trimIndent()
) {
    value <= expected
}