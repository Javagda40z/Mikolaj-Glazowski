package ZadankaDomowePartTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkRegex {
    public static void main(String[] args) {
        String allStar = "Somebody once told me the world is gonna roll me, I ain't the sharpest tool in the shed...";
        String numerTelefonu1 = "132456789";
        String numerTelefonu2 = "123-465-789";
        String numerTelefonu3 = "12354.56789";
        String shrek = "Shrek";
        String lordFarquad = "LordFarquadTheTall";

        czyStringSkladaSieZSamychCyfr(numerTelefonu1);
        czyStringSkladaSieZSamychCyfr(allStar);
        usuwanieWszystkichBialychZnakow(allStar);
        czyCiagJestTylkoZLiter(shrek);
        czyCiagJestTylkoZLiter(lordFarquad);
        czyCiagJestZdaniem(allStar);
        czyCiagJestZdaniem(lordFarquad);
        czyLiczbaJestZmiennoprzecinkowa(numerTelefonu1);
        czyLiczbaJestZmiennoprzecinkowa(numerTelefonu3);
        czyLiczbaJestNumeremTelefonu(numerTelefonu1);
        czyLiczbaJestNumeremTelefonu(numerTelefonu2);
        czyLiczbaJestNumeremTelefonu(numerTelefonu3);

    }

    public static void czyStringSkladaSieZSamychCyfr (String ciagZnakowSamychCyfr){
        System.out.println(ciagZnakowSamychCyfr.matches("[0-9]+"));
    }

    public static void usuwanieWszystkichBialychZnakow(String ciagZnakowDoUsunieciaBialych){
        System.out.println(ciagZnakowDoUsunieciaBialych.replaceAll("\\s",""));
    }

    public static void czyCiagJestTylkoZLiter (String ciagZnakowSamychLiter){
        System.out.println(ciagZnakowSamychLiter.matches("[a-zA-Z]{5}"));


    }

    public static void czyCiagJestZdaniem (String ciagZnakowZdania){
        System.out.println(ciagZnakowZdania.matches("^[A-Z0-9]{1}\\w+(\\s\\w+)*[.]$"));
    }

    public static void czyLiczbaJestZmiennoprzecinkowa (String ciagCyfr){
        System.out.println(ciagCyfr.matches("\\d+[.]\\d+"));
    }

    public static void czyLiczbaJestNumeremTelefonu (String ciagCyfrTelefonu){
        System.out.println(ciagCyfrTelefonu.matches("\\d{9}||\\d{3}[-]\\d{3}[-]\\d{3}"));
    }


}
