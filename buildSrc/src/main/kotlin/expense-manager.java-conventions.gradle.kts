plugins {
    java
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

group = "org.xmdf"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    maven {
        url = uri("https://artifactory.home.xmdf.live/repository/maven-public/")
        credentials {
            username = property("artifactoyrUser") as String
            password = property("artifactoryPassword") as String
        }
    }
}

dependencies {
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.security:spring-security-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
