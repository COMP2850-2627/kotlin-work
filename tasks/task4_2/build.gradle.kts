plugins {
    kotlin("jvm") version "2.4.10"
    application
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(25)
}

application {
    mainClass = "MainKt"
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
