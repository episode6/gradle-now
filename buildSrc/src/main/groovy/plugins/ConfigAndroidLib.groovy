package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class ConfigAndroidLib implements Plugin<Project> {
  @Override
  void apply(Project target) {
    target.with {
      plugins.with {
        apply(libs.plugins.android.lib.get().getPluginId())
        apply(CommonAndroid)
      }
    }
  }
}
