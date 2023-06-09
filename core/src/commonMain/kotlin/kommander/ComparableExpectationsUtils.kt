package kommander

import kotlin.test.assertTrue

fun <T : Comparable<T>> Expect<T>.toBeGreaterThan(expected: T) = assertTrue(
    """
        
    Expected : $value to be greater than $expected
    =============================
   
    """.trimIndent()
) {
    value > expected
}

fun <T : Comparable<T>> Expect<T>.toBeGreaterThanOrEqualTo(expected: T) = assertTrue(
    """
        
    Expected : $value to be grater or equal to $expected
    ==============================
   
    """.trimIndent()
) {
    value >= expected
}

fun <T : Comparable<T>> Expect<T>.toBeLessThan(expected: T) = assertTrue(
    """
        
    Expected : $value to be less than $expected
    =============================
   
    """.trimIndent()
) {
    value < expected
}

fun <T : Comparable<T>> Expect<T>.toBeLessThanOrEqualTo(expected: T) = assertTrue(
    """
        
    Expected : $value to be less than or equal to $expected
    ==============================
   
    """.trimIndent()
) {
    value <= expected
}