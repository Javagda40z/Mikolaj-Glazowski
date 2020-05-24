package adnotacje;

public class Testowa {
    private String zmienna;

    public Testowa(String zmienna) {
        this.zmienna = zmienna;
    }

    public  void method(){
        System.out.println("To jest teraz zmienna: " + zmienna);
    }

    private void method2(){
        System.out.println("Prywatna metoda");
    }

    public void methoda3(int a){
        System.out.println("Metoda z intem: " + a);
    }
}
