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
        val commonMain by getting {
            dependencies {
                api(projects.kommanderCore)
                api(kotlinx.coroutines.test)
                api(kotlinx.atomicfu)?.because("linuxX64 doesn't compile without it")
            }
        }
    }
}

rootProject.the<NodeJsRootExtension>().apply {
    nodeVersion = npm.versions.node.version.get()
    nodeDownloadBaseUrl = npm.versions.node.url.get()
}

rootProject.tasks.withType<KotlinNpmInstallTask>().configureEach {
    args.add("--ignore-engines")
}

tasks.named("wasmJsTestTestDevelopmentExecutableCompileSync").configure {
    mustRunAfter(tasks.named("jsBrowserTest"))
    mustRunAfter(tasks.named("jsNodeTest"))
}