pipeline {
  agent any
  tools {
    gradle 'default-gradle'
  }
  stages ("test") {
    stage("build") {
      dir('./medicine-blog-pipeline') {
        steps {
          sh './gradlew init'
          sh './gradlew clean build'
        }
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
