package Day7.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelProcessing {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(1, 1000000).boxed().collect(Collectors.toList());

        long sequeantialProcessingStart = System.currentTimeMillis();
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum = "+sum+" calculated by sequatial processing in "+(System.currentTimeMillis()-sequeantialProcessingStart)+" milliseconds");

        long parallelProcessingStart = System.currentTimeMillis();
        sum = numbers.parallelStream() // Use parallelStream for faster processing
            .reduce(0, Integer::sum);
        long parallelProcessingEnd = System.currentTimeMillis();
        System.out.println("Sum = "+sum+" calculated by sequatial processing in "+(parallelProcessingEnd-parallelProcessingStart)+" milliseconds");
    }
}
