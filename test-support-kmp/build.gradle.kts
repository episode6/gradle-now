plugins {
  id("config-kmp")
}

kotlin {
  sourceSets {
    val commonMain by getting {
      dependencies {
        api(libs.kotlinx.coroutines)
        api(libs.kotlinx.coroutines.test)
        api(libs.turbine)

        api(libs.assertk)
      }
    }
    val commonTest by getting {
      dependencies {
        
      }
    }
  }
}
