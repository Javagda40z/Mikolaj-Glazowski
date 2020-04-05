package KlasaAbstrakcyjna;



public class Vet2 {

    public static void main(String[] args) {
        Animal2 kot = new Cat2("Erwin");
        Animal2 pies = new Doge2("Kajzerka");

        Vet2 weterynarz = new Vet2();
        weterynarz.sayHello(kot);
        weterynarz.sayHello(pies);

    }

    public void sayHello(Animal2 zwierze){
        System.out.println("witaj, " + zwierze.getImie());
    }
}
