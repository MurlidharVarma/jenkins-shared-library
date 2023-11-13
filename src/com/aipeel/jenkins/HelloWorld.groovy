package com.aipeel.jenkins;

import com.akamai.edgegrid.signer.NullSafeComparator;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{

    def String sayHello(){
        return "Hello World from return";
    }

    def String sayHello(String msg){
        return "FROM HELLOWORLD: "+msg;
    }
}
