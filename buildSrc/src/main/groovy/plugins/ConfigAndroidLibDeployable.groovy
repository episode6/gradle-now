package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.maven.MavenPublication

class ConfigAndroidLibDeployable implements Plugin<Project> {
  @Override
  void apply(Project target) {
    target.with {
      plugins.with {
        apply(ConfigAndroidLib)
        apply(CommonDeployable)
      }

      android {
        publishing {
          singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
          }
        }
      }

      afterEvaluate {
        publishing {
          publications {
            release(MavenPublication) {
              from components.release
              Config.Maven.applyPomConfig(target, pom)
            }
          }
        }
      }
    }
  }
}
