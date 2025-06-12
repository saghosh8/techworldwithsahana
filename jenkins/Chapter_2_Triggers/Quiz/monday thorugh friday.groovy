pipeline {
    agent any

    triggers {
        cron('0 9,17 * * 1-5')
    }

    stages {
        stage('CI/CD Health Checks') {
            steps {
                echo 'Running CI/CD health checks...'
                // Add your health check scripts or commands here
            }
        }
    }
}
