pipeline {
  agent any
  tools {
    gradle 'default-gradle'
  }
  stages ("test") {
    stage("build") {
      steps {
        sh './gradlew init'
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
