plugins {
    kotlin("js") version "1.8.0"
}

group = "dev.bcmedeiros"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    js {
        binaries.library()
        browser {
            testTask {
                useKarma {
                    useFirefox()
                }
            }
        }
    }
}