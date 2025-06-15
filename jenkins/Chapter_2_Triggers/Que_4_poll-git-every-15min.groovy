//🔹 Q4: Scenario - You want Jenkins to check every 15 minutes 
// if there’s any change in the Git repository. 
// If there is, trigger the pipeline. How would you set that up?


pipeline {
    agent any
    triggers {
        pollSCM('H/15 * * * *') //Poll Every 15 Min
    }
    stages {
        stage('Check SCM Changes') {
            steps {
                //WorkFlow Commands
            }
        }
    }
}

