// How do we run a Jenkins job every weekday at 8 a.m.?

pipeline {
    agent any
    triggers {
        cron('0 8 * * 1-5')
    }
    stages {
        stage('Morning Build') {
            steps {
                echo 'Running weekday 8 AM build...'
                //WorkFlow Commands
            }
        }
    }
}



