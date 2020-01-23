rootProject.name = "root-app"

pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
    }
}

include("view")

includeBuild("../some-service")