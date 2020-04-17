package ZadankaDomowePartTwo;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeworkTablicaString {
    public static void main(String[] args) {
        String[] tablicaImion = new String[]{"mateusz", "kasia", "adam", "tomek", "andrzej"};

        zawartoscOrazRozmiar(tablicaImion);
        zmianaPierwszegoImienia(tablicaImion);
        zawartoscOrazRozmiarPoRedukcji(tablicaImion);
        zamianiaPierwszychLiterNaWielkie(tablicaImion);


    }

    public static void zawartoscOrazRozmiar (String[] tablicaDoWypisania){
        System.out.println(Arrays.toString(tablicaDoWypisania));
        System.out.println(tablicaDoWypisania.length);
    }

    public static void zmianaPierwszegoImienia( String[] tablicaPoZmianie){
        tablicaPoZmianie[0] = "piotr";
        System.out.println(Arrays.toString(tablicaPoZmianie));
    }

    public static void zawartoscOrazRozmiarPoRedukcji (String[] tablicaPoRedukcji){
        tablicaPoRedukcji = ArrayUtils.removeElement(tablicaPoRedukcji, "adam");
        System.out.println(Arrays.toString(tablicaPoRedukcji));
        System.out.println(tablicaPoRedukcji.length);
    }

    public static String[] zamianiaPierwszychLiterNaWielkie (String[] tablicaZMalymi){ //nie wiem, dlaczego to nie zwraca tablicy
        String[] tablicaZWielkimi = new String[0];
        for (String elementTablicy:tablicaZMalymi) {
            elementTablicy = elementTablicy.substring(0,1).toUpperCase() + elementTablicy.substring(1);
            tablicaZWielkimi = ArrayUtils.add(tablicaZWielkimi, elementTablicy);
        }
        return tablicaZWielkimi;
    }



}
