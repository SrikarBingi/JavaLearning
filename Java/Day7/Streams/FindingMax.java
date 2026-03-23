package Day7.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product{
    String name;
    Double price;
    
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

}

public class FindingMax {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200.00),
            new Product("Phone", 800.00),
            new Product("Tablet", 600.00)
        ); 

        Product maxProduct = products.stream().max(Comparator.comparing(p->p.price)).orElseThrow();
        System.out.println(maxProduct);
    }
}
