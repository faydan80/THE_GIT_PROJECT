package BuchalkaInheritanceChallenge;

public class Cabriolet extends Car {
    private String driverName;
    private String passengerName;

    public Cabriolet(String driverName, String passengerName) {
        super("AMG 500", 2);
        this.driverName = driverName;
        this.passengerName = passengerName;
    }

    @Override
    public void start() {
        super.start();
        ;
        System.out.println("The engine has started");
    }

    @Override
    public void drive(int gearUp) {
        super.drive(1);
        super.steering("Forward");
        System.out.println("The driver is drivin in " + gearUp + " gear.");
    }

    @Override
    public void steering(String direction) {

        System.out.println("The diver drives the car " + direction);
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public String toString() {
        super.toString();
        return "Cabriolet{" +
                "driverName='" + driverName + '\'' +
                ", passengerName='" + passengerName + '\'' +
                '}';
    }
}
