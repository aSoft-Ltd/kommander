@file:JvmName("Expect")
@file:JvmSynthetic

package expect

import expect.internal.BasicExpectationImpl
import expect.internal.CollectionExpectationImpl
import expect.internal.LambdaExpectationImpl
import kotlin.jvm.JvmName
import kotlin.jvm.JvmSynthetic

@Deprecated("use kommander instead")
fun <E> expect(value: E): BasicExpectation<E> = BasicExpectationImpl(value)

@Deprecated("use kommander instead")
fun <E> expect(vararg value: E): CollectionExpectation<E> = CollectionExpectationImpl(value.asList())

@Deprecated("use kommander instead")
fun <E> expectArray(array: Array<E>): CollectionExpectation<E> = CollectionExpectationImpl(array.asList())

@Deprecated("use kommander instead")
fun <E> expectCollection(collection: Collection<E>?): CollectionExpectation<E> = CollectionExpectationImpl(collection)

@Deprecated("use kommander instead")
fun <E> expect(collection: Collection<E>?): CollectionExpectation<E> = CollectionExpectationImpl(collection)

@Deprecated("use kommander instead")
inline fun <E> expect(
    value: E,
    builder: BasicExpectation<E>.() -> Unit
): BasicExpectation<E> = expect(value).apply(builder)

@Deprecated("use kommander instead")
fun expectFunction(lambda: ()->Unit): LambdaExpectation = LambdaExpectationImpl(lambda)

@Deprecated("use kommander instead")
inline fun <E> expectMany(
    value: Collection<E>,
    builder: CollectionExpectation<E>.() -> Unit
): CollectionExpectation<E> = expectCollection(value).apply(builder)