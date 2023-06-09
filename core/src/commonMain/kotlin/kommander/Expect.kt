package kommander

/**
 * @param E Expected Type
 *
 * Samples
 *
 */
expect interface Expect<out E> {
    val value: E

    fun toBeNonNull(message: String)

    fun toBeNonNull()

    fun toBeNull(message: String)

    fun toBeNull()

    fun toBe(expected: @UnsafeVariance E, message: String)

    fun toBe(expected: @UnsafeVariance E)
}