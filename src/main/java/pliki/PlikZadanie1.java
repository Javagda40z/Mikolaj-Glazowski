package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class PlikZadanie1 {
    public static void main(String[] args) {
        List<String> listaPiosenek = Arrays.asList(
                "Savior",
                "GiveItAll",
                "Satelite",
                "Happy?",
                "BuiikiKaesu"
        );
        try {
            PrintWriter printWriter = new PrintWriter("Piosenki.txt");
            listaPiosenek.forEach(x -> printWriter.println(x));
//            printWriter.print(listaPiosenek);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
