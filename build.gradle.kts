import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"
repositories {
    // Add the Firebase Admin SDK repository
    mavenCentral()
    maven {
        url = uri("https://firebase.google.com/download/admin-sdk/maven")
    }
}


dependencies {
    testImplementation(kotlin("test"))
    implementation ("com.google.firebase:firebase-admin-kotlin:1.7.0")
    implementation ("com.google.firebase:firebase-admin:8.2.0")

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}