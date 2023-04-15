package kommander

import kommander.internal.BasicExpectationImpl
import kommander.internal.CollectionExpectationImpl
import kommander.internal.LambdaExpectationImpl

object ExpectBuilders {
    @JvmStatic
    fun <E> expect(value: E): BasicExpectation<E> = BasicExpectationImpl(value)

    @JvmStatic
    fun <E> expect(vararg value: E): CollectionExpectation<E> = CollectionExpectationImpl(value.asList())

    @JvmStatic
    fun <E> expectArray(array: Array<E>) = expect(*array)

    @JvmStatic
    fun <E> expectCollection(collection: Collection<E>): CollectionExpectation<E> = CollectionExpectationImpl(collection)

    @JvmStatic
    fun expectFunction(lambda: Runnable): LambdaExpectation = LambdaExpectationImpl(lambda::run)
}