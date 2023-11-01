plugins {
    id("java")
    id("me.champeau.jmh") version "0.7.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    jmhImplementation("org.openjdk.jmh:jmh-core:1.35")
    jmhImplementation("org.openjdk.jmh:jmh-generator-annprocess:1.35")
}

tasks.test {
    useJUnitPlatform()
}

jmh {
    warmupIterations = 2
    iterations = 2
    fork = 2
}
