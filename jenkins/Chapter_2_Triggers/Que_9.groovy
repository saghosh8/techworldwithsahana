// Q9: Advanced Scenario - Trigger Jenkins pipeline 
// only on changes to a specific folder (e.g., /src)

pipeline {
    agent any
    triggers {
        pollSCM('H/30 * * * *')
    }
    stages {
        stage('Build') {
            when {
                changeset "**/src/**"
            }
            steps {
                //Your WorkFlow Commands Go Here
            }
        }
    }
}
