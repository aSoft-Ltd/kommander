package kommander.internal

import kommander.Expect
import kommander.ExpectLambda

internal class ExpectLambda(
    override val value: () -> Unit
) : ExpectLambda, Expect<() -> Unit> by ExpectImpl(value) {
    override fun toFail(): Throwable {
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


    override fun toPass() {
        var passed = false
        passed = try {
            value()
            true
        } catch (_: Throwable) {
            false
        } finally {
            if (passed) return
            throw AssertionError("Expected lambda to pass, but did not")
        }
    }
}