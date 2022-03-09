pipeline {
  agent any
  tools {
    gradle 'default-gradle'
  }
  stages ("test") {
    stage("build") {
      steps {
         sh './gradlew build'
      }
    }
    stage("test") {
      steps {
         sh './check'
         sh './gradlew test clean'
      }
    }
    stage("deploy") {
      steps {
         echo 'deploying application..'
      }
    }
  }
}
