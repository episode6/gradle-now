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
    val jvmMain by getting {
      dependencies {
        api(libs.mockspresso.api)
        implementation(libs.mockspresso.core)
        api(libs.mockspresso.plugins.core)
        api(libs.mockspresso.plugins.junit5)
        api(libs.mockspresso.plugins.mockk)
        api(libs.mockspresso.plugins.dagger2)
        api(libs.mockspresso.plugins.javax.inject)
        api(libs.mockk)
        api(libs.junit5)
      }
    }
    val commonTest by getting {
      dependencies {
        
      }
    }
  }
}
