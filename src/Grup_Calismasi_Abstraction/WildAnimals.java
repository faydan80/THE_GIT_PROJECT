package Grup_Calismasi_Abstraction;

public abstract class WildAnimals extends Animal{
    public int weight;
    public int heigth;

    public WildAnimals(int weight, int heigth) {
        this.weight = weight;
        this.heigth = heigth;
    }
    public abstract void lives();

    @Override
    public void eat(String eatsWhat) {

    }

    @Override
    public void drink(String drinksWhat) {

    }

    @Override
    public void move() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public String toString() {
        return super.toString()+"Domestic Animal";
    }

}
