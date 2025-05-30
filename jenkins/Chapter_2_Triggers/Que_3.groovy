// Q3: Scenario - You need to run a pipeline every night at 2:00 AM. 
// How would you configure the trigger?

pipeline {
    agent any
    triggers {
        cron('0 2 * * *') //Run Every day at 2AM
    }
    stages {
        stage('Nightly Build') {
            steps{
                echo 'Running Nightly build'
            }
            }
            
        }
}