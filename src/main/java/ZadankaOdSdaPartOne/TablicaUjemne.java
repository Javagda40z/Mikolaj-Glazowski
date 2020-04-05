package ZadankaOdSdaPartOne;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class TablicaUjemne {
    public static void main(String[] args) {
        int[] tablicaZUjemnymi = new int[]{5,-9,32,-98,3,-5,46,-1,9,-93,48};
        System.out.println(Arrays.toString(SprawdzanieUjemnych(tablicaZUjemnymi)));


    }

    public static int[] SprawdzanieUjemnych(int[] tablica){
        int[] tab = new int[0];
        for (int elementTablicy:tablica) {
            if (elementTablicy<0){
               tab = ArrayUtils.add(tab,elementTablicy);
            }
        }
        return tab;
    }




}

