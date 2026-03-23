package Day7.Streams;

import java.util.Arrays;
import java.util.List;

public class AggregatingData {
    public static void main(String[] args) {
        List<Double> sales = Arrays.asList(1500.0, 200.0, 100.0, 500.0);
        Double sum = sales.stream().reduce(0.0, Double::sum);
        System.out.println(sum);
    }
}
