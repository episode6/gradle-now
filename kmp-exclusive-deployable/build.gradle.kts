description = "Module description goes here."

plugins {
  id("config-kmp-all-deploy")
}

kotlin {
  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation(libs.kotlinx.coroutines.core)
      }
    }
    val commonTest by getting {
      dependencies {
        implementation(project(":test-support-kmp"))
      }
    }
    val jvmTest by getting {
      dependencies {
        implementation(project(":test-support-jvm"))
      }
    }
  }
}
