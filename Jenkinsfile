pipeline {
  agent any
  tools {
    gradle 'default-gradle'
  }
  stages ("test") {
    stage("build") {
      withGradle {
         sh './gradlew build'
      }
    }
    stage("test") {
      steps {
         sh './gradlew tasks'
         sh './gradlew test'
      }
    }
    stage("deploy") {
      steps {
         echo 'deploying application..'
      }
    }
  }
}
