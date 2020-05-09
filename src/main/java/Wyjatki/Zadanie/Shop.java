package Wyjatki.Zadanie;

public class Shop {
    public Shop(int amountOfVodka) {
        this.amountOfVodka = amountOfVodka;
    }

    private int amountOfVodka;

    public void sellVodka(Person person) throws NotOldEnoughException, NoVodkaException {
        if (person.getAge() < 18) {
            throw new NotOldEnoughException("Jesteś za młody na alko");
        }
        if (amountOfVodka == 0) {
            throw new NoVodkaException("Nie mam wódy");
        }
        amountOfVodka--;
        System.out.println("Sprzedane");

    }
}
