package expect

@Deprecated("use kommander instead")
external fun <T> require(module: String): T

@Deprecated("use kommander instead")
fun <T> requireFromRootDir(path: String) = require<T>("../../../../../$path")