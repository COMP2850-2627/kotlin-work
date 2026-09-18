plugins {
    kotlin("jvm") version "2.4.10"
    `java-library`
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

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "failed", "skipped")
    }
}
