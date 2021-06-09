pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh "mvn clean install"
            }
        }
        stage('Deploy'){
            steps{
              deploy adapters: [tomcat7(credentialsId: '6b6544bc-a64c-4235-90b4-223ad4c0f84b', path: '', url: 'http://ec2-13-233-233-115.ap-south-1.compute.amazonaws.com:8080/')], contextPath: 'javamongopipeline', war: '**/*.war'
            }
        }
    }
}
