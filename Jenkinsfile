pipeline {
  agent any
  tools {
    gradle 'default-gradle'
  }
  stages ("test") {
    stage("build") {
      steps {
        sh './gradlew clean build'
      }
    }
    stage("test") {
      steps {
         sh './gradlew test'
      }
      
      post {
        always {
          junit '**/target/surefire-reports/TEST-*.xml'
        }
      }
      
    }
    stage("deploy") {
      steps {
         echo 'deploying application..'
      }
    }
  }
}
