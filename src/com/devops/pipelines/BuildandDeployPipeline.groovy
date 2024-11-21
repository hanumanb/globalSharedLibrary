#!/usr/bin/groovy
package com.devops.pipelines


import com.devops.gsl.*



void buildDeployPipeline() {
   
    node(buildAgentName) {



    try {
       

        stage('Cleanup') {
        println "Cleanup "
        }

        stage('Checkout') {
           println "checkout"
        }

        stage('validations') {
            println " source ccode validations if any "
        }

      

        stage("Unit Test") {
           
            def unitTestObj = new UnitTests()
            try {
                 unitTestObj.performUnitTests();

             } catch (Exception e) {
              currentBuild.result = "FAILED"
                throw e
            }

        }


        stage('Build') {
          
            stageName = env.STAGE_NAME

            try {
                
                def mavenBuildObj = new MavenBuild()
                mavenBuildObj.mavenBuild()
            } catch (Exception e) {
               

                currentBuild.result = "FAILED"
                throw e
            }

            
        }

 
        stage("Sonar Scan") {
           println " Sonar Scan "
        }


        stage("Quality Gate") {
             println " Quality Gate "
        }


        

        stage('Deploy') {
         
            try { 
                def deployArtifactObj = new DeployArtifact()
                         deployArtifactObj.deployArtifact()
                    
            } catch (Exception e) {
                    currentBuild.result = "FAILED"
                throw e
            }

           
        }

     

        stage('Health Check') {
             println " health check steps  "
        }

           stage('notifications') {
             println "send notificatoins  "
        }

       
    }
}