package ZadankaOdSdaPartOne;

import java.util.ArrayList;
import java.util.List;

public class CiagArytmetyczny {
    public static void main(String[] args) {
//        List<Integer> lista = new ArrayList<>();
//        lista.add(34);
//        lista.add(42);
//        System.out.println(lista);
        System.out.println(arytmetyczny(5, 1, 2));

    }
    public static List<Integer> arytmetyczny(int dlugosc, int pierwszyWyraz,int roznicaWyrazow){

        List<Integer> ciagArytmetyczny = new ArrayList<>();
        ciagArytmetyczny.add(pierwszyWyraz);
        for (int i = pierwszyWyraz; i < dlugosc; i++) {
            ciagArytmetyczny.add(pierwszyWyraz + i*roznicaWyrazow);
            }
        return ciagArytmetyczny;
    }



}
