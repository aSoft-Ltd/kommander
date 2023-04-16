package kommander

interface ExpectLambda : Expect<() -> Unit> {
    fun toFail(): Throwable

    fun toPass()
}