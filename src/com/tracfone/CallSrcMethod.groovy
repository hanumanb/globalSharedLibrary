package com.tracfone
class CallSrcMethod implements Serializable {

def steps
  CallSrcMethod(steps) {this.steps = steps}
  
  def callSrcMethod(args) {
   
  callSecondMethod()
  }
  
  def callSecondMethod() {
   
   echo "In MavenBuild method"
  }
  
  
}