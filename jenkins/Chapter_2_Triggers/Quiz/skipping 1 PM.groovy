pipeline {
    agent any
    triggers {
        cron('0 0-12,14-23 * * *')
    }
    stages {
        stage('Hourly Build') {
            steps {
                echo 'Running hourly build (Skipping 1 PM)...'
            }
        }
    }
}
