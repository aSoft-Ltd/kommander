plugins {
    kotlin("multiplatform")
    id("tz.co.asoft.library")
}

description = "An extension of kommander-core to ease assertions in a coroutine environment"

kotlin {
    if (Targeting.JVM) jvm { library() }
    if (Targeting.JS) js(IR) { library() }
//    if (Targeting.WASM) wasm { library() }
    if (Targeting.OSX) osxTargets()
    if (Targeting.NDK) ndkTargets()
    if (Targeting.LINUX) linuxTargets()
    if (Targeting.MINGW) mingwTargets()

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(projects.kommanderCore)
                api(kotlinx.coroutines.test)
            }
        }
    }
}