// How would you configure Jenkins 
// to build your pipeline // or a particular stage 
// in Jenkins build but only if the last build succeeded?

pipeline {
    agent any
    stages {
        stage('Pre-Check') {
            steps {
                script {
                    if (currentBuild.previousBuild != null 
                    && currentBuild.previousBuild.result != 'SUCCESS') {
                        error ('Previous Build Failed. So skipping...')
                    }                     
                }

            }
        }
        stage('Build') {
            steps {
                echo 'Running build...'
            }
        }
    }
}

