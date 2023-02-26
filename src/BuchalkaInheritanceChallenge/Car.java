package BuchalkaInheritanceChallenge;

public class Car extends Vehicle{

    private String model;
    private int seats;

    public Car(String model, int seats) {
        super("Mercedes", "2.0", "Diesel", 6, 5);
        this.model = model;
        this.seats = seats;
    }

    @Override
    public void start() {
        super.start();
        super.drive(0);
        super.steering("Forward");
        System.out.println("Please Start the engine.");
    }

    @Override
    public void drive(int gearUp) {

        System.out.println("You can gear up now");
    }

    @Override
    public void steering(String direction) {
        System.out.println("You can drive any direction you want");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        super.toString();
        return "Car{" +
                "model='" + model + '\'' +
                ", seats=" + seats +
                '}';
    }
}
