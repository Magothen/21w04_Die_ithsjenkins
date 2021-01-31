pipeline {
    agent any
    stages{
        stage('Checkout'){
            steps {
                git 'https://github.com/Magothen/21w04_Die_ithsjenkins.git'
            }
        }
        stage('Build') {
            steps {
                sh "mvn compile"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
            post {
                always {
                    junit '**/TEST*.xml'
                }
            }
        }
    }
}
