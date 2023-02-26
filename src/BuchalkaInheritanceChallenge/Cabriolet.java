package BuchalkaInheritanceChallenge;

public class Cabriolet extends Car {
    private String driverName;
    private String passengerName;

    public Cabriolet(String driverName, String passengerName, Car newCar, Vehicle newVehicle) {
        super("AMG 500", 2);
        this.driverName = driverName;
        this.passengerName = passengerName;
    }

    public Cabriolet(String model, int seats, String driverName, String passengerName) {
        super(model, seats);
        this.driverName = driverName;
        this.passengerName = passengerName;
    }

    public Cabriolet(String brand, String engine, String fuel, int gear, int doors, String model, int seats, String driverName, String passengerName) {
        super(brand, engine, fuel, gear, doors, model, seats);
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
        return "Cabriolet{" +
                "driverName='" + driverName + '\'' +
                ", passengerName='" + passengerName + '\'' +
                '}';
    }
}
