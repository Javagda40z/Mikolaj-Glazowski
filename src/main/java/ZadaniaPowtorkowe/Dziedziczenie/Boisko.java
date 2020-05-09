package ZadaniaPowtorkowe.Dziedziczenie;


import java.util.Arrays;
import java.util.List;

public class Boisko {
    public static void main(String[] args) {
        Bramkarz bramkarz = new Bramkarz();
        Pilkarz pilkarz = new Pilkarz();


        bramkarz.bronBramki();
        pilkarz.strzelBramke();

        bramkarz.kopnij();
        pilkarz.kopnij();

        Sprinter szybkiBramkarz = new Bramkarz();
        Sprinter szybkiPilkarz = new Pilkarz();

        szybkiBramkarz.sprint();
        szybkiPilkarz.sprint();

        niechWszyscySprinterzyBiegajaSprintem(Arrays.asList(szybkiBramkarz,szybkiPilkarz));
    }

    public static void niechWszyscySprinterzyBiegajaSprintem(List<Sprinter> sprinterList){
        for (Sprinter sprinter:
             sprinterList) {
            sprinter.sprint();
        }
    }
}
