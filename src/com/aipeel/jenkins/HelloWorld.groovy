package com.aipeel.jenkins;


// @Grab('com.akamai.edgegrid:edgegrid-signer-core:5.0.0')
// import com.akamai.edgegrid.signer.NullSafeComparator;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{

    def String sayHello(){
        echo akcore
        akcore.NullSafeComparator.new();
        return "Hello World from return";
    }

    def String sayHello(String msg){
        return "FROM HELLOWORLD: "+msg;
    }
}
