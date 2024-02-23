pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/salonisoniii/spe_mini_project.git']])
                sh 'mvn clean install'
            }
        }
         stage('Test') {
            steps {
                // Run your tests
                sh 'mvn test'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t salonisoni/spe_mini_project .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                       sh 'docker login -u salonisoni -p ${dockerhubpwd}'

}
                    sh 'docker push salonisoni/spe_mini_project'
                }
            }
        }
        stage('Run Ansible Playbook') {
                    steps {
                        script {
                            ansiblePlaybook(
                                playbook: 'deploy.yml',
                                inventory: 'inventory'
                             )
                        }
                    }
                }
    }
}