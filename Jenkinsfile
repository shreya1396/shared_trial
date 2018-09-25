@Library("jenkins-shared-library") _
    example {
        projectName = "Project1"
        serverDomain = "Project1 Server Domain"
    }
pipeline {
  agent any
  stages {
    stage('Install') {
      steps {
        echo 'This is install stage'
      }
    }
    stage('Build') {
      steps {
        echo 'This is Build stage'
      }
    }
  }
}
