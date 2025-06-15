// Q8: Scenario – You want to detect code changes 
// only in the /api folder and trigger a specific API test stage.

pipeline {
    agent any
    triggers {
        pollSCM('H/30 * * * *')
    }
    stages {
        stage('API Test Stage') {
            when {
                changet "api/**"
            }

            steps {
                echo 'API changes detected. Running API tests...'
            }
        }
    }
}
