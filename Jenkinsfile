pipeline {
	agent none
	options {timestamps()}


	stages {
		stage('Check scm') {
			agent any
			steps {
				checkout scm
			}
		}
		stage('Build') {
			agent {
				docker {
					image 'maven:3.6.3'
					args '-u=\"root\"'
				}
			}
			steps {
				echo "Building ProgramTech ${BUILD_NUMBER}"
				sh "mvn clean"
				echo "Build completed"
			}
		}
		stage('Test') {
			agent {
				docker {
					image 'maven:3.6.3'
					args '-u=\"root\"'
				}
			}
			steps {
				sh 'mvn test'
				//sh 'echo cd'

			}
		}
		stage('Docker build') {
			agent any
			steps {
				junit 'target/QueueWithPriorityTest.xml'
				//sh "echo dc"
			}
			post {
				success {
					echo "Application testing successfully completed"
					sh '''docker build -t 428bf8387697/programTech .
					docker login --username=428bf8387697 --password=Adocker2
					docker push 428bf8387697/programTech:latest
					'''
				}
				failure {
					echo "Oooppss!!! Tests failed!"
				}
			}// post
		}// stage Test
	}// stages
}