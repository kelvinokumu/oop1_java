package z_assignment1.ecommerce.services;

import z_assignment1.ecommerce.interfaces.INotification;

public class EmailNotification implements INotification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}
