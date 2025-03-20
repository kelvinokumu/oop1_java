package z_assignment1.ecommerce.services;

import z_assignment1.ecommerce.interfaces.IPayment;

public class PayPalPayment implements IPayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
