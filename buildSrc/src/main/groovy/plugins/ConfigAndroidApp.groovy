package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Copy

class ConfigAndroidApp implements Plugin<Project> {
  @Override
  void apply(Project target) {
    target.with {
      plugins.with {
        apply("com.android.application")
        apply(CommonAndroid)
      }
      android {
        defaultConfig {
          versionCode = self.versions.number.get()
          versionName = self.versions.name.get()
        }

        signingConfigs {
          release {
            keyAlias "signing"
            keyPassword findProperty("androidSigningKeyPassword")
            storeFile file("${project.rootProject.rootDir}/keystore.jks")
            storePassword findProperty("androidSigningKeyPassword")
          }
        }

        buildTypes {
          release {
            minifyEnabled = true
            signingConfig signingConfigs.release
          }
        }
      }


      afterEvaluate {
        task("makeReleaseApk", type: Copy, dependsOn: project.tasks.assembleRelease) {
          from("$buildDir/outputs/apk/release/")
          into("$rootProject.buildDir")
          rename("${project.name}-release.apk", "${rootProject.name}-${project.name}-v${project.version}.apk")
        }
      }
    }
  }
}
