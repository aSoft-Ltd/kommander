package kommander

/**
 * @param E Expected Type
 *
 * Samples
 *
 */
actual interface Expect<out E> {
    actual val value: E

    actual fun toBeNonNull(message: String)

    actual fun toBeNonNull()

    actual fun toBeNull(message: String)

    actual fun toBeNull()

    actual fun toBe(expected: @UnsafeVariance E, message: String)

    actual fun toBe(expected: @UnsafeVariance E)
}