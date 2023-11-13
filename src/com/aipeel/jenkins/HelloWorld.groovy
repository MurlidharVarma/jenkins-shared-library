package com.aipeel.jenkins;

def path = new File( "." ).getCanonicalPath()
def newPath = path.split("src")[0]+"/resources/lib"
this.class.classLoader.rootLoader.addURL(new URL(newPath+"/edgegrid-signer-core-5.0.0.jar"))

// @Grab('com.akamai.edgegrid:edgegrid-signer-core:5.0.0')
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
