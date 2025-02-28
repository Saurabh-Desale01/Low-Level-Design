import java.util.ArrayList;
import java.util.List;

public class User {


    private int userId;
    private String name;
    private List<Booking> listOfBooking;


    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
        this.listOfBooking = new ArrayList<>();
    }

    public void addBooking(Booking booking){
        listOfBooking.add(booking);
    }

}
