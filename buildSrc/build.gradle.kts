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
    create("ConfigKmp") {
      id = "config-kmp"
      implementationClass = "plugins.ConfigKmp"
    }
    create("ConfigKmpAllDeployable") {
      id = "config-kmp-deploy"
      implementationClass = "plugins.ConfigKmpDeployable"
    }
  }
}
