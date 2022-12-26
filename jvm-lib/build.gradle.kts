plugins {
  id("config-jvm")
}

dependencies {
  implementation(libs.kotlinx.coroutines)

  testImplementation(project(":test-support-jvm"))
}
