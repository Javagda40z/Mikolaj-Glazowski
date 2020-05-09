package Wyjatki;

import java.io.IOException;

public class test {
    public static void main(String[] args) {

        boolean zmienna = true;


        try {
            metodaRzucajacaCzasowyWyjatek(zmienna);
        } catch (IOException e) {
            System.out.println("uzywam innej metoody");
            metodaBezWyjatku(zmienna);
            zerwijPolaczenieZBaza();
        } finally {
            zerwijPolaczenieZBaza();
        }

        try (Connector connector = new Connector()) {
            metodaRzucajacaCzasowyWyjatek(zmienna);
        } catch (Exception e) {
            System.out.println("poleiał wyjątek, ruszamy z innym kodem");
            metodaBezWyjatku(zmienna);
        }


    }

    private static void zerwijPolaczenieZBaza() {
        System.out.println("PRZERYWAM POLACZENIE!!");
    }

    private static void metodaRzucajacaCzasowyWyjatek(boolean zmienna) throws IOException {
        if (zmienna) {
            throw new IOException();
        }
    }

    private static void metodaBezWyjatku(boolean zmienna) {
        if (zmienna) {
            throw new RuntimeException();
        }
        System.out.println("ok");
    }
}
