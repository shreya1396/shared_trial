def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    
    pipeline {
        agent any
        stages {
            stage('install-maven') {
                steps {
                   sh'''
                   sudo apt-get update
                   sudo apt-get install maven
                   '''
                }
            }
        }
    }
}
