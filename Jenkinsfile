pipeline {
  agent any
  stages withGradle {
    stage("build") {
      steps {
        sh './gradlew clean build'
      }
    }
    stage("test") withGradle {
      steps {
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
