plugins {
    //https://github.com/JetBrains/compose-jb/blob/master/VERSIONING.md#kotlin-compatibility
    kotlin("multiplatform") version "1.7.20"
    id("org.jetbrains.compose") version "1.2.1"
}

group = "me.user"
version = "1.0"

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(project(":log"))
                implementation(compose.web.core)
                //implementation(compose.runtime)
            }
        }
    }
}

allprojects {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
