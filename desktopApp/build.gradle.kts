plugins {
    alias(libs.plugins.compose)
    kotlin("jvm")
    application
}

dependencies{
    implementation(project(":shared"))
    implementation(compose.desktop.currentOs)
}

application {
    mainClass.set("MainKt")
}

compose {
    kotlinCompilerPlugin.set(libs.versions.jbComposeCompiler)
}

kotlin {
    jvmToolchain(17)
}