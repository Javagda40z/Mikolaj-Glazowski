package Obiekty;

public class Catter implements Animal{
    private String imie;
    private int liczbaMyszyZjedzonych = 0;


    public Catter(String imie) {
        this.imie = imie;
    }

    public Catter(){

    }



    public void drap(){
        //kot drapie, np meble
    }

    public void eatMouse(){
        liczbaMyszyZjedzonych++;
        System.out.println("zjadłem " + liczbaMyszyZjedzonych + " myszy");
    }

    @Override
    public void makeSound() {
        System.out.println("Miał");

    }

    public int getLiczbaMyszyZjedzonych() {
        return liczbaMyszyZjedzonych*2;
    }

    @Override
    public void move() {
        System.out.println("DRAPIEMYYY!!!");
    }

    public String getImie() {
        return imie;
    }
}



