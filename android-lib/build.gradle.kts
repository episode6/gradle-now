plugins {
  id("config-android-lib")
}

android {
  namespace = "com.episode6.gradlenow.android"
}

dependencies {
  implementation(libs.bundles.corestack)

  testImplementation(project(":test-support"))
}
