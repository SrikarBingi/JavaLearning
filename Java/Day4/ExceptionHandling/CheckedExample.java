package Day4.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExample {
    //Checked exceptions ocuur during compile time
    //we have to handle mandatorily either with try-catch or throws

    //FileNotFound
    //DB connection
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("demo.txt");
            System.out.println("File opened");
        }
        catch (FileNotFoundException e){ 
            System.out.println("File not found:"+e.getMessage());
        }
    }
}
