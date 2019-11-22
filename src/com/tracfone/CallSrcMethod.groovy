package com.tracfone
class CallSrcMethod implements Serializable {

def steps
  CallSrcMethod(steps) {this.steps = steps}
  
  def callSrcMethod(args) {
   println "calling second method"
  callSecondMethod()
  }
  
  def callSecondMethod() {
   
   println "In MavenBuild method"
  }
  
  
}