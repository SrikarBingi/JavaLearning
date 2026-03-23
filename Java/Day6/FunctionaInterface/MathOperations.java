package Day6.FunctionaInterface;

@FunctionalInterface
public interface MathOperations {
    int operate(int a, int b);
    default void show(){
        System.out.println("Default method in Functional Interface");
    }
    static void print(){
        System.out.println("Static method in Functional Interface");
    }
}
