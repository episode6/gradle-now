plugins {
  id("config-android-app")
  id("config-android-compose")
}

android {
  namespace = "com.episode6.gradlenow.app"
//  defaultConfig {
//    applicationId = namespace
//  }
}

dependencies {
  implementation(libs.kotlinx.coroutines)

  testImplementation(project(":test-support-jvm"))
}
