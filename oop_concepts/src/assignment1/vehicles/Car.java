package assignment1.vehicles;

class Car extends Vehicle implements ElectricVehicle {
    Car(String model, int speed) {
        super(model, speed);
    }

    @Override
    void startEngine() {
        System.out.println(model + " car engine started!");
    }

    @Override
    public void chargeBattery() {
        System.out.println(model + " car battery is charging...");
    }
}
