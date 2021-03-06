/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds
 */

plugins {
    // Apply the java plugin to add support for Java
    java

    // Provide code coverage metrics
    jacoco
}

repositories {
    // Use jcenter for resolving you dependencies.
    jcenter()
}

dependencies {
    // Use JUnit test framework
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.2")
}

jacoco {
    toolVersion = "0.8.4"
    reportsDir = file("$buildDir/reports/jacoco") // gradle default path
}

tasks.test {
    useJUnitPlatform()
}

tasks.jacocoTestReport {
    reports {
        xml.isEnabled = true
        html.isEnabled = false
    }
}