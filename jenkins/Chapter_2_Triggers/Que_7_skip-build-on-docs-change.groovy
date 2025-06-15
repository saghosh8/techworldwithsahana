// Q7: Scenario – You want to skip the build if only documentation files 
// (e.g., README.md or .md) are changed.

pipeline {
    agent any
    triggers {
        pollSCM('H/10 * * * *') //Every 10 Min polled
    }
    stages {
        stage('Skips the Docs Files') {
            when {
                not {
                    changeset "**/*.md"
                }
            }
            steps {
                echo 'Non-doc change detected. Proceeding with build...'
            }
        }
    }
}
