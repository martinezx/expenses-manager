plugins {
    id("expense-manager.java-conventions")
}

version = "0.0.1-SNAPSHOT"

dependencies {
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    implementation("org.springframework.boot:spring-boot-starter-web")
}