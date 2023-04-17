@file:JvmName("Kommander")
@file:JvmSynthetic

package kommander

import kommander.internal.ExpectImpl
import kommander.internal.ExpectCollectionImpl
import kommander.internal.ExpectExpectLambda
import functions.Runnable
import kotlin.jvm.JvmName
import kotlin.jvm.JvmSynthetic

fun <E> expect(value: E): Expect<E> = ExpectImpl(value)

fun <E> expect(vararg value: E): ExpectCollection<E> = ExpectCollectionImpl(value.asList())

fun <E> expectArray(array: Array<E>): ExpectCollection<E> = ExpectCollectionImpl(array.asList())

fun <E> expectCollection(collection: Collection<E>?): ExpectCollection<E> = ExpectCollectionImpl(collection)

fun <E> expect(collection: Collection<E>?): ExpectCollection<E> = ExpectCollectionImpl(collection)

inline fun <E> expect(
    value: E,
    builder: Expect<E>.() -> Unit
): Expect<E> = expect(value).apply(builder)

fun expectFunction(lambda: Runnable): ExpectLambda = ExpectExpectLambda(lambda::run)

inline fun <E> expectMany(
    value: Collection<E>,
    builder: ExpectCollection<E>.() -> Unit
): ExpectCollection<E> = expectCollection(value).apply(builder)