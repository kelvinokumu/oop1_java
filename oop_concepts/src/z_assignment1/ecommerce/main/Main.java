package z_assignment1.ecommerce.main;

import z_assignment1.ecommerce.models.Customer;
import z_assignment1.ecommerce.models.Product;
import z_assignment1.ecommerce.services.CreditCardPayment;
import z_assignment1.ecommerce.services.OrderService;

public class Main {
    public static void main(String[] args) {
        // Create instances
        Customer customer = new Customer("Alice");
        Product product = new Product("Laptop", 1200);

        // Dependency Injection (using CreditCardPayment)
        OrderService orderService = new OrderService(new CreditCardPayment());

        // Place order
        orderService.placeOrder(customer, product);
    }
}
