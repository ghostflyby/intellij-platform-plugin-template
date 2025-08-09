plugins {
    id("repo.intellij-plugin")
}

group = providers.gradleProperty("pluginGroup").get()
version = providers.gradleProperty("pluginVersion").get()

dependencies {
    // Keep test dependencies locally versioned via version catalog
    testImplementation(libs.junit)
    testImplementation(libs.opentest4j)
}
