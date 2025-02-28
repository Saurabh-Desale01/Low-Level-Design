import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(101, "Thar", 1500.0);
        Car car2 = new Car(102, "Swift", 1200.0);

        User user1 = new User("Bob", 101);
        User user2 = new User("Rob", 102);

        Map<Integer, Car> carInventory = new HashMap<>();
        carInventory.put(car1.getId(), car1);
        carInventory.put(car2.getId(), car2);

        Booking booking = new Booking(101, car1, user1, LocalDate.now(), LocalDate.now().plusDays(3));
        user1.addBooking(booking);

        System.out.println("Car Inventory "+ carInventory);
        System.out.println("Booking Details "+booking);
    }
}