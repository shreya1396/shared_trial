def call(body) {

        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body()

        node {
            // Clean workspace before doing anything
            deleteDir()

            try {
                stage ('Clone') {
                    checkout scm
                }
                stage ('Test') {
                    sh "echo 'Testing ${config.projectName} ...'"
                }
               
            } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
        }
    }
