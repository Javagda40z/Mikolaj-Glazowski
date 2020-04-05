package ZadankaOdSdaPartOne;

public class MathUtils {
    public static boolean czyPierwsza(int liczba) {
        if (liczba == 2) {
            return true;
        }
        for (int i = 2; i < liczba; i++) {
          if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }



}

