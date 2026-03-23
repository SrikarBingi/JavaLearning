package Day9;

public class SingletonMain {

    @SuppressWarnings("static-access")
    public static void main(String[] args){
       // SingletonDemo singletonDemo = new SingletonDemo();

        //this is giving me object
        //i need it to create object
        //i can only call it using object
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        System.out.println(singletonDemo.getInstance());
    }
}
