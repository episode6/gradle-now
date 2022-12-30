description = "Module description goes here."

plugins {
  id("config-kmp-deploy")
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
