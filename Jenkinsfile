pipeline {
  agent any
  tools {
    gradle 'default-gradle'
  }
  stages ("test") {
    stage("build") {
      steps {
         sh 'cd ./medicine-blog-pipeline_test'
         sh './gradlew init'
         sh './gradlew clean build'
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
