package expect

@Deprecated("use kommander instead")
interface SuspendLambdaExpectation : BasicExpectation<suspend () -> Unit> {
    @Deprecated("use kommander instead")
    suspend fun toFail(): Throwable {
        var throwable: Throwable? = null
        try {
            value()
        } catch (cause: Throwable) {
            throwable = cause
        } finally {
            if (throwable != null) return throwable
            throw AssertionError("Expected lambda to fail, but did not")
        }
    }

    @Deprecated("use kommander instead")
    suspend fun toPass() {
        var passed = false
        try {
            value()
            passed = true
        } catch (_: Throwable) {
            passed = false
        } finally {
            if (passed) return
            throw AssertionError("Expected lambda to pass, but did not")
        }
    }
}