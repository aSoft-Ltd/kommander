package kommander

interface LambdaExpectation : BasicExpectation<() -> Unit> {
    fun toFail(): Throwable

    fun toPass()
}