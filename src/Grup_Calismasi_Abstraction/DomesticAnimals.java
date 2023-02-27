package Grup_Calismasi_Abstraction;

public abstract class DomesticAnimals extends Animal {

    public int weight;
    public int heigth;

    public DomesticAnimals(int weight, int heigth) {
        this.weight = weight;
        this.heigth = heigth;
    }

    public abstract void lives();
}
