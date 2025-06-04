//🔹 Q4: Scenario - You want Jenkins to check every 15 minutes 
// if there’s any change in the Git repository. 
// If there is, trigger the pipeline. How would you set that up?


pipeline {
    agent any
    triggers {
        pollSCM('H/15 * * * *') // Poll every 15 minutes
    }
    stages {
        stage('Check SCM Changes') {
            steps {
                echo 'Polling SCM for changes...'
            }
        }
    }
}


// Syntax

// H/15 * * * *
// |    | | | |
// |    | | | +----- Day of the week (every day)
// |    | | +------- Month (every month)
// |    | +--------- Day of the month (every day)
// |    +----------- Hour (every hour)
// +---------------- Minute (every 15 minutes, with hash-based offset)
