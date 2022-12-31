package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test

class CommonAndroid implements Plugin<Project> {

  @Override
  void apply(Project target) {
    target.with {
      plugins.apply(libs.plugins.kotlin.android.get().getPluginId())
      android {
        compileSdk Config.Android.compileSdk

        defaultConfig {
          minSdk Config.Android.minSdk
          targetSdk Config.Android.targetSdk
          vectorDrawables {
            useSupportLibrary true
          }
        }

        compileOptions {
          sourceCompatibility Config.Jvm.sourceCompat
          targetCompatibility Config.Jvm.targetCompat
        }

        kotlinOptions {
          jvmTarget = Config.Jvm.name
          freeCompilerArgs += Config.Kotlin.compilerArgs
        }

        packagingOptions {
          resources {
            excludes += '/META-INF/{AL2.0,LGPL2.1}'
          }
        }
      }

      tasks.withType(Test) {
        testLogging {
          events "passed", "skipped", "failed"
        }
        useJUnitPlatform()
      }
    }
  }
}
