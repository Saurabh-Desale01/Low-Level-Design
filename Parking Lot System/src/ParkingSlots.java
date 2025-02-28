public class ParkingSlots {

    private String slotId;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSlots(String slotId) {
        this.slotId = slotId;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (!isOccupied) {
            this.vehicle = vehicle;
            this.isOccupied = true;
            System.out.println(vehicle.getType() + " parked in slot " + slotId);
        } else {
            System.out.println("Slot already occupied!");
        }
    }

    public void removeVehicle() {
        if (isOccupied) {
            System.out.println(vehicle.getType() + " with vehicle number " + vehicle.getVehicleNo() + " removed from slot " + slotId);
            this.vehicle = null;
            this.isOccupied = false;
        } else {
            System.out.println("Slot is already empty!");
        }
    }
}
