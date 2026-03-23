package Day6.FunctionaInterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Greetings greetings = (name)->System.out.println("Hello:"+name);
        greetings.sayHello("Srikar");
    }
}
