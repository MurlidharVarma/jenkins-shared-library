#!/usr/bin/env groovy

import com.lesfurets.jenkins.unit.global.lib.Library

@Library('jenkins-shared-library@master') _

import com.aipeel.jenkins.HelloWorld

def execute() {
    node() {
        stage("First") {
            echo "Something"
            greet "Traveller"
        }
        stage("Middle") {
            HelloWorld obj = new HelloWorld();
            echo obj.sayHello("Hello World from Test")
        }
        stage("Last") {
            echo "We're done"
        }
    }
}

return this