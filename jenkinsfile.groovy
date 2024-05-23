pipeline {
    agent any

    stages {
        stage('Pull the source code from github') {
            steps {
                sh 'sudo echo "This is first stage"'
            }
        }
        stage('install apache') {
            steps {
               sh '''sudo apt update
               sudo apt install apache2 -y
               sudo systemctl start apache2 
               sudo systemctl enable apache2
               sudo echo "<h1>Welcome To Jenkins Project</h1>" | sudo tee /var/www/html/index.html
               sudo chmod 644 /var/www/html/index.html '''
            }
        }
    }
}
