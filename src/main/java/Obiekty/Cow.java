package Obiekty;

public class Cow implements Animal {

    public void dajeMleko(){
        //krowę można doić
    }

    @Override
    public void makeSound() {
        System.out.println("Móóóó");
    }
}
