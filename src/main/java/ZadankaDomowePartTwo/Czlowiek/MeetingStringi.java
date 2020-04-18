package ZadankaDomowePartTwo.Czlowiek;

public class MeetingStringi {
    public static void main(String[] args) {
        String zmienna1 = "tekst";
        String zmienna2 = new String("tekst");

//        System.out.println(zmienna1 == zmienna2);
//        System.out.println(zmienna1 + "\n" + zmienna2);
//        System.out.println(zmienna1.equals(zmienna2));

//        Czlowiek czlowiek1 = new Czlowiek("Mikołaj", 21);
//        Czlowiek czlowiek2 = new Czlowiek("Marek", 37);
//        Czlowiek czlowiek3 = new Czlowiek("Jan", 2);

        Czlowiek czlowiek4 = new MegaCzlowiek("NadMikołaj", 2100);
        Czlowiek czlowiek5 = new GigaCzlowiek("NadMikołaj", 2100);

        System.out.println(czlowiek4.equals(czlowiek5));



    }
}
