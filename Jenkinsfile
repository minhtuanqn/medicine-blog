pipeline {
  agent any
  tools {
    gradle 'default-gradle'
  }
  stages ("test") {
    stage("build") {
      steps {
        sh 'gradle init'
        sh 'gradle build'
      }
    }
    stage("test") {
      steps {
         sh 'gradle test'
      }
    }
    stage("deploy") {
      steps {
         echo 'deploying application..'
      }
    }
  }
}
