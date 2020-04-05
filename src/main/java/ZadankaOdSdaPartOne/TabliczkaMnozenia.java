package ZadankaOdSdaPartOne;

public class TabliczkaMnozenia {
    private final int liczba;

    public TabliczkaMnozenia(int liczba) {
        super();
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }
    public void wypiszTaabliczke(){
        System.out.println("Tabliczka mnożenia");
        for (int i=0;i<= liczba; i++){
            System.out.println(liczba + " x " + i + " = " + liczba*i);
        }
    }
}
