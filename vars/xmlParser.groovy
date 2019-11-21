#!/usr/bin/groovy
def call(xmlPath) {
echo "inside Xml parser"
def xmlText = new XmlSlurper().parse(xmlPath)
echo  " node name is ="  xmlText.name()

xmlText.children().each {  echo it.name() }


echo " after xml parser"
    
}