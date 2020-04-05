package KlasaAbstrakcyjna;

public class Doge2 extends Animal2 {

    public Doge2(String imie) {
        super(imie);
    }

    @Override
    void makeSound() {
        System.out.println("woof!");
    }

    @Override
    public void move() {
        System.out.println("Dreptam");

    }
}
