#!/usr/bin/groovy
import com.devops.pipelines.*

def call() {
    if (JOB_NAME.contains("BUILD_DEPLOY") ) {
        println " This is a Build & Deploy Job"

        def bulddeployObj = new BuildandDeployPipeline()
        bulddeployObj.buildDeployPipeline()

    } 
}