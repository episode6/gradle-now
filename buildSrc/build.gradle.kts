plugins {
  `java-gradle-plugin`
}

gradlePlugin {
  plugins {
    create("ConfigSite") {
      id = "config-site"
      implementationClass = "plugins.ConfigSite"
    }
    create("ConfigJvm") {
      id = "config-jvm"
      implementationClass = "plugins.ConfigJvm"
    }
    create("ConfigKmpAll") {
      id = "config-kmp-all"
      implementationClass = "plugins.ConfigKmpAll"
    }
    create("ConfigKmpAllDeployable") {
      id = "config-kmp-all-deploy"
      implementationClass = "plugins.ConfigKmpAllDeployable"
    }
  }
}
