pipeline {
    agent any
    environment
     {
        VERSION = "${BUILD_NUMBER}"
        registry = "madavi/spring"
        registryCredential = 'dockerhub'
        dockerImage = ''
    }
     
    stages {
      stage('checkout') {
           steps {
             
                git branch: 'master', url: 'https://github.com/inspired123/springboot-docker-compose-mysql.git'
             
          }
        }
      stage('Build') { 
            steps {
                sh 'mvn clean package' 
            }
        }  
      stage('Image Build'){
           steps{
               script{
                     dockerImage = docker.build registry + ":$BUILD_NUMBER"
                 }
             }
         }
      stage('Deploy our image') {
          steps{
            script {
              docker.withRegistry( '', registryCredential ) {
              dockerImage.push()
            }
        }
            }
        }
}
} 
