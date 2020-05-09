package ZadaniaPowtorkowe.Samochod;

import ZadaniaPowtorkowe.Samochod.Car;

public class Test {

    public static void main(String[] args) {
        Car car1 = new Car("Torota", "Gorrolla");
        Car car2 = new Car("BMVV", "Gdzie jest kierunkowskaz??");

        System.out.println(car1.description());
        System.out.println(car2.description());

        Car[] cars = new Car[2];

        cars[0] = car1;
        cars[1] = car2;

        for (Car auto :
                cars) {
            System.out.println(auto.description());
        }
    }
}
