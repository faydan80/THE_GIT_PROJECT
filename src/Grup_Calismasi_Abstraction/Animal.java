package Grup_Calismasi_Abstraction;

public abstract class Animal {

    public abstract void eat(String eatsWhat);
    public abstract void drink(String drinksWhat);
    public abstract void move();
    public abstract void sleep();

    @Override
    public String toString() {
        return "Animal{}";
    }
}
