// Q6: Scenario - 
// Can pollSCM and cron triggers be used together in the same Jenkinsfile?

pipeline {
    agent any
    triggers {
        cron('0 1 * * *') //Once Daily
        pollSCM('H/30 * * * *') //Poll SCM every 30 min
    }
    stages {
        stage('Combined Trigger') {
            steps {
                //WorkFlow Commands
            }
        }
    }
}