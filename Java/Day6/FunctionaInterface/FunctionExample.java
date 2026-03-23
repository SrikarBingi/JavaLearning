package Day6.FunctionaInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        //input (Integer) and output (String) types
        Function<Integer,String> intToString = i->"Number:"+i;
        System.out.println(intToString.apply(5));
    }
}
