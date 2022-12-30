description = "Module description goes here."

plugins {
  id("config-jvm-deploy")
}

dependencies {
  implementation(libs.bundles.corestack)

  testImplementation(project(":test-support"))
}
