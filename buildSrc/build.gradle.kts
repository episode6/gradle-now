plugins {
  `java-gradle-plugin`
}

gradlePlugin {
  plugins {
    create("ConfigureSitePlugin") {
      id = "config-site"
      implementationClass = "plugins.ConfigSitePlugin"
    }
    create("ConfigureJvmPlugin") {
      id = "config-jvm"
      implementationClass = "plugins.ConfigJvmPlugin"
    }
    create("ConfigureMultiPlugin") {
      id = "config-kmp-all"
      implementationClass = "plugins.ConfigMultiPlugin"
    }
    create("ConfigureMultiDeployable") {
      id = "config-kmp-all-deploy"
      implementationClass = "plugins.ConfigMultiDeployablePlugin"
    }
  }
}
