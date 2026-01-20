plugins {
    kotlin("jvm") version "1.9.22"
    application
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("com.ariane.polytalk.MainKt")
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
