pipeline {
    agent any
    stages {
        stage('Clone stage') {
            steps {
                git credentialsId: 'cicd-demo', url: 'https://gitlab.com/Ducna871159/cicd-demo.git'
            }
        }
        stage('Clone docker') {
            steps {
                withDockerRegistry(credentialsId: 'docker-hub-1', url: 'https://index.docker.io/v1/') {
                    sh 'docker build -t duc871159/cicd-demo:v2 .'
                    sh 'docker push duc871159/cicd-demo:v2'
                }
            }
        }
    }
}