package Day4.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedReal1 {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("dummy.txt");
            BufferedReader reader = new BufferedReader(file);

            String line = reader.readLine();
            while(line!=null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Error while reading file:"+e.getMessage());
        }
    }
}
