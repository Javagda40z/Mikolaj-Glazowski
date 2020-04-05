package Obiekty;

public class Doge implements Animal{

    private String imie;

    public void aportuje(){
        //pies aportuje
    }

    public Doge(){

    }

    @Override
    public void makeSound() {
        System.out.println("Bork");
    }

    @Override
    public void move() {
        System.out.println("DREPTAMYYY!!!");
    }

    public Doge(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }
}
