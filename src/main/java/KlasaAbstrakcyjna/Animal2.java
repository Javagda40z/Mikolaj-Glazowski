package KlasaAbstrakcyjna;

import Obiekty.Movable;

public abstract class Animal2 implements Movable {
    abstract void makeSound();
    private String imie;

    public String getImie() {
        return imie;
    }

    public Animal2(String imie) {
        this.imie = imie;
    }
}
