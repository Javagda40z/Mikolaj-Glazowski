package Obiekty;

import java.util.ArrayList;
import java.util.List;

public class KlasaNaObiekty {
    public static void main(String[] args) {

        Animal zwierzarzeczki[] = new Animal[5];
        List<Animal> listaZwierzakow = new ArrayList<>();

        zwierzarzeczki[0] = new Catter();
        zwierzarzeczki[1] = new Catter();
        zwierzarzeczki[2] = new Cow();
        zwierzarzeczki[3] = new Doge();
        zwierzarzeczki[4] = new Doge();

        listaZwierzakow.add(new Doge());
        listaZwierzakow.add(new Doge());
        listaZwierzakow.add(new Catter());
        listaZwierzakow.add(new Catter());
        listaZwierzakow.add(new Cow());
        listaZwierzakow.add(new Cow());

        odglosPaszczowyDlaTablicy(zwierzarzeczki);
        odglosPaszczowyDlaListy(listaZwierzakow);
    }

    public static void odglosPaszczowyDlaTablicy(Animal[] zwierzaki){
        for (Animal animal:zwierzaki) {
            animal.makeSound();
        }

    }

    public static void odglosPaszczowyDlaListy(List<Animal> zwerzaki){
        for (Animal animal:zwerzaki             ) {
            animal.makeSound();
        }
    }
}
