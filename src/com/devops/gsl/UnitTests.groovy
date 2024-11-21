#!/usr/bin/groovy
package com.devops.gsl

void performUnitTests() {
     
   sh " mvn clean test"
    
}
