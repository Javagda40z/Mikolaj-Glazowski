package Wyjatki;

public class Connector implements AutoCloseable {

    private boolean czyJestPolaczenie;

    public Connector(){
        System.out.println("LACZE Z BAZA");
        czyJestPolaczenie = true;
    }

    @Override
    public void close() throws Exception {
        System.out.println("KONCZE LACZYC Z BAZA");
        czyJestPolaczenie = false;
    }
}
