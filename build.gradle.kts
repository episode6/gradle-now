plugins {
  alias(libs.plugins.kmp) apply(false)
  alias(libs.plugins.jvm) apply(false)
  alias(libs.plugins.compose.kmp) apply(false)
  alias(libs.plugins.kotlin.android) apply(false)
  alias(libs.plugins.android.app) apply(false)
  alias(libs.plugins.android.lib) apply(false)

  alias(libs.plugins.dokka)
  id("config-site")
}

description = "Project description goes here"
version = self.versions.name.get()
allprojects {
  group = "com.episode6.gradlenow"
  version = rootProject.version
}

tasks.wrapper {
  gradleVersion = libs.versions.gradle.get()
  distributionType = Wrapper.DistributionType.ALL
}
