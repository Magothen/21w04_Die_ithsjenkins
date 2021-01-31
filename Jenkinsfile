pipeline{
    agent any
    stages{
        stage('Checkout'){
            steps{
                git 'https://github.com/Magothen/21w04_Die_ithsjenkins.git'
            }
        }
        stage('Build'){
            steps{
                sh "mvn compile"  // "bat" for Windows, "sh" for MacOs and Linux
            }
        }
        stage('Test'){
            steps{
                sh "mvn test"
            }
            post{
                always{
                    junit '**/TEST*.xml'
                    emailext attachLog: true, attachmentsPattern: '**/TEST*.xml', body:'',
                    recipientProviders:[culprits()],
                    subject:'$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!'
                }
            }
        }
    }
}
