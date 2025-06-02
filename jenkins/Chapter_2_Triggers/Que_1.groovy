pipeline {  
    // 👉 This is like saying:
    // “Hey Jenkins, I’m starting a new pipeline!”
    // Everything we write will go inside this block.

    agent any  
    // 👉 This tells Jenkins:
    // “Run this pipeline on any available machine (agent).”
    // No need to choose a specific one. Jenkins will pick what’s free.

    stages {
        // 👉 This means:
        // “Now I’ll write all the steps to do – like build, test, deploy.”
        // You can also add one or more stages inside this.

        stage('Build') {
            // 👉 This is one step or phase of the pipeline.
            // We are giving it a name – 'Build'.
            // You can also have 'Test', 'Deploy', etc.

            steps {
                // 👉 This is where we write the actual commands.
                // Jenkins will run whatever we write inside this block.
                echo 'Building the application...'
                // 👉 This just prints a message on the console.
                // You can replace it with real build commands later.
            }
        }
    }
}
