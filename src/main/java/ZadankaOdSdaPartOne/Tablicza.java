package ZadankaOdSdaPartOne;

import java.lang.reflect.Array;
import java.util.Arrays;

////Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
//Przykład:
//        zadana tablica [12, 7, 19]
//        wynik [19, 7, 12]
public class Tablicza {
    public static void main(String[] args) {
//        int[] tablica = new int[]{1,2,3};
//        System.out.println(Arrays.toString(tablica));
//        zamienPierwszyTrzeciElement(tablica);
//        System.out.println(Arrays.toString(tablica));
        int[] nieposortowanaTablica = new int[]{1,2,3,2,4,1};
        System.out.println(Arrays.toString(nieposortowanaTablica));
        Arrays.sort(nieposortowanaTablica);
        System.out.println(Arrays.toString(nieposortowanaTablica));
    }
    public static void zamienPierwszyTrzeciElement(int [] tablica){
        int zmienna = tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = zmienna;
    }
}
