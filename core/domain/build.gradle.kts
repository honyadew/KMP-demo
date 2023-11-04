@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    targets {
        jvm("desktop")
        androidTarget()
    }

    sourceSets{
        val commonMain by getting {
            dependencies {

            }
        }
    }
}


android {
    namespace = "com.honya.domain"
    compileSdk = 34
    defaultConfig {
        minSdk = 29
    }
}

kotlin {
    jvmToolchain(17)
}