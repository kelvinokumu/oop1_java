package z_assignment1.ecommerce.models;

public class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    public void manageProducts() {
        System.out.println(getName() + " is managing products.");
    }
}
