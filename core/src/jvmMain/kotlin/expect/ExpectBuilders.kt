package expect

import expect.internal.BasicExpectationImpl
import expect.internal.CollectionExpectationImpl
import expect.internal.LambdaExpectationImpl

@Deprecated("use kommander instead")
object ExpectBuilders {
    @Deprecated("use kommander instead")
    @JvmStatic
    fun <E> expect(value: E): BasicExpectation<E> = BasicExpectationImpl(value)

    @Deprecated("use kommander instead")
    @JvmStatic
    fun <E> expect(vararg value: E): CollectionExpectation<E> = CollectionExpectationImpl(value.asList())

    @Deprecated("use kommander instead")
    @JvmStatic
    fun <E> expectArray(array: Array<E>) = expect(*array)

    @Deprecated("use kommander instead")
    @JvmStatic
    fun <E> expectCollection(collection: Collection<E>): CollectionExpectation<E> = CollectionExpectationImpl(collection)

    @Deprecated("use kommander instead")
    @JvmStatic
    fun expectFunction(lambda: Runnable): LambdaExpectation = LambdaExpectationImpl(lambda::run)
}