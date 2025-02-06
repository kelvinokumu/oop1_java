package assignment1.vehicles;

class Truck extends Vehicle {
    Truck(String model, int speed) {
        super(model, speed);
    }

    @Override
    void startEngine() {
        System.out.println(model + " truck engine started!");
    }
}