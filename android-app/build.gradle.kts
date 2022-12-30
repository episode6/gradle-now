plugins {
  id("config-android-app")
  id("config-android-compose")
}

android {
  namespace = "com.episode6.gradlenow.app"
}

dependencies {
  implementation(libs.bundles.corestack.android.app)

  testImplementation(project(":test-support"))
}
