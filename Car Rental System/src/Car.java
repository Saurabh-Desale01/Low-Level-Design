public class Car {


    private int id;
    private String model;
    private boolean isAvailable;
    private double rent;

    public Car(int id, String model, double rent) {
        this.id = id;
        this.model = model;
        this.isAvailable = true;
        this.rent = rent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getRent() {
        return rent;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", isAvailable=" + isAvailable +
                ", rent=" + rent +
                '}';
    }
}
