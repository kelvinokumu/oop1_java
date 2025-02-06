package assignment1.vehicles;

class Bike extends Vehicle {
    Bike(String model, int speed) {
        super(model, speed);
    }

    @Override
    void startEngine() {
        System.out.println(model + " bike engine started!");
    }
}