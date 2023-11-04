import com.android.build.gradle.internal.ide.kmp.KotlinAndroidSourceSetMarker.Companion.android

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.compose)
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    targets {
        jvm("desktop")
        androidTarget()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
                api(compose.ui)
                api(compose.foundation)
                api(compose.material3)
            }
        }
        val androidMain by getting {
            dependencies {
//                api("androidx.activity:activity-compose:1.7.2")
//                api("androidx.appcompat:appcompat:1.6.1")
//                api("androidx.core:core-ktx:1.10.1")
            }
        }
        val desktopMain by getting {
            dependencies {

            }
        }

    }
}

android {
    namespace = "com.honya.kmp_demo"
    compileSdk = 34
    defaultConfig {
        minSdk = 29
    }
}

kotlin {
    jvmToolchain(17)
}
