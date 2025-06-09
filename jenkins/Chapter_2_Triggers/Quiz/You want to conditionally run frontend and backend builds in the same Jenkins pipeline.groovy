pipeline {
    agent any
    stages {
        stage('Backend Build') {
            when {
                changeset "backend/**/*.java"
            }
            steps {
                echo 'Running Backend Build...'
                // Add your Maven/Gradle build steps here
            }
        }

        stage('Frontend Build') {
            when {
                changeset "frontend/**/*.js"
            }
            steps {
                echo 'Running Frontend Build...'
                // Add your npm/yarn build steps here
            }
        }
    }
}
