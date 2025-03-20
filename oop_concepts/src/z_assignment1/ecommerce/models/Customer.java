package z_assignment1.ecommerce.models;

public class Customer extends User {
    public Customer(String name) {
        super(name);
    }

    public void placeOrder() {
        System.out.println(getName() + " placed an order.");
    }
}
