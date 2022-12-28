pluginManagement {
  repositories {
    gradlePluginPortal()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
  }
}
dependencyResolutionManagement {
  repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
  }
  versionCatalogs {
    create("libs") { from(files("libs.versions.toml")) }
    create("self") { from(files("self.versions.toml")) }
  }
}

rootProject.name = "gradle-now"

include(
  ":jvm-lib",
  ":jvm-lib-deployable",
  ":android-lib",
  ":android-lib-deployable",
  ":android-app",
  ":kmp-lib-inclusive",
  ":kmp-lib-inclusive-deployable",
  ":kmp-lib-exclusive",
  ":kmp-lib-exclusive-deployable",
//  ":desktop-app",
  ":test-support-kmp",
  ":test-support-jvm",
)
