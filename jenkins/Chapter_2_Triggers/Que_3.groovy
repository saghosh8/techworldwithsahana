// Q3: Scenario - You need to run a pipeline every night at 2:00 AM. 
// How would you configure the trigger?

pipeline {
    agent any
    triggers{
        cron('0 2 * * *')
    }
    stages {
        stage('Nightly Build') {
            steps {
                echo "Running Nightly Build"
            }
        }
    }
}


//CRON Syntax

// 0 2 * * *
// | | | | |
// | | | | +----- Day of the week (every day)
// | | | +------- Month (every month)
// | | +--------- Day of the month (every day)
// | +----------- Hour (2 AM)
// +------------- Minute (0 minute)