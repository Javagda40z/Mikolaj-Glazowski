package ZadankaDomowePartTwo.Obiekty.Figury;

import java.util.Scanner;

public class Kolo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String kolor = scanner.next();
        int promien = scanner.nextInt();
        double pole = 3.14 * (promien * promien);

        System.out.println(kolor + pole);



    }


}
