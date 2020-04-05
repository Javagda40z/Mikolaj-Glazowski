package Obiekty;

public class Veterynarz {

    public static void main(String[] args) {
        Catter kot = new Catter("Erwin");
        Doge pies = new Doge("Euler");

        Veterynarz weterynarz = new Veterynarz();
        weterynarz.sayHello(pies);
        weterynarz.sayHello(kot);
    }

    public void sayHello(Catter catter){
        System.out.println("witaj, " + catter.getImie());
    }

    public void sayHello(Doge doge){
        System.out.println("Witaj, " + doge.getImie());
    }
}
