package Day7.Streams;

import java.util.*;
import java.util.stream.Collectors;

class Transaction{
    String category;
    double amount;
    
    public Transaction(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction [category=" + category + ", amount=" + amount + "]";
    }

}

public class GroupingData {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("Groceries", 200),
            new Transaction("Electronics", 1500),
            new Transaction("Groceries", 50),
            new Transaction("Clothing", 100)
        );

        Map<String, List<Transaction>> grouped = transactions.stream().collect(Collectors.groupingBy(t->t.category));

        grouped.forEach((category, transactionList)-> {
            System.out.println(category + ": " + transactionList);
        });
        
    }
}
