package Grup_Calismasi_Abstraction;

public class Dog extends DomesticAnimals implements LivesOutdoors{

    private String kind;
    private String name;
    private int legs;

    public Dog(int height, int weight,String name, int legs) {
        super(weight, height);
        this.name = name;
        this.legs = legs;
    }

    @Override
    public void eat() {
        System.out.println("It eats chicken bones and dog food ");
    }

    @Override
    public void drink() {
        System.out.println("It drinks water.");

    }

    @Override
    public void move() {
        System.out.println("It runs very fast.");

    }

    @Override
    public void sleep() {
        System.out.println("It sleeps tight");

    }

    @Override
    public void lives() {
        System.out.println("It lives indoors");

    }

    @Override
    public void livesOutdoor() {
        System.out.println("It lives outdoors");

    }

    @Override
    public void task() {
        System.out.println("It protects the farm animals form wild animals");

    }

    @Override
    public void eatsMeat() {
        System.out.println("it eats meat and dangerous");



    }
    public void setKind(String kind){

        if (kind.equals("Labrador")||kind.equals("Golden")||kind.equals("Terrier")) {
            this.kind=kind;
            System.out.println("My dog is a "+ kind + " and its name is"+this.name);
            eat();
            drink();
            move();
            sleep();
            lives();

        }else {
            this.kind=kind;
            System.out.println("My dog is a "+ kind + " and its name is "+this.name);
            livesOutdoor();
            task();
            eatsMeat();
        }

    }
}
