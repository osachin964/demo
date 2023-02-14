pipeline{
    agent any
    tools{
        maven 'maven 3_9_0'
    }
    stages{
         stage('Initialize'){
             steps{
                 sh '''
                         echo "PATH = ${PATH}"
                         echo "M2_HOME = ${M2_HOME}"
                    '''     
             }
        }
        stage('Check-Git-Secrets'){
            steps{
                sh 'rm trufflehog || true'
                sh 'docker run gesellix/trufflehog https://github.com/osachin964/demo.git > trufflehog'
                sh 'cat trufflehog'
            }
        }
        stage('maven build'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/osachin964/demo.git']])
                sh 'mvn clean package'
            }
        }
        stage('lint'){
            steps{
                sh 'mvn pmd:check -X'
            }
        }
        stage('tests'){
            steps{
                sh 'mvn clean test --also-make'
            }
        }
    }
}
