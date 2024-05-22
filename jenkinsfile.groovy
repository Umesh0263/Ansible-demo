pipeline {
    agent any
    stages {
        stage('pull the source code from git') {
            steps {
               git branch: 'main', url: 'https://github.com/Umesh0263/Ansible-demo.git'
'''
                
            }
        }
        stage('install apache package') {
            steps {
                sh '''sudo apt update
                sudo apt install apache2 -y
                sudo systemctl start apache2
                sudo systemctl enable apache2

'''
            }
        }
        stage('Deploy') {
            steps {
                sh '''sudo cp -r index.html /var/www/html/index.html'''

'''
            }
        }
    }
}
