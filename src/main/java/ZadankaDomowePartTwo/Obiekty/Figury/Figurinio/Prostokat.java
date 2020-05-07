package ZadankaDomowePartTwo.Obiekty.Figury.Figurinio;

public class Prostokat extends Figury {
    private double bokA;
    private double bokB;
    private String nazwa = "Prostokąt";
    private String kolor;

    public Prostokat(double bokA, double bokB, String kolor2) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.kolor = kolor;

    }

    @Override
    public double polePowierzchni() {
        return bokA * bokB;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }
}
