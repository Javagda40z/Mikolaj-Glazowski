package Metody;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello");

        int a = 5;
        double b = 69.420;
        float c = 420;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a*b);

        double d = 3.17;
        a = (int) d;
        System.out.println(a);
        System.out.println(Addition(6,9));
        System.out.println(Deaddition(6,9));
        System.out.println(Mutiplication(6,9));
        System.out.println(Wubwubsrtaction(6,0));
        System.out.println(parzysta(4));
        System.out.println(parzysta(5));
    }

    public static int Addition (int a, int b){
        return a+b;
    }
    public static int Deaddition (int a, int b){
        return a-b;
    }
    public static int Mutiplication (int a, int b){
        return a*b;
    }
    public static double Wubwubsrtaction (int a, int b){
        return (double)a/b;
    }
    public static boolean parzysta (int a){
        return a%2 == 0;
    }
}
