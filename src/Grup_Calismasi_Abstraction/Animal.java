package Grup_Calismasi_Abstraction;

public abstract class Animal {

    public abstract void eat();
    public abstract void drink();
    public abstract void move();
    public abstract void sleep();

    @Override
    public String toString() {
        return "Animal{}";
    }
}
