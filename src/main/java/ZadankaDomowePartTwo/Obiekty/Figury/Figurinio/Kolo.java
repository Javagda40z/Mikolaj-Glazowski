package ZadankaDomowePartTwo.Obiekty.Figury.Figurinio;

public class Kolo extends Figury {
    private double promien;
    private String nazwa = "Koło";
    private String kolor;

    public String getKolor(String kolor) {
        return kolor;
    }

    public Kolo(double promien, String kolor) {
        this.promien = promien;
        this.kolor = kolor;
    }

    @Override
    public double polePowierzchni() {
        return 3.14 * promien * promien;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }
}
