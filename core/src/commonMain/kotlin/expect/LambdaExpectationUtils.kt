package expect

import kotlin.test.assertIs

@Deprecated("use kommander instead")
inline fun <reified T:Throwable> LambdaExpectation.toFailWith() : T {
    val failed = toFail()
    assertIs<T>(failed)
    return failed
}