import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingSlots> slots;

    public ParkingLot(int size) {
        slots = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            slots.add(new ParkingSlots("SLOT-" + i));
        }
    }

    public void parkVehicle(Vehicle vehicle) {
        for (ParkingSlots slot : slots) {
            if (!slot.isOccupied()) {
                slot.parkVehicle(vehicle);
                return;
            }
        }
        System.out.println("No available parking slots!");
    }

    public void removeVehicle(String slotId) {
        for (ParkingSlots slot : slots) {
            if (slotId.equals(slotId)) {
                slot.removeVehicle();
                return;
            }
        }
        System.out.println("Invalid slot ID!");
    }
}
