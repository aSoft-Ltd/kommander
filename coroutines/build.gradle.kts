import org.gradle.kotlin.dsl.the


plugins {
    kotlin("multiplatform")
    id("tz.co.asoft.library")
}

description = "An extension of kommander-core to ease assertions in a coroutine environment"

kotlin {
    if (Targeting.JVM) jvm { library() }
    if (Targeting.JS) js(IR) { library() }
    if (Targeting.WASM) wasmJs { library() }
    if (Targeting.OSX) osxTargets()
    if (Targeting.NDK) ndkTargets()
    if (Targeting.LINUX) linuxTargets()
    if (Targeting.MINGW) mingwTargets()

    sourceSets {
        commonMain.dependencies {
            api(projects.kommanderCore)
            api(kotlin("test"))
            api(kotlinx.coroutines.test)
            api(kotlinx.atomicfu)?.because("linuxX64 doesn't compile without it")
        }

        jvmTest.dependencies {
            api(kotlin("test-junit5"))
        }
    }
}



