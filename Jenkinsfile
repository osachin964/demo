pipeline{
    agent any
    tools{
        maven 'maven 3_9_0'
    }
    stages{
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
