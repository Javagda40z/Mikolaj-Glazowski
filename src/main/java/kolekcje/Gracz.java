package kolekcje;

public class Gracz implements Comparable<Gracz> {

    private int iloscPunktow;
    private String imie;

    @Override
    public String toString() {
        return "Gracz: " + "imie= " + imie +
                ", ilość punktów= " + iloscPunktow;
    }

    public int getIloscPunktow() {
        return iloscPunktow;
    }

    public void setIloscPunktow(int iloscPunktow) {
        this.iloscPunktow = iloscPunktow;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Gracz(int iloscPunktow, String imie) {
        this.iloscPunktow = iloscPunktow;
        this.imie = imie;
    }

    @Override
    public int compareTo(Gracz innyGracz) {
        return this.iloscPunktow - innyGracz.iloscPunktow;
    }
}
