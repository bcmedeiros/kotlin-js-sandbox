plugins {
    kotlin("js") version "1.8.0"
}

group = "dev.bcmedeiros"
version = "1.0-SNAPSHOT"



repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven") // kotlinx-html 0.8.1 only available here for now
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.8.1")
}

kotlin {
    js {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport {

                }
            }
            testTask {
                useKarma {
                    useFirefox()
                }
            }
        }
    }
}