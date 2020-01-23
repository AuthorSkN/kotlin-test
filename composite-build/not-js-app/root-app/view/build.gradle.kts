plugins {
    kotlin("js")
}

kotlin {
    target {
        browser()
    }

    sourceSets {
        main {
            dependencies {
                implementation("com.netcracker:some-service:0.0.1")
            }
        }
    }
}
