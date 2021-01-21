pipeline {
	// agent none
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        } 
    } 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
		  echo 'ddd'
                 sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                sh 'mvn clean test'
                sh 'mvn clean compile test'
            }
            /* post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            } */
        }
	    /*
        stage('Deliver') { 
            steps {
                sh './jenkins/scripts/deliver.sh' 
            } 
        } */
    }
}
