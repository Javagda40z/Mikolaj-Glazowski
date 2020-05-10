package TypyGeneryczne.ZadanieNaMiescie;

import java.util.List;

public class Miasto <T extends Mieszkaniec> {

    private String nazwa;
    private List<T> mieszkancy;

    public Miasto(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setMieszkancy(List<T> mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public List<T> getMieszkancy() {
        return mieszkancy;
    }


    public T znajdzMieszkancaPoImieniu(String imie) {
        for (T mieszkaniec : mieszkancy) {
            if (mieszkaniec.getImie().equals(imie)) {
                return mieszkaniec;
            }
        }
        return null;
    }
}
