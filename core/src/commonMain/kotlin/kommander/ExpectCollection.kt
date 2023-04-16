package kommander

/**
 * @param E Expected Type
 *
 * Samples
 *
 */
interface ExpectCollection<out E> : Expect<Collection<E>?> {
    fun toContain(vararg elements: @UnsafeVariance E?)

    fun toNotContain(vararg elements: @UnsafeVariance E?)

    fun toBeEmpty()

    fun toContainElements()

    fun toHave(length: Int)

    fun toBeOfSize(size: Int)
}