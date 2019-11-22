package com.tracfone
class CallSrcMethod implements Serializable {

def steps
  CallSrcMethod(steps) {this.steps = steps}
  
  def callSrcMethod() {
   
   echo "Inside CallSrcMethod   SRC cacll"
  }
}