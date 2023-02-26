package BuchalkaInheritanceChallenge;

public class Vehicle {
    private String brand;
    private String engine;
    private String fuel;
    private int gear;
    private int doors;

    public Vehicle(String brand, String engine, String fuel, int gear, int doors) {
        this.brand = brand;
        this.engine = engine;
        this.fuel = fuel;
        this.gear = gear;
        this.doors = doors;
    }
    public void start(){
        System.out.println("The car is ready to start.");

    }
    public void drive(int gearUp){
        System.out.println("Be careful and watch out whether the car at "+gearUp+ " gear when you start the engine.");

    }

    public void steering(String direction) {
        System.out.println("Please be careful with the passer-byes");


    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }

    public int getGear() {
        return gear;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", gear=" + gear +
                ", doors=" + doors +
                '}';
    }
}
