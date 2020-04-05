package ZadankaDomowePartOne;

import java.util.Scanner;

public class Kalkulatooor {
    public static Scanner scanner = new Scanner(System.in);
    public static int drugaPobranaLiczba;
    public static int pierwszaPobranaLiczba;

    public static void main(String[] args) {
        liczby();
        kejsy();
    }

    public static void liczby(){
        System.out.println("Podaj pierwszą liczbę, na której będziemy pracować: ");
        pierwszaPobranaLiczba = scanner.nextInt();
        System.out.println("Podaj drugą liczbę, na której będziemy pracować: ");
        drugaPobranaLiczba = scanner.nextInt();
    }

    public static void kejsy(){
        System.out.println("Wake the fuck up, samurai\n" +
                "1) Dodawanie\n" +
                "2) Odejmowanie\n" +
                "3) Mnożenie\n" +
                "4) Dzielenie\n");
        int wybor = scanner.nextInt();
        switch (wybor){
            case 1:
                System.out.println(dodawanie(pierwszaPobranaLiczba, drugaPobranaLiczba));
                break;
            case 2:
                System.out.println(odejmowanie(pierwszaPobranaLiczba, drugaPobranaLiczba));
                break;
            case 3:
                System.out.println(mnozenie(pierwszaPobranaLiczba, drugaPobranaLiczba));
                break;
            case 4:
                System.out.println(dzielenie(pierwszaPobranaLiczba, drugaPobranaLiczba));
                break;
            default:
                System.out.println("Zły wybór");
        }
    }

    public static int dodawanie (int a,int  b){
        return a+b;
    }

    public static int odejmowanie (int a, int b){
        return a-b;
    }

    public static int mnozenie (int a, int b){
        return a*b;
    }

    public static double dzielenie (double a, double b){
        return a/b;
    }
}
