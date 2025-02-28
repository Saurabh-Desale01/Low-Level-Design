public class ChildVehicles {
}

class Car extends Vehicle {
    public Car(String vehicleNo) {
        super(vehicleNo, "Car");
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNo) {
        super(vehicleNo, "Bike");
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleNo) {
        super(vehicleNo, "Truck");
    }
}
