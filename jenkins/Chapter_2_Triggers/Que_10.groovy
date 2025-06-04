// Q10: Scenario – Run a Jenkins pipeline every hour 
// but skip execution if it's during the lunch break (1 PM to 2 PM). 

pipeline {
    agent any
    triggers {
        cron('H 0-12,14-23 * * *') // Every hour except 1 PM
    }
    stages {
        stage('Hourly Build') {
            steps {
                echo 'Running hourly build (outside lunch hour)...'
            }
        }
    }
}
