package ZadankaDomowePartOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArytmetycznyCiag {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int wyrazPierwszy = scanner.nextInt();
        int dlugosc = scanner.nextInt();
        int roznicaCiagu = scanner.nextInt();

        System.out.println(arytmetycznyCiag(wyrazPierwszy, dlugosc, roznicaCiagu));


    }

    public static List<Integer> arytmetycznyCiag (int wyrazPerwszy, int dlugosc, int roznicaCiagu){
        List<Integer> arytmetycznyCiag = new ArrayList<>();
        arytmetycznyCiag.add(wyrazPerwszy);
        for (int i = 1; i < dlugosc; i++) {
            arytmetycznyCiag.add(wyrazPerwszy + i*roznicaCiagu);
        }
        return arytmetycznyCiag;

    }


}
