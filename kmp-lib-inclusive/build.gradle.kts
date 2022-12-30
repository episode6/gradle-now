plugins {
  id("config-kmp")
}

kotlin {
  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation(libs.bundles.corestack)
      }
    }
    val commonTest by getting {
      dependencies {
        implementation(project(":test-support"))
      }
    }
  }
}
