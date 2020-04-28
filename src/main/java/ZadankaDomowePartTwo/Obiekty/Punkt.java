package ZadankaDomowePartTwo.Obiekty;


import java.util.Random;

public class Punkt {
    static Random random = new Random();
    static int coorX = random.nextInt(20);
    static int coorY = random.nextInt(20);

    public Punkt(int coorX, int coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }


}
