package java8.optionalClass;

import java.util.Optional;

class Order {
    private String orderId;
    private double originalPrice;
    private String promoCode; // Can be null if the user has no coupon

    public Order(String orderId, double originalPrice, String promoCode) {
        this.orderId = orderId;
        this.originalPrice = originalPrice;
        this.promoCode = promoCode;
    }

    // Returns an Optional because promo codes are inherently optional
    public Optional<String> getPromoCode() {
        return Optional.ofNullable(promoCode);
    }

    public double getOriginalPrice() { return originalPrice; }
    public String getOrderId() { return orderId; }
}

public class CheckoutSystem {
    public static void main(String[] args) {
        Order order1 = new Order("ORD-5521", 100.0, "SAVE20"); // Coupon used
        Order order2 = new Order("ORD-9942", 100.0, null);     // No coupon used

        processCheckout(order1);
        System.out.println("------------------------------------");
        processCheckout(order2);
    }

    public static void processCheckout(Order order) {
        System.out.println("Processing Checkout for " + order.getOrderId());

        Optional<String> promoOpt = order.getPromoCode();

        // ifPresentOrElse takes two arguments:
        // 1. A Consumer (what to do if value exists)
        // 2. A Runnable (what to do if value is empty)
        promoOpt.ifPresentOrElse(
                code -> {
                    double finalPrice = order.getOriginalPrice() * 0.80; // 20% off
                    System.out.println("Promo code [" + code + "] applied! Final total: $" + finalPrice);
                },
                () -> {
                    System.out.println("No promo code applied. Final total: $" + order.getOriginalPrice());
                }
        );
    }
}