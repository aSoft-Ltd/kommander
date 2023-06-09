package expect

import expect.internal.SuspendLambdaExpectationImpl

@Deprecated("use kommander instead")
fun expectLambda(lambda: suspend () -> Unit): SuspendLambdaExpectation = SuspendLambdaExpectationImpl(lambda)

@Deprecated("use kommander instead")
suspend fun expectFailure(lambda: suspend () -> Unit) = expectLambda(lambda).toFail()

@Deprecated("use kommander instead")
suspend inline fun <reified T : Throwable> expectFailureWith(noinline lambda: () -> Unit) = expectLambda(lambda).toFailWith<T>()