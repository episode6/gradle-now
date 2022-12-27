plugins {
  alias(libs.plugins.kmp) apply(false)
  alias(libs.plugins.jvm) apply(false)
  alias(libs.plugins.compose.kmp) apply(false)
  alias(libs.plugins.android.app) apply(false)
  alias(libs.plugins.android.lib) apply(false)

  alias(libs.plugins.dokka)
  id("config-site")
}

allprojects {
  group = "com.episode6.gradlenow"
  version = "1.0.0-SNAPSHOT"
}
description = "Project description goes here"

tasks.wrapper {
  gradleVersion = libs.versions.gradle.get()
  distributionType = Wrapper.DistributionType.ALL
}
