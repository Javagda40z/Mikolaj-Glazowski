package ZadaniaPowtorkowe.Dziedziczenie;

public class Pilkarz extends Zawodnik implements Sprinter {

    public void strzelBramke(){
        System.out.println("Bramka strzelona");
    }

    @Override
    public void kopnij() {
        System.out.println("kopnij motzno");
    }

    @Override
    public void sprint() {
        System.out.println("Lubiem biegać szypko");
    }
}
