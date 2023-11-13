// def path = new File( "." ).getCanonicalPath()
// def newPath = path.split("var")[0]+"/resources/lib"
// this.class.classLoader.rootLoader.addURL(new URL(newPath+"/edgegrid-signer-core-5.0.0.jar"))

import com.aipeel.jenkins.HelloWorld

def call(String msg = "Hello World"){
    def akcore = libraryResource 'lib/edgegrid-signer-core-5.0.0.jar';
    echo(akcore);
    HelloWorld obj = new HelloWorld(akcore);
    echo("FROM GREET: "+ obj.sayHello(msg));
}