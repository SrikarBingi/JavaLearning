package Interfaces;
class MathOperations implements Calculator{

    @Override
    public int add(int a, int b) {
        return a+b;
    }
    
}
public class CalculatorApp {
    public static void main(String[] args) {
        // MathOperations math = new MathOperations();
        // System.out.println(math.add(2,3));
        // System.out.println(math.multiply(2, 3));

        //we cannot call static methods of interface
        // System.out.println(math.subtract(3,2));

        //we should call using interface name
        // System.out.println(Calculator.subtract(5, 3));

        Calculator calc = new MathOperations();
        System.out.println(calc.add(2,3));
        System.out.println(calc.multiply(2,3));
        // System.out.println(calc.multiply(2, -3));

        try{
            System.out.println("Multiplication with negative numbers :"+calc.multiply(2, -3));
        }
        catch(IllegalArgumentException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
