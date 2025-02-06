package assignment1.vehicles;

abstract class Vehicle {
    String model;
    int speed;

    Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    abstract void startEngine();
}
