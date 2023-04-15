package expect

@Deprecated("use kommander instead")
interface LambdaExpectation : BasicExpectation<() -> Unit> {
    fun toFail(): Throwable

    fun toPass()
}