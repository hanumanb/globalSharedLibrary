#!/usr/bin/groovy
def call(xmlPath) {
echo "inside Xml parser"
def xmlText = new XmlSlurper().parse(xmlPath)
echo " after xml parser"
    
}