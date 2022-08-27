import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("plugin.jpa") version "1.6.21"
    id("org.springframework.boot") version "2.7.2"
    id("io.spring.dependency-management") version "1.0.12.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}

group = "com.haservi"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // https://mvnrepository.com/artifact/org.springframework.security.oauth/spring-security-oauth2
    implementation("org.springframework.security.oauth:spring-security-oauth2:2.5.2.RELEASE")
    // https://mvnrepository.com/artifact/org.springframework.security/spring-security-oauth2-jose
    implementation("org.springframework.security:spring-security-oauth2-jose:5.7.3")



    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.3")

    // https://mvnrepository.com/artifact/org.springframework.security/spring-security-core
    implementation("org.springframework.security:spring-security-core:5.7.3")
    // https://mvnrepository.com/artifact/org.springframework.security/spring-security-test
    testImplementation("org.springframework.security:spring-security-test:5.7.3")

    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-thymeleaf
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.7.3")

    implementation("com.h2database:h2")
    // https://mvnrepository.com/artifact/com.h2database/h2
    testImplementation("com.h2database:h2:2.1.214")

    // https://mvnrepository.com/artifact/com.fasterxml.jackson.module/jackson-module-kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.3")

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
