pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                sh 'mvn -DskipTests clean install'
            }
        }
        stage("Test"){
            steps{
                sh 'mvn test'
            }
        }
    }
}
