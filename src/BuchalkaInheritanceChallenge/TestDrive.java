package BuchalkaInheritanceChallenge;

public class TestDrive {
    public static void main(String[] args) {
        Vehicle newVehicle = new Vehicle("Mercedes", "3.00", "Diesel", 7, 3);
        Cabriolet newCabriolet = new Cabriolet("Fatih", "Esra");
        newCabriolet.start();
        newCabriolet.drive(2);
        newCabriolet.steering("Forward");
        newVehicle.setDoors(7);
        System.out.println("newCabriolet.toString() = " + newCabriolet.toString());


    }
}
