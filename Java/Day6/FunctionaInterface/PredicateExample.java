package Day6.FunctionaInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(3000, 4000, 5000, 6000);

        // Predicate to check if salary is greater than 4500
        Predicate<Integer> isHighSalary = salary -> salary > 4500;

        // Filtering the list
        salaries.stream()
                .filter(isHighSalary)
                .forEach(salary -> System.out.println("Eligible Salary: " + salary));
    }
}
