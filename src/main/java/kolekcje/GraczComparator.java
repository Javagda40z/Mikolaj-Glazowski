package kolekcje;

import java.util.Comparator;

public class GraczComparator implements Comparator<Gracz> {

    @Override
    public int compare(Gracz t1, Gracz t2) {
        return t1.getImie().compareTo(t2.getImie());
    }
}
