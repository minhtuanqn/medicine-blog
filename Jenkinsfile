pipeline {
  agent any
  stages {
    stage("build") {
      steps withGradle {
        sh './gradlew clean build'
      }
    }
    stage("test") {
      steps withGradle {
         sh './gradlew test'
      }
      
      post {
        always {
          junit '**/target/surefire-reports/TEST-*.xml'
        }
      }
      
    }
    stage("deploy") withGradle {
      steps {
         echo 'deploying application..'
      }
    }
  }
}
