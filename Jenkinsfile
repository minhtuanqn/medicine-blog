pipeline {
  agent any
  tools {
    gradle 'default-gradle'
  }
  stages ("test") {
    stage("build") {
      steps {
         sh './gradlew build --scan'
      }
    }
    stage("test") {
      steps {
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
