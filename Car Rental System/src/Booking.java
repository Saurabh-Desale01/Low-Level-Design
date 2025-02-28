import java.time.LocalDate;

public class Booking {

    private int id;
    private Car car;
    private User user;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalAmount;

    public Booking(int id, Car car, User user, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.car = car;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalAmount = car.getRent() * (endDate.toEpochDay() - startDate.toEpochDay());
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", car=" + car +
                ", user=" + user +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
