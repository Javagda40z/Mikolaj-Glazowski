package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppPliki {
    public static void main(String[] args) {
//        try {
//            PrintWriter printWriter = new PrintWriter("file.txt");
//            printWriter.println("Somebody once told me");
//            printWriter.println("The world is gonna roll me");
//            printWriter.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        File file = new File("C:\\Users\\Hastur\\IdeaProjects\\Praktyka\\file.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
