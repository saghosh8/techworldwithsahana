// Automation Scenario - 
// Automate Jenkins Pipeline to trigger at 2 AM

pipeline {
    agent any
    triggers{
        cron ('0 2 * * *')
    }
    stages {
        stage ('Nightly Build') {
            steps {
                //Your Workflow commands/Steps Go Here
            }
        }
    }
}



