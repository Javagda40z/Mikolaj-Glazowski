package ZadankaDomowePartTwo.Obiekty;

public class Odcinek extends Punkt {

    public Odcinek(int coorX, int coorY) {
        super(coorX, coorY);
    }

    public static double dlugosc() {
        return Math.sqrt(coorX * coorX + coorY * coorY);
    }

}
