description = "Module description goes here."

plugins {
  id("config-android-lib-deploy")
}

android {
  namespace = "com.episode6.gradlenow.androiddeploy"
}

dependencies {
  implementation(libs.kotlinx.coroutines)

  testImplementation(project(":test-support"))
}
