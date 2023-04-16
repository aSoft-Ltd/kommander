package kommander

import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

inline fun <reified E> Expect<Any?>.toBeInstanceOf(message: String? = null): Expect<E> {
    assertIs<E>(value, message)
    return this as Expect<E>
}

inline fun <reified E> Expect<Any?>.toBe(): E = toBeInstanceOf<E>().value

inline fun <E> Expect<E>.toBeEqualTo(expected: E, message: String? = null) = assertEquals(expected, value, message)

inline fun <T> Expect<T>.toBeUnequalTo(expected: T, message: String? = null) = assertNotEquals(expected, value, message)

inline fun Expect<String?>.toContain(other: String, ignoreCase: Boolean = true) = assertTrue(
    message = "Expected $value to contain $other"
) {
    value?.contains(other, ignoreCase) == true
}