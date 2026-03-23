package Day5.Generics;

import java.util.List;

public class GenericsDemo {
    public static <T> void printArray(T[] array){
            for(T element : array){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        // PrintDataInteger printDataInteger = new PrintDataInteger(List.of(1,2,3));
        // System.out.println(printDataInteger.print());
        // PrintDataFloat printDataFloat = new PrintDataFloat(List.of(1.0,2.0,3.0));
        // System.out.println(printDataFloat.print());

        // @SuppressWarnings("rawtypes")
        // PrintData printData = new PrintData(List.of(1,2,3));
        // System.out.println(printData.print());
        
        Integer[] array = {1,2,3};
        printArray(array);

        Double[] arr = {1.0,2.0,3.0};
        printArray(arr);

    }
}
