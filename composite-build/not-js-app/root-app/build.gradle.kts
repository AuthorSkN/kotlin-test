group = "com.example"
version = "0.0.1"

plugins {
    kotlin("js") version "1.3.61" apply false
}

allprojects {
    repositories {
        jcenter()
    }
}

subprojects {
    plugins.withType<org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper> {
        dependencies {
            "implementation"(kotlin("stdlib-js"))
        }

        tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile>().configureEach {
            kotlinOptions {
                moduleKind = "commonjs"
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

