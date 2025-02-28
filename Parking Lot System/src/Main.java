public class Main {
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(3);

        Vehicle car1 = new Car("MH12AB1234");
        Vehicle car2 = new Car("MH12AB1234");
        Vehicle bike1 = new Bike("MH14XY5678");

        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(bike1);

        //System.out.println("Hello, World!");
    }
}