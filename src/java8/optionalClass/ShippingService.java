package java8.optionalClass;

import java.util.Optional;

class Address {
    private String city; // could be null
    public Address(String city) { this.city = city; }
    public String getCity() { return city; }
}

class Customer {
    private Address address; // could be null
    public Customer(Address address) { this.address = address; }
    public Address getAddress() { return address; }
}

class ShoppingOrder {
    private Customer customer; // could be null
    public ShoppingOrder(Customer customer) { this.customer = customer; }
    public Customer getCustomer() { return customer; }
}

public class ShippingService {
    public static void main(String[] args) {
        // Complete data chain
        ShoppingOrder validOrder = new ShoppingOrder(new Customer(new Address("New York")));

        // Broken data chain (e.g., Guest checkout with no saved profile/address)
        ShoppingOrder guestOrder = new ShoppingOrder(null);

        System.out.println("Shipping 1 to: " + resolveCity(validOrder));
        System.out.println("Shipping 2 to: " + resolveCity(guestOrder));
    }

    public static String resolveCity(ShoppingOrder order) {
        // Instead of writing 3 layers of if-statements, map safely extracts the values.
        // If ANY step in this chain returns null, map safely halts and skips to orElse().
        return Optional.ofNullable(order)
                .map(ShoppingOrder::getCustomer)
                .map(Customer::getAddress)
                .map(Address::getCity)
                .orElse("Standard Distribution Center (Fallback)");
    }
}