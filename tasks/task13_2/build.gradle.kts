plugins {
    kotlin("jvm") version "2.4.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.kotest.assertions)
    testImplementation(libs.kotest.framework)
    testRuntimeOnly(libs.kotest.runner)
}

kotlin {
    jvmToolchain(25)
}

application {
    mainClass = "MainKt"
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "failed", "skipped")
    }
}
