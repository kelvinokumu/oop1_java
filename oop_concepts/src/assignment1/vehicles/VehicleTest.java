package assignment1.vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 120);
        Bike bike = new Bike("Yamaha", 80);
        Truck truck = new Truck("Volvo", 100);

        car.startEngine();
        bike.startEngine();
        truck.startEngine();

        car.chargeBattery();
    }
}
