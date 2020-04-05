package Metody;

public class Pentle {


    public static void main(String[] args) {
////        for (int i=0;i<101;i++) {
////            System.out.println(i);
////        }
//
////        for (int i=300;i<=1000;i++){
////            if (i%3==0){
////                System.out.println(i);
////            }
////        }
////        for (int i=123;i<=15000;i++){
////            if (i%3==0 && i%2==0){
////                System.out.println(i);
////            }
////        }
//        String napis = "Jestem na dobrej drodze dozostaniaprofesjonalnym programistą Java";
//
////        for (int i=1;i<=10;i++){
////            System.out.println("#" + i + ": " + napis);
////        }
////        for (int i=0;i<=napis.length();i++){
////            if(i%2==0){
////                System.out.print(napis.charAt(i));
////            }
////        }
//        for (int i=napis.length()-1;i>=0;i--){
//            System.out.print(napis.charAt(i));
//        }
        suma(1,2,69);
    }

    public static void suma (int a, int b, int c){
       int suma = 0;
       while (suma <c){
           suma = suma + a + b;
           System.out.println(suma);
       }

    }
}
