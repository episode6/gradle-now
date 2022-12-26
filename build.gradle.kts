plugins {
  alias(libs.plugins.kmp) apply (false)
  alias(libs.plugins.dokka)
  alias(libs.plugins.compose.kmp) apply (false)
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
