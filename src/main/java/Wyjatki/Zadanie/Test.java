package Wyjatki.Zadanie;

public class Test {

    public static void main(String[] args) {
        Shop shop = new Shop(2);
        Person person1 = new Person(17);
        Person person2 = new Person(27);


        try {
            shop.sellVodka(person2);
            shop.sellVodka(person1);
        } catch (NoVodkaException | NotOldEnoughException e) {
            e.printStackTrace();
        }
    }



}
