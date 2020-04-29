package ZadankaDomowePartTwo.Obiekty;


public class Rysowanie extends Odcinek {

    public Rysowanie(int coorX, int coorY) {
        super(coorX, coorY);
    }

    public static void main(String[] args) {
        System.out.println(coorX);
        System.out.println(coorY);
        System.out.println(dlugosc());
        System.out.print("|");
        int i = 0;
        while (i < (int) dlugosc()) {
            System.out.print("-");
            i++;
        }
        System.out.print("|");

    }
}
