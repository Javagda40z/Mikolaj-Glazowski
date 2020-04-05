package Obiekty;

public class Doge implements Animal{

    public void aportuje(){
        //pies aportuje
    }

    @Override
    public void makeSound() {
        System.out.println("Bork");
    }
}
