package ZadankaDomowePartTwo.Czlowiek;

public class GigaCzlowiek extends Czlowiek {

    int czegokolwiek;

    public GigaCzlowiek(String imie, int wiek) {
        super(imie, wiek);
    }

    public int getCzegokolwiek() {
        return czegokolwiek;
    }

    public void setCzegokolwiek(int czegokolwiek) {
        this.czegokolwiek = czegokolwiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GigaCzlowiek that = (GigaCzlowiek) o;

        return czegokolwiek == that.czegokolwiek;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + czegokolwiek;
        return result;
    }
}
