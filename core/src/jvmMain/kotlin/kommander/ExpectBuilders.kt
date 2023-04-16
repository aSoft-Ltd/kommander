package kommander

import kommander.internal.ExpectImpl
import kommander.internal.ExpectCollectionImpl
import kommander.internal.ExpectExpectLambda

object ExpectBuilders {
    @JvmStatic
    fun <E> expect(value: E): Expect<E> = ExpectImpl(value)

    @JvmStatic
    fun <E> expect(vararg value: E): ExpectCollection<E> = ExpectCollectionImpl(value.asList())

    @JvmStatic
    fun <E> expectArray(array: Array<E>) = expect(*array)

    @JvmStatic
    fun <E> expectCollection(collection: Collection<E>): ExpectCollection<E> = ExpectCollectionImpl(collection)

    @JvmStatic
    fun expectFunction(lambda: Runnable): ExpectLambda = ExpectExpectLambda(lambda::run)
}