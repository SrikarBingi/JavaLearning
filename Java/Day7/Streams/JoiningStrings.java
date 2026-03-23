package Day7.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Srikar","Veda","Vihaan");
        String result = names.stream().collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
