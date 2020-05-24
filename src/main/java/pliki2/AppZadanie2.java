package pliki2;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppZadanie2 {
    public static void main(String[] args) {
        Path path = Paths.get("Piosenki.txt");
        System.out.println(path.toAbsolutePath());

        try {
            Files.readAllLines(path).forEach(s -> System.out.println(s));
            Files.lines(path).forEach(x -> System.out.println(x));
        } catch (IOException e) {
            e.printStackTrace();
        }

        path = Paths.get("file.txt");
        try {
            Files.write(path, "Jet Dobrze w ciul".getBytes());
            BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
