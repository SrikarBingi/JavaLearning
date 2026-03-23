package Day4.ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds!");
        }
        finally{
            System.out.println("Execution finished");
        }
    }
}
