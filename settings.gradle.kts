enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins{
        //TODO maybe I can get version from libs.version.toml
        val kotlinVersion = "1.9.10"
        val composeVersion = "1.5.1"
        val agpVersion = "8.2.0-rc01"

        kotlin("jvm").version(kotlinVersion)
        kotlin("multiplatform").version(kotlinVersion)
        kotlin("android").version(kotlinVersion)
        id("com.android.application").version(agpVersion)
        id("com.android.library").version(agpVersion)
        id("org.jetbrains.compose").version(composeVersion)
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KMP-demo"
include(":androidApp")
include(":shared")
include(":desktopApp")
include(":core:domain")
