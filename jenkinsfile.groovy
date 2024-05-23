pipeline {
    agent any

    stages {
        stage('Pull the source code from github') {
            steps {
                git branch: 'main', url: 'https://github.com/Umesh0263/Ansible-demo.git'
            }
        }
        stage('install apache') {
            steps {
                sh '''sudo apt update
                sudo apt install apache2 -y
                sudo systemctl start apache2 
                sudo systemctl enable apache2
                sudo cp -r index.html /var/www/html/index.html
                sudo chmod 644 /var/www/html/index.html'''
            }
        }
    }
}
