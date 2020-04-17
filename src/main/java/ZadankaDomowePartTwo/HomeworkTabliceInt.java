package ZadankaDomowePartTwo;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class HomeworkTabliceInt {
    public static void main(String[] args) {
        int[] tablicaDomowaJeden = new int[]{6,3,5,7,1,1,7,9};
        int[] tablicaDomowaDwa = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(sredniaTaablicy(tablicaDomowaJeden));
        wartoscMinimalnaMaxymana(tablicaDomowaJeden);
        System.out.println(sumaTablic(tablicaDomowaJeden, tablicaDomowaDwa));
        System.out.println(iloczynTablic(tablicaDomowaJeden, tablicaDomowaDwa));


    }

    public static float sredniaTaablicy (int[] tablica){
        float suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        return suma/tablica.length;
    }

    public static void wartoscMinimalnaMaxymana (int[] tablica){
        Arrays.sort(tablica);
        int min = tablica[0];
        int max = tablica[tablica.length-1];
        System.out.println(min + " " + max);
    }

    public static int[] sumaTablic (int[] tablica1, int[] tablica2){
        int[] tab = new int[8];
        if(ArrayUtils.isSameLength(tablica1,tablica2)){
            for (int i = 0; i < tablica1.length; i++) {
                tab[i] = tablica1[i] + tablica2[i];
            }
        }else return null;
        return tab;

    }

    public static int[] iloczynTablic (int[] tablica1, int[] tablica2){
        int[] tab = new int[8];
        if(ArrayUtils.isSameLength(tablica1,tablica2)){
            for (int i = 0; i < tablica1.length; i++) {
                tab[i] = tablica1[i] * tablica2[i];
            }
        }else return null;
        return tab;
    }


}
