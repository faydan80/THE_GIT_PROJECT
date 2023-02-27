package Grup_Calismasi_Abstraction;

public class AnimalTest {
    public static void main(String[] args) {
        Dog myDog=new Dog(1,13,"Fluffy",4);
        myDog.setKind("Terrier");
        Dog herDog=new Dog(2,16,"Karabas",4);
        herDog.setKind("Kangal");
        System.out.println("myDog = " + myDog);
        System.out.println(herDog);

        Wolves greyWolf=new Wolves(1,16,"Grey Wolf");
        System.out.println(greyWolf);

        greyWolf.eatsMeat();
        greyWolf.eat();
        greyWolf.drink();
        greyWolf.lives();
        greyWolf.livesOutdoor();
        greyWolf.move();
        greyWolf.task();
        greyWolf.sleep();
        System.out.println("greyWolf.toString() = " + greyWolf.toString());


    }
}
