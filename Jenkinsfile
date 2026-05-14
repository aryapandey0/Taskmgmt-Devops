pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/aryapandey0/Taskmgmt-Devops.git'
            }
        }

        stage('Build') {
            steps {
                sh 'docker build -t backendapp .'
            }
        }

        stage('Run Containers') {
            steps {
                sh 'docker-compose down'
                sh 'docker-compose up -d --build'
            }
        }
    }
}
