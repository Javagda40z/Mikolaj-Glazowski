package ZadankaOdSdaPartOne;

public class Zadanerka {
    public static void main(String[] args) {
//        Zadanerka program = new Zadanerka();
//        program.tabliczkaMnozenia(6);
//        TabliczkaMnozenia tabliczkaMnozenia = new TabliczkaMnozenia(5);
//        System.out.println(tabliczkaMnozenia.getLiczba());
//        tabliczkaMnozenia.wypiszTaabliczke();
//
//
//        tabliczkaMnozenia = new TabliczkaMnozenia(10);
//        tabliczkaMnozenia.wypiszTaabliczke();
          System.out.println(sumaLiczb(1, 5));

    }
    public static void tabliczkaMnozenia(int liczba){
        System.out.println("Tabliczka mnożenia");
        for (int i=0;i<= 5; i++){
            System.out.println(liczba + " x " + i + " = " + liczba*i);
        }

    }

    public static int sumaLiczb(int x, int y){
        int suma = 0;
        for (int i = x; i <= y; i++) {
            suma = suma + i;
        }
        return suma;
    }
}
//5x1=5
//5x2=10
//5x3=15
//5x4=20