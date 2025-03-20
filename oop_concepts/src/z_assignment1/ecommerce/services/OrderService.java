package z_assignment1.ecommerce.services;

import z_assignment1.ecommerce.interfaces.IPayment;
import z_assignment1.ecommerce.models.Product;
import z_assignment1.ecommerce.models.User;

public class OrderService {
    private final IPayment payment;

    public OrderService(IPayment payment) {
        this.payment = payment;
    }

    public void placeOrder(User user, Product product) {
        System.out.println(user.getName() + " ordered " + product.getName());
        payment.processPayment(product.getPrice());
    }
}
