plugins {
    `kotlin-dsl`
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
    implementation(libs.springBootPlugin)
    implementation(libs.springDependencyManagementPlugin)
}