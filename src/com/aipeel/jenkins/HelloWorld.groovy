package com.aipeel.jenkins;


// @Grab('com.akamai.edgegrid:edgegrid-signer-core:5.0.0')
// import com.akamai.edgegrid.signer.NullSafeComparator;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{

    Object akcore;

    public HelloWorld(Object akcore){
        this.akcore = akcore
    }

    def String sayHello(){
        echo this.akcore
        this.akcore.NullSafeComparator.new();
        return "Hello World from return";
    }

    def String sayHello(String msg){
        echo this.akcore
        this.akcore.NullSafeComparator.new();
        return "FROM HELLOWORLD: "+msg;
    }
}
