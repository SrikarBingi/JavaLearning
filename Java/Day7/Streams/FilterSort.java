package Day7.Streams;
import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String name;
    Double salary;

    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
}

public class FilterSort {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 70000.00),
            new Employee("Bob", 40000.00),
            new Employee("Charlie", 90000.00),
            new Employee("David", 30000.00)
        );

        List<Employee> highEarners = employees.stream().filter(e->e.salary>50000.00).sorted(Comparator.comparing(e->e.name)).collect(Collectors.toList());
        System.out.println(highEarners);
    }
}
