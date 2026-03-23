package Day6.FunctionaInterface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MathOperations addition=(a,b)->a+b;
        System.out.println("Result:"+addition.operate(2,3));
        addition.show();
        MathOperations.print();
    }
}
