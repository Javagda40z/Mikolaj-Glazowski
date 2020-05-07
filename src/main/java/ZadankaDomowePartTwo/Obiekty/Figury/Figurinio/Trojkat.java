package ZadankaDomowePartTwo.Obiekty.Figury.Figurinio;

public class Trojkat extends Figury{
    private double wysokosc;
    private double podstawa;
    private String nazwa = "Trójkąt";
    private String kolor;

    public Trojkat(double wysokosc, double podstawa, String kolor) {
        this.wysokosc = wysokosc;
        this.podstawa = podstawa;
        this.kolor = kolor;
    }

    @Override
    public double polePowierzchni() {
        return 0.5*podstawa*wysokosc;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }
}
