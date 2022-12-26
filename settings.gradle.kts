dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
  versionCatalogs {
    create("libs") { from(files("libs.versions.toml")) }
  }
}

rootProject.name = "redux"

include(
//  ":jvm-lib",
//  ":jvm-lib-deployable",
//  ":android-lib",
//  ":android-lib-deployable",
//  ":android-app",
//  ":kmp-lib-inclusive",
//  ":kmp-lib-inclusive-deployable",
//  ":kmp-lib-exclusive",
//  ":kmp-lib-exclusive-deployable",
//  ":desktop-app",
  ":test-support-kmp",
  ":test-support-jvm",
)
