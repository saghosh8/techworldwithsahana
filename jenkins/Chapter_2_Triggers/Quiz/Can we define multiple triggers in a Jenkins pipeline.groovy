// 🔹 Q6: Can pollSCM and cron triggers be used together in the same Jenkinsfile?
//As a DevOps engineer, you are given a scenario to automate
//your pipeline to run every 30 minutes when there are changes, 
//and also run the job at 3 a.m. every day, with or without changes. 

pipeline {
    agent any
    trigger {
        cron('0 3 * * *')
        pollSCM('H/30 * * * *')
    }
    stages {
        stage('Combined Trigger') {
            steps {
                //WorkFlow Commands Starts Here
            }
        }
    }
}
