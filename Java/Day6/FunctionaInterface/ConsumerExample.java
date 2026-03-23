package Day6.FunctionaInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> users = Arrays.asList("Alice", "Bob", "Charlie");

        // Consumer to print user details
        Consumer<String> notifyUser = user -> System.out.println("Notifying " + user);

        // Applying the Consumer to the list
        users.forEach(notifyUser);
    }
}
