package ZadankaOdSdaPartOne;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class TablicaMinMax {
    public static void main(String[] args) {
        int[] tablicaMinMax = new int[]{1,5,8,6,1,8,4,9,8,3,5,1};

        minimalnaMaxymalna(tablicaMinMax);
        System.out.println(NumberUtils.max(tablicaMinMax));


    }
    public static void minimalnaMaxymalna(int[] tablicaMinMax){
        Arrays.sort(tablicaMinMax);
        int min = tablicaMinMax[0];
        int max = tablicaMinMax[tablicaMinMax.length-1];
        System.out.println("Minimalna wartość to " + min + ", a maksymalna to " + max);
    }

}
