pipeline {
  agent { docker { image 'gradle-openjdk-11-slim' } }
  stages {
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
