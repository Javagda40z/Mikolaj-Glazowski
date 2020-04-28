package ZadankaDomowePartTwo.Obiekty.Figury;

import java.util.Scanner;

public class Kwadrat {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String kolor = scanner.next();
        int bok = scanner.nextInt();
        double pole = (bok * bok);

        System.out.println(kolor + pole);


    }


}
