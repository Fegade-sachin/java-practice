package java8.optionalClass;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

public class OptionalProductCode {
    private static final List<Product> inventory = Arrays.asList(
            new Product("Laptop", 999.99),
            new Product("Smartphone", 599.99),
            new Product("Headphones", 89.99)
    );

    // Stream findFirst() natively returns an Optional!
    public static Optional<Product> findProductByName(String name) {
        return inventory.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public static void main(String[] args) {
        String search1 = "Laptop";
        String search2 = "Spaceship";

        // Scenario A: Product is found
        findProductByName(search1).ifPresent(p ->
                System.out.println(p.getName() + " costs $" + p.getPrice())
        );

        // Scenario B: Product is NOT found, throw a custom exception
        // orElseThrow() is excellent for teaching API/Rest error handling!
        try {
            Product match = findProductByName(search2)
                    .orElseThrow(() -> new IllegalArgumentException("Product not found in inventory!"));
            System.out.println("produce details "+match);
        } catch (Exception e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }
    }
}