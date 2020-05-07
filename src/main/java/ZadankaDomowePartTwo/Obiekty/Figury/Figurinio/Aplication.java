package ZadankaDomowePartTwo.Obiekty.Figury.Figurinio;


import java.util.Scanner;

public class Aplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int wybor = scanner.nextInt();
        switch (wybor) {
            case 1:
                double promien = scanner.nextDouble();
                String kolor1 = scanner.next();
                Figury kolo = new Kolo(promien, kolor1);
                System.out.println("Powierzchnia: " + kolo.polePowierzchni() + " figury " + kolo.getNazwa());
                break;
            case 2:
                double bokA = scanner.nextDouble();
                double bokB = scanner.nextDouble();
                String kolor2 = scanner.next();
                Figury prostokat = new Prostokat(bokA, bokB, kolor2);
                System.out.println("Powierzchnia: " + prostokat.polePowierzchni() + " figury " + prostokat.getNazwa());
                break;
            case 3:
                double podstawa = scanner.nextDouble();
                double wysokosc = scanner.nextDouble();
                String kolor3 = scanner.next();
                Figury trojjkat = new Trojkat(wysokosc, podstawa, kolor3);
                System.out.println("Powierzchnia: " + trojjkat.polePowierzchni() + " figury " + trojjkat.getNazwa());
                break;
            default:
                break;
        }


    }
}
