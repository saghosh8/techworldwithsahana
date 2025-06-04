// Automation Scenario - 
// Automate Jenkins Pipeline to trigger at 2 AM

pipeline {
    agent any
    triggers {
        cron ('0 2 * * *')
    }
    stages {
        stage ('Build') {
            steps {
                //Your WorkFlow Commands Here
            }
        }
    }
}


// CRON Syntax (Jenkins)
// ────────────────────────────────────────────
//   0   2   *   *   *
//   │   │   │   │   │
//   │   │   │   │   └──► Day of the week (0-7 or SUN-SAT) → Every day
//   │   │   │   └──────► Month (1-12 or JAN-DEC) → Every month
//   │   │   └──────────► Day of the month (1-31) → Every day
//   │   └──────────────► Hour (0-23) → 2 AM
//   └──────────────────► Minute (0-59) → At minute 0
// ────────────────────────────────────────────
// Example: Runs every day at **2:00 AM**
