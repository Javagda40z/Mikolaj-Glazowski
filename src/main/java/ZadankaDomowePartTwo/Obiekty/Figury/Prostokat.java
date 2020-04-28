package ZadankaDomowePartTwo.Obiekty.Figury;

import java.util.Scanner;

public class Prostokat {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String kolor = scanner.next();
        int bok = scanner.nextInt();
        int wysokosc = scanner.nextInt();
        double pole = (bok * wysokosc);

        System.out.println(kolor + pole);


    }


}
