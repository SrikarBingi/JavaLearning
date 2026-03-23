package Interfaces;

public interface Calculator {
    int add(int a, int b);

    default int multiply(int a, int b){
        validateInput(a, b);
        return a*b;
    }

    static int subtract(int a, int b){
        validateInput(a, b);
        return a-b;
    }
    
    private static void validateInput(int a, int b){
        if(a<0 || b<0){
            throw new IllegalArgumentException("Inputs must be non-negative");
        }
    }
}
