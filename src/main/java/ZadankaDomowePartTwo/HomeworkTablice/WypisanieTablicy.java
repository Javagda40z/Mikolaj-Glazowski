package ZadankaDomowePartTwo.HomeworkTablice;

public class WypisanieTablicy {

    public static void wypisanieTablicyInt(int[] tablicaDoWypisania) {
        System.out.print("[");
        for (int i = 0; i < tablicaDoWypisania.length; i++) {
            if (i < tablicaDoWypisania.length-1) {
                System.out.print(tablicaDoWypisania[i] + ", ");
            } else {
                System.out.print(tablicaDoWypisania[i]);
            }
        }
        System.out.print("]\n");
    }

    public static void wypisanieTablicyString (String[] tablicaDoWypisania) {
        System.out.print("[");
        for (int i = 0; i < tablicaDoWypisania.length; i++) {
            if (i < tablicaDoWypisania.length-1) {
                System.out.print(tablicaDoWypisania[i] + ", ");
            } else {
                System.out.print(tablicaDoWypisania[i]);
            }
        }
        System.out.print("]\n");
    }


}
