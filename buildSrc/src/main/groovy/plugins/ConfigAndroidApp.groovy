package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

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
    }
  }
}
