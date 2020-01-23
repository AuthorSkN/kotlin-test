group = "com.netcracker"
version = "0.0.1"

plugins {
    kotlin("js") version "1.3.61"
}

repositories {
    jcenter()
}

kotlin {
    target {
        browser()
    }

    sourceSets {
        main {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "6.1"
    }
}
