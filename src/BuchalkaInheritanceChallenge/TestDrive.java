package BuchalkaInheritanceChallenge;

public class TestDrive {
    public static void main(String[] args) {
        Vehicle firstVehicle = new Vehicle("Mercedes", "3.00", "Diesel", 7, 3);
        Car myCar=new Car("G600",8);
        Cabriolet newCabriolet = new Cabriolet("Fatih", "Esra", myCar, firstVehicle);
        System.out.println(newCabriolet);
        newCabriolet.start();
        newCabriolet.drive(2);
        newCabriolet.steering("Forward");
        firstVehicle.setDoors(7);
        System.out.println("newCabriolet.toString() = " + newCabriolet.toString());
        Cabriolet secondCabriolet=new Cabriolet("Semih","Zülal",new Car("G600",4),firstVehicle);
        System.out.println(secondCabriolet);
        System.out.println("firstVehicle = " + firstVehicle.toString());
        System.out.println("newCabriolet.toString() = " + newCabriolet.toString());


    }
}
