package ZadankaDomowePartTwo.HomeworkTablice;

public class HomeworkTablicaPodwojna {
    public static void main(String[] args) {
        int[] pierwszaTablica = new int[]{1,3,5,7};
        int[] drugaTablica = new int[]{2,3,4,5};
//        WypisanieTablicy.wypisanieTablicyInt(pierwszaTablica);
//        WypisanieTablicy.wypisanieTablicyInt(drugaTablica);
//        sumaTablic(pierwszaTablica,drugaTablica); //zadanie 8
        sumaTablicBezDubli(pierwszaTablica, drugaTablica);

    }

    public static void sumaTablic (int[] tablicaPierwsza, int[] tablicaDruga){
        int dlugosc = tablicaPierwsza.length + tablicaDruga.length;
        int[] tablicaPoDodaniu = new int[dlugosc];
        for (int i = 0; i < tablicaPierwsza.length; i++) {
            tablicaPoDodaniu[i]=tablicaPierwsza[i];
            tablicaPoDodaniu[i+tablicaPierwsza.length] = tablicaDruga[i];
        }
        WypisanieTablicy.wypisanieTablicyInt(tablicaPoDodaniu);
    }

    public static void sumaTablicBezDubli (int[] tablicaPierwsza, int[] tablicaDruga){
        int dlugosc = tablicaPierwsza.length + tablicaDruga.length;


        int[] tablicaPoDodaniu = new int[dlugosc];
        for (int i = 0; i < tablicaPierwsza.length; i++) {
            tablicaPoDodaniu[i]=tablicaPierwsza[i];
            tablicaPoDodaniu[i+tablicaPierwsza.length] = tablicaDruga[i];
        }
        WypisanieTablicy.wypisanieTablicyInt(tablicaPoDodaniu);
    }

}
