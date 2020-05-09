package ZadaniaNaEnumach;

public enum Rozmiar {
    S(69,44), M(73,50), L(76,55), XL(79,59);

    private int dlugosc;
    private int szerokosc;

    Rozmiar(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }


}
