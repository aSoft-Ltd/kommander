package expect

import kotlin.test.assertIs

@Deprecated("use kommander instead")
suspend inline fun <reified T : Throwable> SuspendLambdaExpectation.toFailWith(): T {
    val failed = toFail()
    assertIs<T>(failed)
    return failed
}