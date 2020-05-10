package TypyGeneryczne.ZadanieNaMiescie;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMieszkancow {

    public static void main(String[] args) {
//        Miasto miasto = new Miasto("Cokolwiek");
//        List<Mieszkaniec> mieszkancyList = new ArrayList<>();
//        Mieszkaniec mieszkaniec = new Mieszkaniec();
//        Mieszkaniec mieszkaniec1 = new Mieszkaniec();
//
//        mieszkaniec.setIdMieszkanca(3);
//        mieszkaniec.setImie("Zygmunt Waza");
//
//        mieszkaniec1.setIdMieszkanca(2);
//        mieszkaniec1.setImie("Jan Paweł");
//
//        mieszkancyList.add(mieszkaniec);
//        mieszkancyList.add(mieszkaniec1);
//
//        miasto.setMieszkancy(mieszkancyList);
//
////        Miasto gdansk = new Miasto("Gdańsk");
////        Miasto gdynia = new Miasto("Gdynia");
//
//        Gdanszczanin gdanszczanin = new Gdanszczanin();
//        mieszkancyList.add(gdanszczanin);
//
//        Miasto<Gdanszczanin> gdansk = new Miasto<Gdanszczanin>("Gdańsk");
//        Miasto<Gdynianin> gdynia = new Miasto<Gdynianin>("Gdynia");
//
////        Miasto<Object> miastoObjektow = new Miasto<Object>("Obiekt")


        List<Double> doubles = new ArrayList<>();
        doubles.add(1.2);
        doubles.add(1.3);

        List<Integer> integers = Arrays.asList(1,2,3,4);

        System.out.println(sumowanieList(doubles));

        System.out.println(sumowanieList(integers));

        System.out.println(sumowanieList(Arrays.asList(1, 2, 3, 4)));
    }

    public static double sumowanieList(List<? extends Number> doubles) {
        double suma = 0.0;
        for (Number liczba :
                doubles) {
            suma += liczba.doubleValue();
        }
        return suma;
    }
}
