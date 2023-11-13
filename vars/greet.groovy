import com.aipeel.jenkins.HelloWorld

def call(String msg = "Hello World"){
    HelloWorld obj = new HelloWorld();
    echo("FROM GREET: "+ obj.sayHello(msg));
}