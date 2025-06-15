// Scenario – You want to run a specific stage in the 
// pipeline when changes are pushed to the main branch. 
// How would you configure this in Jenkins?

pipeline {
    agent any
    stages {
        stage('deploy to prod') {
            when {
                branch 'main'
            }
            steps {
                echo 'Building main branch...'
            }
        }
    }
}
