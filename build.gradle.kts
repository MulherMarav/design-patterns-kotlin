import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

    plugins {
        id("org.springframework.boot") version "3.1.3"
        id("io.spring.dependency-management") version "1.1.3"
        kotlin("jvm") version "1.8.22"
        kotlin("plugin.spring") version "1.8.22"
        kotlin("plugin.jpa") version "1.8.22"
    }

group = "com.mulhermarav"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("io.ktor:ktor-server-core:3.0.0-beta-1")
    implementation("io.ktor:ktor-server-netty:3.0.0-beta-1")

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}