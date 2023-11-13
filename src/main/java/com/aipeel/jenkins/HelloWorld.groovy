package com.aipeel.jenkins;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
    Object steps;

    public HelloWorld(Object steps){
        this.steps = steps;
    }

    def String sayHello(){
        return "Hello World from return"
    }
}
