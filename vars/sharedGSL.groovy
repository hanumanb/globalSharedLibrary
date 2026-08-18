#!/usr/bin/groovy
 

def call() {
 node{
    sh """
pwd 
ls -lrt
    """
 }
}
