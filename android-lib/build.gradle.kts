plugins {
  id("config-android-lib")
}

android {
  namespace = "com.episode6.gradlenow.android"
}

dependencies {
  implementation(libs.kotlinx.coroutines)

  testImplementation(project(":test-support-jvm"))
}
