@Suppress("DSL_SCOPE_VIOLATION") plugins {
    kotlin("multiplatform")
    id("tz.co.asoft.library")
}

description = "A highly interoperable kotlin multiplatform assertion library"

//group = "tz.co.asoft"
//version = libs.versions.asoft.get()

kotlin {
    jvm {
        withJava()
        library()
    }

    if (Targeting.JS) js(IR) { library() }
    if (Targeting.WASM) wasm { library() }

    val iosTargets = if (Targeting.OSX) iosTargets() else listOf()
    val tvOsTargets = if (Targeting.OSX) tvOsTargets() else listOf()
    val macOsTargets = if (Targeting.OSX) macOsTargets() else listOf()
    val watchOsTargets = if (Targeting.OSX) watchOsTargets() else listOf()
    val osxTargets = iosTargets + tvOsTargets + macOsTargets + watchOsTargets
    val ndkTargets = if (Targeting.NDK) ndkTargets() else listOf()
    val linuxTargets = if (Targeting.LINUX) linuxTargets() else listOf()
    val mingwTargets = if (Targeting.MINGW) mingwTargets() else listOf()

    val nativeTargets = osxTargets + ndkTargets + linuxTargets + mingwTargets

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(kotlin("test"))
            }
        }

        if (Targeting.JVM) {
            val jvmMain by getting {
                dependencies {
                    api(kotlin("test-junit5"))
                }
            }
        }

        val nonJvmMain by creating {
            dependsOn(commonMain)
        }

        val nativeMain by creating {
            dependsOn(nonJvmMain)
        }

        if(Targeting.OSX) {
            val osxMain by creating {
                dependsOn(nativeMain)
            }

            val watchOsMain by creating {
                dependsOn(osxMain)
            }

            nativeTargets.forEach {
                val main by it.compilations.getting {}
                main.defaultSourceSet {
                    dependsOn(nativeMain)
                    if (it in watchOsTargets) dependsOn(watchOsMain)
                    if (it in osxTargets) dependsOn(osxMain)
                }
            }
        }


        if (Targeting.JS) {
            val jsMain by getting {
                dependsOn(nonJvmMain)
            }
        }

        if (Targeting.WASM) {
            val wasmJsMain by getting {
                dependsOn(nonJvmMain)
            }
        }

        nativeTargets.forEach {
            val main by it.compilations.getting {}
            main.defaultSourceSet {
                dependsOn(nativeMain)
            }
        }
    }
}