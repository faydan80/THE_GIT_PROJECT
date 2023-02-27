package Grup_Calismasi_Abstraction;

public class Wolves extends WildAnimals implements LivesOutdoors {
    public String kind;

    public Wolves(int weight, int heigth, String kind) {
        super(weight, heigth);
        this.kind = kind;
    }

    @Override
    public void livesOutdoor() {
        System.out.println("It lives outdoors and hunts everyday");

    }

    @Override
    public void task() {
        System.out.println("It protects its own territory");

    }

    @Override
    public void eatsMeat() {
        System.out.println("it sometimes eat fresh Meat sometimes dead animals");

    }

    @Override
    public void lives() {
        if (kind.equals("Black Wolf")) {
            System.out.println("It lives in big Forests in USA");
        } else if (kind.equals("Grey Wolf")) {
            System.out.println("It lives in steps in Asia and in Europa");
        } else if (kind.equals("Snow Wolf")) {
            System.out.println("It lives in polars");


        } else {
            System.out.println("Please type the specific kind of the Wolf");

        }
    }


    @Override
    public void eat(String eatsWhat) {
        eatsMeat();
    }

    @Override
    public void drink(String drinksWhat) {
        super.drink("Water");
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return super.toString() + "Wolves{" +
                "kind='" + kind + '\'' +
                ", weight=" + weight +
                ", heigth=" + heigth +
                '}';
    }
}
