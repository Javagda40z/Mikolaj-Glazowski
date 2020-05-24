package wstepProgramowanieFunkcyjne;

public class AppProgFunk {
    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor();
        String nazwaZmiennej = "Somebody once told me";
        System.out.println(stringProcessor.process(nazwaZmiennej));

        StringOperation maleLitery = s -> s.toLowerCase();
        StringOperation wielkieLitery = input -> input.toUpperCase();
        StringOperation trzyPierwszeLitery = input -> input.substring(0, 3);

        stringProcessor.setStringOperation(wielkieLitery);
        System.out.println(stringProcessor.process(nazwaZmiennej));

        stringProcessor.setStringOperation(maleLitery);
        System.out.println(stringProcessor.process(nazwaZmiennej));

        stringProcessor.setStringOperation(trzyPierwszeLitery);
        System.out.println(stringProcessor.process(nazwaZmiennej));
    }
}
