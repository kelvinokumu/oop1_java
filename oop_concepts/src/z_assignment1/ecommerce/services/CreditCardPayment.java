package z_assignment1.ecommerce.services;

import z_assignment1.ecommerce.interfaces.IPayment;

public class CreditCardPayment implements IPayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}
