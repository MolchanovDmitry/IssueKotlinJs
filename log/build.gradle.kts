plugins {
    kotlin("multiplatform") version "1.7.10"
}

kotlin {
    js(IR) {
        nodejs()
        browser()
        useCommonJs()
        binaries.executable()
    }
    sourceSets {
        val commonMain by getting
    }
}