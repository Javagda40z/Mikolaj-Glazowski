package ZadankaDomowePartTwo.Obiekty;

public class Odcinek extends Punkt {

    public Odcinek(int coorX, int coorY) {
        super(coorX, coorY);
    }

    public static double dlugosc() {
        int a = coorX;
        int b = coorY;
        return Math.sqrt(a * a + b * b);
    }

}
