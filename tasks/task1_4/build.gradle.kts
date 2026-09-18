plugins {
    kotlin("jvm") version "2.4.10"
    application
}

kotlin {
    jvmToolchain(25)
}

application {
    mainClass = "MainKt"
    applicationDefaultJvmArgs = listOf("--enable-native-access=ALL-UNNAMED")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.datetime.jvm)
    implementation(libs.mordant)
}
