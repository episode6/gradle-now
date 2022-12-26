plugins {
  id("config-kmp")
}

kotlin {
  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation(libs.kotlinx.coroutines)
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
