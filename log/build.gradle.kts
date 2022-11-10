plugins {
    kotlin("multiplatform") version "1.7.20"
}

kotlin {
    js(IR) {
        nodejs()
        browser()
        useCommonJs()
        binaries.executable()
    }
    sourceSets {
        val commonMain by getting{
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
            }
        }
        val jsMain by getting{
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.6.4")
            }
        }
    }
}