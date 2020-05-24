package ZadaniaNaEnumach.Kalkulator;

public enum Operation {
    PLUS, MINUS, DODATKOWA_OPERACJA;

    double calculate(double a, double b) {
        switch (this) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            default:
                throw new AssertionError("Nieznana operacja " + this);

        }
    }
}
