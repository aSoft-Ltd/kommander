package kommander

import kotlin.test.assertIs

inline fun <reified T:Throwable> ExpectLambda.toFailWith() : T {
    val failed = toFail()
    assertIs<T>(failed)
    return failed
}