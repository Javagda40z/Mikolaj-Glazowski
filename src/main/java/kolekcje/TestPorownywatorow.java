package kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPorownywatorow {
    public static void main(String[] args) {

        Gracz gracz = new Gracz(3, "Zygmunt Waza");
        Gracz gracz1 = new Gracz(1, "Królowa jest tylko");
        Gracz gracz2 = new Gracz(2, "Jan Paweł");

        List<Gracz> gracze = new ArrayList<>();
        gracze.add(gracz);
        gracze.add(gracz1);
        gracze.add(gracz2);

        System.out.println("Przed sortowaniem");
        System.out.println(gracze);

        Collections.sort(gracze, new GraczComparator());
        System.out.println("Po sortoowaniu");
        System.out.println(gracze);




    }
}
