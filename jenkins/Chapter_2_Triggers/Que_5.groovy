// 🔹 Q5: Scenario - A GitHub repository should trigger 
// a Jenkins build as soon as new code is pushed. How would you configure that?

pipeline {
    agent any
    stages {
        stage('Triggered by Webhook') {
            steps {
                echo 'Build triggered by webhook'
            }
        }
    }
}


// Setup Steps:
// 1.	In Jenkins:
//     o	Go to job → Configure → Check "GitHub hook trigger for GITScm polling".
// 2.	In GitHub:
//     o	Go to repo → Settings → Webhooks → Add webhook
//     o	Payload URL: http://<jenkins-host>/github-webhook/
//     o	Content type: application/json
