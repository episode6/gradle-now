plugins {
  id("config-jvm")
}

dependencies {
  api(project(":test-support-kmp"))
  api(libs.mockspresso.api)
  implementation(libs.mockspresso.core)
  api(libs.mockspresso.plugins.junit5)
  api(libs.mockspresso.plugins.mockk)
  api(libs.mockspresso.plugins.dagger2)
  api(libs.mockspresso.plugins.javax.inject)
  api(libs.mockk)
}

