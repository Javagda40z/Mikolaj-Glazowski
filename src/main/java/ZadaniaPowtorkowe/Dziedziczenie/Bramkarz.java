package ZadaniaPowtorkowe.Dziedziczenie;

public class Bramkarz extends Zawodnik implements Sprinter{
    public void bronBramki(){
        System.out.println("Bramka obrobiona");
    }

    @Override
    public void kopnij() {
        System.out.println("Wypok");
    }

    @Override
    public void sprint() {
        System.out.println("sprintuje mało");
    }
}
