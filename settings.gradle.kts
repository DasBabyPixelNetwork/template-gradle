enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://reposilite.dasbabypixel.de/dasbabypixel") {
            name = "DasBabyPixel"
            credentials(PasswordCredentials::class)
        }
    }
}
dependencyResolutionManagement {
    versionCatalogs {
        register("pixelsystem") {
            from(files("gradle/pixelsystem.versions.toml"))
        }
    }
}

plugins {
    id("de.dasbabypixel") version "1.10.8"
}

rootProject.name = "GradleTemplate"
