description = "Module description goes here."

plugins {
  id("config-android-lib-deploy")
}

android {
  namespace = "com.episode6.gradlenow.androiddeploy"
}

dependencies {
  implementation(libs.bundles.corestack)

  testImplementation(project(":test-support"))
}
