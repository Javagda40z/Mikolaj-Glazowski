package Obiekty;

public class TestyNaKotach {
    public static void main(String[] args) {
        Catter erwin = new Catter();
        System.out.println(erwin.getLiczbaMyszyZjedzonych());
        erwin.eatMouse();
        erwin.eatMouse();
        erwin.eatMouse();
        erwin.eatMouse();
        erwin.eatMouse();
        erwin.eatMouse();

        System.out.println(erwin.getLiczbaMyszyZjedzonych());
    }
}
