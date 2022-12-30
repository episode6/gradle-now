plugins {
  id("config-jvm")
}

dependencies {
  implementation(libs.bundles.corestack)

  testImplementation(project(":test-support"))
}
