description = "Module description goes here."

plugins {
  id("config-jvm-deploy")
}

dependencies {
  implementation(libs.kotlinx.coroutines)

  testImplementation(project(":test-support-jvm"))
}
