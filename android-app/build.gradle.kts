plugins {
  id("config-android-app")
  id("config-android-compose")
}

android {
  namespace = "com.episode6.gradlenow.app"
}

dependencies {
  implementation(libs.bundles.corestack)

  testImplementation(project(":test-support"))
}
